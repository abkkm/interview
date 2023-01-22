package com.practice.collections ;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Stream;

public class MapOperations {
	
	public static void main(String[] args) {
		Map<String,String> testMap = new HashMap<String,String>();
		
		testMap.put("key1","hello");
		testMap.put("key2","world");
		testMap.put("key3","example");
		
		//1. Iterate thru a hashmap using for loop
		for(Entry<String, String> entry: testMap.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		//2.Iterate using an iterator
		Iterator<Entry<String, String>> itr = testMap.entrySet().iterator();
		while(itr.hasNext()) {
			Entry<String, String> nextEntry = itr.next();
			System.out.println(nextEntry.getKey() + " : " + nextEntry.getValue());
		}
		
		//3.Iterate a map using java8 foreach method
		testMap.forEach((key,val) -> {System.out.println(key + ":" + val);});
		
		//4.Iterate a map using stream API
		//First get a stream of the Map's entryset 
		Stream<Entry<String, String>> streamTestMap = testMap.entrySet().stream();
		
		//Then use foreach on the stream to iterate through the map's entryset
		streamTestMap.forEach((e) -> {System.out.println(e.getKey() + ":" + e.getValue());});
		
	}

}
 