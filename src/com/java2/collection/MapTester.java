package com.java2.collection;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class MapTester {

	public static void main(String[] args) {
//		Map第一題
//    SortedMap<String, Integer> map =new TreeMap<>();
//    map.put("Omega", 24);
//    map.put("Alpha", 1);
//    map.put("Gamma", 3);

//    System.out.println(map);
		
//		Map第二題,不知道為什麼不行過??
		Map<String, Integer> map = new TreeMap<>();
	    map.put("Gamma",  3);
	    map.put("Omega", 24);
	    map.put("Alpha",  1);
	    
	    for(Map.Entry<String, Integer> m: map.entrySet()) {
	    	System.out.println(m);
	    }
	    }
	    }
