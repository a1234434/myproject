package com.java2.collection;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class SetTestPractice {

	public static void main(String[] args) {

		Set<String> set =new TreeSet<>(Arrays.asList("Gamma", "Alpha", "Omega"));
		System.out.println(set);
	

	Set<String> nameSet = new TreeSet<>(Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red"));
	for(String name : nameSet) {
		System.out.println(name);
	}
	}
}
