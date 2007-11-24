package org.test.zlibrary.options;

import junit.framework.TestCase;

import org.zlibrary.core.options.util.*;

/**
 * ����� �� Util �����, ��� ����� ������ ��������������� ��������
 * ����� 01 - ��� ����� �� �������������� ������ ZLColor
 * @author �������������
 *
 */
public class UtilTests extends TestCase {
	
	private ZLColor myColor;
	
	public void setUp(){
		myColor = new ZLColor ((short)176, (short)255, (short)0);
	}
	
	public void test01_toString(){
		assertEquals(myColor.toString(), "176,255,0");
	}
	
	public void test01_equals(){
		ZLColor zlc = new ZLColor ((short)176, (short)255, (short)0);
		assertTrue(zlc.equals(myColor));
	}
	
	public void test01_setColor(){
		//myColor.setColor((short)0, (short)1, (short)0);
		//assertEquals(myColor.toString(), "0,1,0");
	}
	
	public void test01_stringConstructor(){
		//myColor = new ZLColor("122,123,0");
		//assertEquals(myColor.toString(), "122,123,0");
	}
	
	public void test01_getIntValue(){
		assertEquals(myColor.getIntValue(), 176255000L);
	}
}
