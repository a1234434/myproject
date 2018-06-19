package com.java2.oo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VendingMachine {
	// total是指投入的初始金額
	int total = 0;
	List<Drink> drinks = new ArrayList<>();

	public void On() {
		Scanner money = new Scanner(System.in);
		Scanner beverage = new Scanner(System.in);
		System.out.println("請投入金幣或選擇飲料(1,2,3),或輸入0結束:");
		for (int i = 0; i < drinks.size(); i++) {
			Drink drink = drinks.get(i);
			System.out.println(drink.getId() + "\t" + drink.getName() + "\t" + drink.getPrice());
		}
		int m=Integer.parseInt(money.nextLine());
		int b=Integer.parseInt(beverage.nextLine());
		int data = -1;
		while (data != 0) {
			data = beverage.nextInt();
			switch (data) {
			case 0:
				break;
			}
		}
	}
}
