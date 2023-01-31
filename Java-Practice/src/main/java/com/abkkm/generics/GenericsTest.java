package com.abkkm.generics;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class GenericsTest {
	

	@Test
	public void prepare() {

		ArrayList list = new ArrayList();
		list.add("123");
		list.add(123);
		for (Object object : list) {
			String s = (String)object;
			System.out.println(s.substring(1));
		}
	}
	

	@Test
	public void advantage() {

		ArrayList<String> list = new ArrayList<String>();
		list.add("123");
		String string = list.get(0);
	}
	
	
	
	
	
	
}
