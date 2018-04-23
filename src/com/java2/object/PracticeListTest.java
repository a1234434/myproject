package com.java2.object;

import java.util.ArrayList;

public class PracticeListTest {

	public static void main(String[] args) {
  ArrayList<Integer> cards=new ArrayList<>();
  cards.add(8);
  cards.add(6);
  cards.add(4);
  System.out.println(cards.size());
		cards.set(1, 4);
		//cards.remove(2);
		System.out.println("removing number:"+cards.remove(2));
		System.out.println(cards.get(0));
	}

}
