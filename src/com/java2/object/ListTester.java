package com.java2.object;

import java.util.ArrayList;
import java.util.List;
public class ListTester {

	public static void main(String[] args) {
        List<Integer> cards = new ArrayList<>();
		cards.add(8);
		cards.add(4);
		cards.add(9);
		cards.add(14);
		//cards.set(1,5)前面是位置,後面是數字,可以把原本在1位置的數字改變
		cards.set(1, 5);
		//cards.remove(1)是說移除掉1這個數字
		System.out.println("Removing number: "+cards.remove(1));
		//cards.size()是說有幾個
		System.out.println(cards.size());
		//cards.get(2)是說要2這個數字
		System.out.println(cards.get(2));
		
		
		
	}

}
