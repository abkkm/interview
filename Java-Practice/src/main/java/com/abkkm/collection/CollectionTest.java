package com.abkkm.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

import org.junit.Before;
import org.junit.Test;


public class CollectionTest {
	
	private List<String> list;
	
	
	@Before
	public void before() {
		list =  new ArrayList<String>(Arrays.asList("123","a123","b123"))  ;
	}
	
	@Test
	public void test() {
		list.removeIf(t -> t.contains("a"));
		list.removeIf(new Predicate<String>() {
			public boolean test(String t) {return t.contains("a");};
		});
		for( String s :list) {
			System.out.println(list);
		}
	}
}
