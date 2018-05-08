package com.java2.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.naming.StringRefAddr;

public class Main {

	public static void main(String[] args) {
		// <法一>
		// List<Integer> list = new ArrayList<>();
		// list.add(2);
		// list.add(0);
		// list.add(1);
		// list.add(7);

		// <法二> 我忘記了(qaq),但又找到了(ovo)
		List<Integer> list = new ArrayList<>(Arrays.asList(2, 0, 1, 7));
		System.out.println(list);
//      第二個   		
//		List<String> nameList = new ArrayList<>(Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red"));

//		for (String name : nameList) {
//			System.out.println(name);
//		}
		
		List<String> nameList = new ArrayList<>(Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red"));

		String[] strArray = nameList.toArray(new String[0]);

	    for (int i = 0; i < strArray.length; i++) {
	      System.out.println(strArray[i]);
	    }


	}

}
