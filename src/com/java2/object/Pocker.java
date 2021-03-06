package com.java2.object;
//老師的寫法,以搞懂

import java.util.Random;

public class Pocker {
	// 我的寫法
	// Random number =new Random();
	// int a[]=new int[52];
	// String flowers =new String("SHDC");
	
	Random number = new Random();
	int a[] = new int[52];
	String flowers = new String("SHDC");

	public Pocker() {
		for (int i = 0; i < a.length; i++) {
			a[i] = i;
			System.out.println((i % 13) + 1 + "" + (flowers.charAt(i / 13)));
		}
	}

	public void shuffle() {
		for (int i = 0; i < a.length; i++) {
			int n = number.nextInt(52);
			int tem = a[i];
			a[i] = a[n];
			a[n] = tem;
		}
	}

	public void show() {
		for (int i = 0; i < a.length; i++) {
			int cards = a[i];
			System.out.println((cards % 13) + 1 + "" + (flowers.charAt(cards / 13)) + " ");
			if (i % 13 == 0) {
				System.out.println();
			}
		}
	}

}
