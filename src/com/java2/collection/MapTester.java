package com.java2.collection;

import java.util.SortedMap;
import java.util.TreeMap;

public class MapTester {

	public static void main(String[] args) {
    SortedMap<String, Integer> name =new TreeMap<>();
    name.put("Omega", 24);
    name.put("Alpha", 1);
    name.put("Gamma", 3);

    System.out.print(name);
	}

}
