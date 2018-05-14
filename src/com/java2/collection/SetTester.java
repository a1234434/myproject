package com.java2.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetTester {

	public static <E> void main(String[] args) {

		// 第一個
		// Set<String> set =new TreeSet<>(Arrays.asList("Gamma", "Alpha",
		// "Omega"));

		// System.out.println(set);

		Set<String> nameSet = new TreeSet<>(Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red"));
		for (String name : nameSet) {
			System.out.println(name);
		}
		Set<E> sort =(Set<E>) new TreeSet<>(Arrays.asList(6,"postgres","sqlite","oracle","mongodb","postgres","mssql")) ;
		for(E n : sort) {
		System.out.println(sort);
		}
	}
}

