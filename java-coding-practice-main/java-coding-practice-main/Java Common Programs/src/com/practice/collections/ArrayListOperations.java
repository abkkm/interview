package com.practice.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayListOperations {

	public static void main(String[] args) {
		System.out.println("Iterating through ArrayList using different methods");
		List<String> TestList = new ArrayList<String>();
		TestList.add("hello");
		TestList.add("world");
		
		//Iterate through list using index
		for(int i=0; i<TestList.size();i++) {
			System.out.println(TestList.get(i));
		}
		
		//Iterate through Iterator
		Iterator<String> itr = TestList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//Iterate through foreach
		for(String item:TestList) {
			System.out.println(item);
		}
		
		//Iterate through java8 method
		TestList.forEach((item) -> {System.out.println(item);});
		
		//Iterate through java8 stream
		List<String> testList2 = Arrays.asList("hello","world","example");
		
		Stream<String> testStream = testList2.stream();
		
		
		//Sort the stream and convert it back to List
		testList2 = testStream.sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		
		testList2.forEach((item) -> {System.out.println(item);});
		
		//Sort the stream in reverseorder and assign it back to list
		Stream<String> testStream2 = testList2.stream();
		
		testList2 = testStream2.sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		
		testList2.forEach((item) -> {System.out.println(item);});
		
	}
}