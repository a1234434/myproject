package com.java2.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.java2.collection.Main.GreekLetter;

public class MainPractice {

	public static void main(String[] args) {
		// <法一>
		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(0);
		list.add(1);
		list.add(7);
		System.out.println(list);
		// <法二>
		List<Integer> list1 = new ArrayList<>(Arrays.asList(2, 0, 1, 7));
		System.out.println(list1);

		// <法一>
		List<String> nameList = new ArrayList<>(Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red"));
		for (String i : nameList) {
			System.out.println(i);
		}
		// <法二>
		List<String> nameList1 = new ArrayList<>(Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red"));
		String[] strArray = nameList1.toArray(new String[0]);

		for (int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}

		// 注意點
		List<GreekLetter> letterList = new ArrayList<>();
		letterList.add(new GreekLetter("Gamma", 3));
		letterList.add(new GreekLetter("Omega", 24));
		letterList.add(new GreekLetter("Alpha", 1));

		Object[] objArray = letterList.toArray();

		for (int i = 0; i < objArray.length; i++) {
			System.out.println(objArray[i]);
		}
	}

	static class GreekLetter {
		private String letter;
		private Integer position;

		public GreekLetter(String letter, int position) {
			this.letter = letter;
			this.position = position;

		}

		public String toString() {
			return '{' + "letter='" + letter + "'" + ", position='" + position + "'" + '}';
		}
	}
}
