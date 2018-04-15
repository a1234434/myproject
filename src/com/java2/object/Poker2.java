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
/*    	cards.add(1);
    	cards.add(2);
    	cards.add(3);
    	cards.add(4);
    	cards.add(5);
    	cards.add(6);
    	cards.add(7);
    	cards.add(8);
    	cards.add(9);
    	cards.add(10);
    	cards.add(11);
    	cards.add(12);
    	cards.add(13);
    	cards.add(1);
    	cards.add(2);
    	cards.add(3);
    	cards.add(4);
    	cards.add(5);
    	cards.add(6);
    	cards.add(7);
    	cards.add(8);
    	cards.add(9);
    	cards.add(10);
    	cards.add(11);
    	cards.add(12);
    	cards.add(13);
    	cards.add(1);
    	cards.add(2);
    	cards.add(3);
    	cards.add(4);
    	cards.add(5);
    	cards.add(6);
    	cards.add(7);
    	cards.add(8);
    	cards.add(9);
    	cards.add(10);
    	cards.add(11);
    	cards.add(12);
    	cards.add(13);
    	cards.add(1);
    	cards.add(2);
    	cards.add(3);
    	cards.add(4);
    	cards.add(5);
    	cards.add(6);
    	cards.add(7);
    	cards.add(8);
    	cards.add(9);
    	cards.add(10);
    	cards.add(11);
    	cards.add(12);
    	cards.add(13);
    	*/
	}
    
    public Poker2() {
		for (int i =0 ; i < 53;i++) {
			//直接add0-52的數字,比我自己想的簡單多了
			cards.add(i);
			System.out.println((i % 13) + 1 + "" + (flowers.charAt(i / 13)));
		}
	}

	public void shuffle() {
		
		for (int i = 0; i < 53; i++) {
			int n = number.nextInt(52)+1;
			int j=cards.get(i);
			int tem = j;
			j = n;
			n = tem;
		}
	}

	public void show() {
for (int i = 0; i < 53; i++) {
			int j= cards.get(i);
			System.out.println((j % 13) + 1 + "" + (flowers.charAt(j / 13)) + " ");
			if (i % 13 == 0) {
				System.out.println();
			}
		}
	}
	
}
