package com.java2.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainPractice {

	public static void main(String[] args) {
       //<法一>
		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(0);
		list.add(1);
		list.add(7);
		System.out.println(list);
	  //<法二>
		List<Integer> list1 =new ArrayList<>(Arrays.asList(2,0,1,7));
		System.out.println(list1);
		
		//<法一>
		List<String> nameList = new ArrayList<>(Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red"));
		for(String i : nameList) {
			System.out.println(i);
		}
		//<法二>
		List<String> nameList1 = new ArrayList<>(Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red"));
		String[] strArray = nameList1.toArray(new String[0]);
		
		for(int i=0;i<strArray.length;i++) {
			System.out.println(strArray[i]);
		}
		
	}

}
