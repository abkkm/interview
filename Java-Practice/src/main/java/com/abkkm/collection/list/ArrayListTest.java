package com.abkkm.collection.list;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;


public class ArrayListTest {
	
	public int getArrayListCapaCity(ArrayList list) throws Exception{
	    Class c = Class.forName("java.util.ArrayList");
	    Field field = c.getDeclaredField("elementData");
	    field.setAccessible(true);
	    Object[] object = (Object[])field.get(list);
	    return object.length;
	}

	
	@Test
	public void test() throws Exception {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(1);
		for(int i = 0 ; i < 16 ; i++) {
			list.add(i);
			System.out.println(getArrayListCapaCity(list));
		}



	}
	
}
