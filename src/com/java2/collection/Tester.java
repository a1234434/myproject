package com.java2.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Tester {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(3);
		list.add(5);
		System.out.println(list);
		// Set不可以加重複的,因為如果重複的話,後面的會吃掉前面的
		// 於是就只會跑出一個了,而且他會幫你自動排序,你加入的順序不一定代表你印出來的順序
		Set<Integer> set = new HashSet<>();
		set.add(5);
		set.add(9);
		set.add(2);
		set.add(6);
		System.out.println(set);
		Set<String> set2 = new HashSet<>();
		set2.add("Amy");
		set2.add("Emily");
		set2.add("John");
		set2.add("Amy");
		System.out.println(set2);
		// HashMap他本身就不會按照順序印出,他有自己的一套方法
		Map<Integer, String> students = new HashMap<>();
		students.put(1, "Amy");
		students.put(2, "Belly");
		students.put(3, "Cindy");
		System.out.println(students);

	}

}
