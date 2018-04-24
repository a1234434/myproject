package com.java2.object;
//把Poker裡頭的陣列改成ArrayList

import java.util.ArrayList;
import java.util.Random;

public class Poker2 {
    Random number = new Random();
    ArrayList<Integer> cards =new ArrayList();
    String flowers = new String("SHDC");
    public void Poker2() {
    	ArrayList<Integer> cards =new ArrayList();
	}
    
    public Poker2() {
		for (int i =0 ; i < 52;i++) {
			//直接add0-51的數字,比我自己想的簡單多了
			cards.add(i);
			System.out.println((i % 13) + 1 + "" + (flowers.charAt(i / 13)));
		}
	}

	public void shuffle() {
		
		for (int i = 0; i < cards.size(); i++) {
			int n = number.nextInt(52);
			int j=cards.get(i);
			int h=cards.get(n);
			int tem = cards.get(i);
			j =cards.get(n);
			h = tem;
		}
	}

	public void show() {
for (int i = 0; i < cards.size(); i++) {
			int j= cards.get(i);
			System.out.println((j % 13) + 1 + "" + (flowers.charAt(j / 13)) + " ");
			if (i % 13 == 0) {
				System.out.println();
			}
		}
	}
	
}
