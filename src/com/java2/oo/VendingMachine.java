package com.java2.oo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VendingMachine {
	// total是指投入的初始金額
	int total = 0;
	int a = 25;
	int b = 30;
	int c = 25;
	List<Drink> drinks = new ArrayList<>();

	public void On() {
		System.out.println("請投入金幣(5,10,50)或選擇飲料(1,2,3),或輸入0結束:");
		Scanner s = new Scanner(System.in);
		int p = Integer.parseInt(s.nextLine());
		for (int i = 0; i < drinks.size(); i++) {
			Drink drink = drinks.get(i);
			System.out.println(drink.getId() + "\t" + drink.getName() + "\t" + drink.getPrice());
		}
		int data = -1;
		System.out.println("販賣機餘額:" + total);
		while (data != 0) {
			data = p;
			switch (data) {
			case 0:
				break;
			case 5:
				total = total + 5;
				System.out.println("販賣機餘額:" + total);
				break;
			case 10:
				total = total + 10;
				System.out.println("販賣機餘額:" + total);
				break;
			case 50:
				total = total + 50;
				System.out.println("販賣機餘額:" + total);
				break;
			case 1:
				if (total - a >= 0) {
					System.out.println("DON!");
					System.out.println("販賣機餘額:" + total);
					total = total - a;
				} else {
					System.out.println("BEEP!");
					System.out.println("販賣機餘額:" + total);
				}
				break;
			case 2:
				if (total - b >= 0) {
					System.out.println("DON!");
					System.out.println("販賣機餘額:" + total);
					total = total - b;
				} else {
					System.out.println("BEEP!");
					System.out.println("販賣機餘額:" + total);
				}
				break;
			case 3:
				if (total - c >= 0) {
					System.out.println("DON!");
					System.out.println("販賣機餘額:" + total);
					total = total - c;
				} else {
					System.out.println("BEEP!");
					System.out.println("販賣機餘額:" + total);
				}
				break;
			}
		}
	}
}
