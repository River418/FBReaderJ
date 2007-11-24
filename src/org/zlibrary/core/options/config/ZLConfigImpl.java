package org.zlibrary.core.options.config;

import java.util.*;

/**
 * ����� ������. ��� ������������ ��������� �����.
 * �������� ���� myData �������� ������ �����, �������
 * � �������� ������ �������������� �� �����.
 * @author �������������
 *
 */
/*package*/ class ZLConfigImpl implements ZLConfig {
	// public abstract void unsetValue(String group, String name);

	// public abstract  boolean isAutoSavingSupported() const = 0;
	// public abstract  void startAutoSave(int seconds) = 0;
	private Map<String, ZLGroup> myData;
	
	public ZLConfigImpl (){
		myData = new LinkedHashMap<String, ZLGroup>();
	}
	
	public Map<String, ZLGroup> getGroups(){
		return Collections.unmodifiableMap(myData);
	}
	
	public ZLConfigImpl (Map<String, ZLGroup> map){
		myData = map;
	}
	
	public void removeGroup(String group){
		if (myData.get(group) != null){
			myData.remove(group);
		}
	}

	public String getValue(String group, String name, String defaultValue){
		if (myData.get(group) != null){
			return myData.get(group).getValue(name, defaultValue);
		} else{
			return defaultValue;
		}
	}
	
	public void setValue(String group, String name, String value, String category){
		if (myData.get(group) != null){
			myData.get(group).setValue(name, value, category);
		} else {
			ZLGroup newGroup = new ZLGroup();
			newGroup.setValue(name, value, category);
							myData.put(group, newGroup);
		}
	}
	
	public void unsetValue(String group, String name){
		myData.get(group).unsetValue(name);
	}
	
	/**
	 * ����� ������ � ������
	 */
	public String toString(){
		StringBuffer sb = new StringBuffer();
		for (String categoryName : myData.keySet()){
			sb.append("" + categoryName + "\n\n" + myData.get(categoryName) + "\n");
		}
		return sb.toString();
	}   
}
