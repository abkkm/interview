package com.practice.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.practice.compare.Student;

public class HashMapHelper {

	public static Map<String, Integer> sortHashMapByValue(Map<String, Integer> testMap) {
		if (null == testMap || testMap.size() == 0) {
			return testMap;
		}
		Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();

		Set<Entry<String, Integer>> entrySet = testMap.entrySet();

		// Convert set to list
		List<Entry<String, Integer>> entryList = new ArrayList<Entry<String, Integer>>(entrySet);

		entryList.sort((o1, o2) -> o1.getValue().compareTo(o2.getValue()));

		for (Entry<String, Integer> entry : entryList) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}

		return sortedMap;

	}
	
	public static List<Student> java8SortList(List<Student> studentList){
		
		
			studentList.sort(Comparator.comparing(s -> s.get));
		
		if(sortBy == "marks") {
			studentList.sort(Comparator.comparingInt((Student::getMarks.getTotal).reversed()));
			
		}
		return studentList;
		
	}
}
