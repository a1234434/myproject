package com.java2.collection;

import java.util.SortedMap;
import java.util.TreeMap;

public class MapTestPractice {

	public static void main(String[] args) {

		SortedMap<String, Integer> map =new TreeMap<>();
		map.put("Omega", 24);
		map.put("Alpha", 1);
		map.put("Gamma", 3);
		
		System.out.println(map);
	}

}
