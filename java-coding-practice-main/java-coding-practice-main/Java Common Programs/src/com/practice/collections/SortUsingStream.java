package com.practice.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortUsingStream {
	
	public static void main(String[] args) {
		Map<String,String> testMap = new HashMap<String,String>();
		
		testMap.put("key3","hello");
		testMap.put("key1","world");
		testMap.put("key2","example");
		
		testMap.forEach((k,v) -> {System.out.println(k + ":" + v);});
		
		//Sort the map by keys
		Map<String, String> result = testMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).
		collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new));
		System.out.println("First method sorting");
		result.forEach((k,v) -> {System.out.println(k + ":" + v);});
		
		//Sort the map by keys - another method - first sor the map by keys, then convert the stream in to a map and assign to a linkedHashmap
		//Order of insertion will be preserved in a linked hashmap
		
		Stream<Entry<String, String>> mapStream = testMap.entrySet().stream().sorted(Map.Entry.comparingByKey());
		Map<String, String> result1 =  mapStream.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		System.out.println("Second method sorting");
		result1.forEach((k,v) -> {System.out.println(k + ":" + v);});
		
		//Sort the map by value
		
		Map<String,String> result2 = testMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).
				collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new));
		System.out.println("Third method sorting");
		result2.forEach((k,v) -> {System.out.println(k + ":" + v);});
		
		//Sort the map by value - 2nd method
		
		//Step1 - get the map stream and sort it
		Stream<Entry<String, String>> mapStream2 = testMap.entrySet().stream().sorted(Map.Entry.comparingByValue());
		//Step2 - conver the stream to a map and store it in a linkedHashMap
		Map<String,String> result3 = new LinkedHashMap<String,String>();
		result3 = mapStream2.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		System.out.println("Forth type of sorting");
		result3.forEach((k,v) -> {System.out.println(k + ":" + v);});
		
		
		//Sort map using treeMap - entries will be automatically sorted when added to a treemap
		
		Map<String,String> treeMap = new TreeMap<String,String>();
		
		testMap.forEach((k,v) -> {treeMap.put(k, v);});
		System.out.println("Forth method sorting");
		treeMap.forEach((k,v) -> {System.out.println(k + ":" + v);});
	}

}
