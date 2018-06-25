package com.java2.collection;

import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;

public class MapTestPractice {

	public static void main(String[] args) {

		SortedMap<String, Integer> map =new TreeMap<>();
		map.put("Omega", 24);
		map.put("Alpha", 1);
		map.put("Gamma", 3);
/* 網路上找到的
 for (Entry<StringBuilder, Integer> entry : wordCountMap.entrySet()) {
	    String key = entry.getKey().toString();
	    Integer value = entry.getValue();
	    System.out.println("key, " + key + " value " + value);
	}		
	*/
		for(Entry<String, Integer> entry :map.entrySet()) {
			String name =entry.getKey().toString();
			Integer value =entry.getValue();
			System.out.println(name+"="+value);
		}
	}

}
