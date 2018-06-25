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
		
		
	}

}
