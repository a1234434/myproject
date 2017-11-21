package com.Judy;

import java.util.Scanner;

/*
 * 
 */

public class GameTester {

	public static void main(String[] args) {
		int n = 1;
		do {
			System.out.print("請輸入一個方向:");
			Scanner game = new Scanner(System.in);
			n = Integer.parseInt(game.nextLine());
			switch (n) {
			case 8:
				System.out.println("向上");
				break;
			case 4:
				System.out.println("向左");
				break;
			case 6:
				System.out.println("向右");
				break;
			case 2:
				System.out.println("向下");
				break;

			case 0:
				System.out.print("So Sadddddd!");
				break;

			}

		} while (n != 0);
	}
}
