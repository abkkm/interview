package com.abkkm.collection.list;

import java.util.Vector;

import org.junit.Test;

public class VectorTest {
	@Test
	public void test() {
		Vector<String> vector = new Vector<String>();
		vector.addElement(null);
		String item = vector.get(0);
		System.out.println(item);
	}
}
