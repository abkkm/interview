package com.practice.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperations {

	public static void main(String[] args) {
		
		//Create a stream using of method
		Stream<String> stream = Stream.of("hello","world","example");
		
		//createStreamFromList
		List<Integer> intList =  Arrays.asList(5,2,64,343,3);
		Stream<Integer> stream2 = intList.stream();
		
		//createStreamFromArray
		String[] strArray = new String[] {"hello","world","example"};
		Stream<String> stream3 = Arrays.stream(strArray);
		
		//Multithreading using stream
		intList.parallelStream().forEach((e) -> parallelMethod(e));
		
		//Get count of distinct elements in a stream
		System.out.println("Count = " + stream3.distinct().count());
		
		//Convert a stream back to a list
		Stream<String> stream4 = Arrays.stream(strArray);
		List<String> backFromStream = stream4.collect(Collectors.toList());
		
		//Verify if the list contains an element using code before java8
		List<String> strList = Arrays.asList("str1","str2","str3","hello1","hello2");
		boolean contains = false;
		for(String str:strList) {
			if(str.contains("2")) {
				contains = true;
			}
		}
		
		//Verify if the list contains an element using java8 streams - note that no curly brackets are used in this scenario
		 contains = strList.stream().anyMatch(elem -> elem.contains("2"));
		 System.out.println("Contains value: " + contains);
		 
		 //Verify if all the elements of a stream contains something
		 
		 boolean allMatch = strList.stream().allMatch(elem -> elem.contains("2"));
		 System.out.println("allMatch value: " + allMatch);
		 
		 //Filter and create a new stream from one stream
		 Stream<String> filteredStream = strList.stream().filter(elem -> elem.contains("hello"));
		 List<String> filteredList = filteredStream.collect(Collectors.toList());
		 filteredList.forEach(e -> {System.out.println(e);});
		 
		 //Create a new stream after applying some functionality of existing stream - aka Mapping
		 //And convert the stream back to list
		 List<String> mappedList  = strList.stream().map(e -> e.toUpperCase()).collect(Collectors.toList());
		
		 mappedList.forEach(e -> {System.out.println(e);});
		 
		 //Same mapping using methods before java8
		 List<String> UpdatedList = new ArrayList<String>();
		 for(String str:strList) {
			 UpdatedList.add(str.toUpperCase());
		 }
		 for(String str:UpdatedList) {
			 System.out.println(str);
		 }
	}

	private static void parallelMethod(Integer e) {
		System.out.println(e+5);
	}

	
	

}
  