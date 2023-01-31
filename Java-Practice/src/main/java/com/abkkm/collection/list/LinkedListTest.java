package com.abkkm.collection.list;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class LinkedListTest {
	@Test
	public void test() {
		LinkedList<String> list = new LinkedList<String>();
		list.add(0,"1");
		list.add("2");
		String string = list.get(1);
		System.out.println(string);
	}
}
