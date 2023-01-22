package com.practice.collections;

import java.util.HashMap;
import java.util.Map;

public class CollectionsMain {
	public static void main(String[] args) {
		Map<String, Integer> scores = new HashMap<>();

		scores.put("David", 95);
		scores.put("Jane", 80);
		scores.put("Mary", 97);
		scores.put("Lisa", 78);
		scores.put("Dino", 65);

		System.out.println(scores);

		scores = HashMapHelper.sortHashMapByValue(scores);

		System.out.println(scores);

	}
}
