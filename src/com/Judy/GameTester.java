package com.Judy;

import java.util.Scanner;

/*
 * 算是有些頭緒了,記得回去處理
 * 0(起點)  1   2   3   4
 * 5       6   7   8   9
 * 10      11  12  13  14
 * 撞牆就扣30hp
 * 在格子內移動一步就扣5hp
 */

public class GameTester {

	public static void main(String[] args) {
		int n = 1;
		int HP = 100;
		int pos = 0;
		int row = 3;
		int col = 5;
		System.out.println("HP=100");
		do {
			System.out.print("請輸入一個方向:");
			Scanner game = new Scanner(System.in);
			n = Integer.parseInt(game.nextLine());
			switch (n) {
			case 8:
				System.out.println("向上");
				if(pos%5==0){
					pos=pos-col;
					HP=HP-5;
				}else{
					HP=HP-30;
				}
				break;
			case 4:
				System.out.println("向左");
/*				if(pos){
					
				}else{
					
				}
				break;
			case 6:
				System.out.println("向右");
				if(pos){
					
				}else{
					
				}
				break;
			case 2:
				System.out.println("向下");
				if(pos){
					
				}else{
					
				}
				break;

			case 0:
				System.out.print("So Sadddddd!");
				break;
*/
			}
			System.out.println("HP:" + HP);
		} while (n != 0);
	}
}
