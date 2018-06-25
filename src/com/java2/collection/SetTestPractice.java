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
	
//絕望還是解不出來qaq	
	
	Set<String> sorted =new TreeSet<String>();
	sorted.size();
	sorted.add("postgres");
	sorted.add("sqlite");
	sorted.add("oracle");
	sorted.add("mongodb");
	sorted.add("postgres");
	sorted.add("mssql");
	for(String sort :sorted) {
		System.out.println(sort);
	}
	}
}
