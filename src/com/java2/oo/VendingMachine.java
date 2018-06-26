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
		
//		for (int i = 0; i < drinks.size(); i++) {
//			Drink drink = drinks.get(i);
//			System.out.println(drink.getId() + "\t" + drink.getName() + "\t" + drink.getPrice());
//		}
		System.out.println("販賣機餘額:" + total);
		int data = -1;
		while (data != 0) {
		System.out.print("請投入金幣(5,10,50)或選擇飲料(1,2,3),或輸入0結束:");
		Scanner s = new Scanner(System.in);
		int p = Integer.parseInt(s.nextLine());
			switch (p) {
			case 0:
				data=0;
				System.out.println("謝謝惠顧");
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
					Drink drink1 =drinks.get(0);
					System.out.println("DON!"+"你的飲料:"+drink1.getName());
					total = total - drink1.getPrice();
					System.out.println("販賣機餘額:" + total);
				} else {
					System.out.println("BEEP!");
					System.out.println("販賣機餘額:" + total);
				}
				break;
			case 2:
				if (total - b >= 0) {
					Drink drink2 = drinks.get(1);
					System.out.println("DON!"+"你的飲料:"+drink2.getName());
					total = total - drink2.getPrice();
					System.out.println("販賣機餘額:" + total);
				} else {
					System.out.println("BEEP!");
					System.out.println("販賣機餘額:" + total);
				}
				break;
			case 3:
				if (total - c >= 0) {
					Drink drink3 =drinks.get(2);
					System.out.println("DON!"+"你的飲料:"+drink3.getName());
					total = total - drink3.getPrice();
					System.out.println("販賣機餘額:" + total);
				} else {
					System.out.println("BEEP!");
					System.out.println("販賣機餘額:" + total);
				}
				break;
			}
		}
	}
}
