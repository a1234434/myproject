package com.Judy;

public class Niner {
//如何讓它印出所有99乘法還沒寫好,記得寫喔!
	public static void main(String[] args) {
		for (int n = 2; n <= 9; n++) {
			for (int i = 1; i <= 9; i++) {
				if ((2 * i) < 10) {
					System.out.println("2 x " + i + " =  " + (2 * i));
				} else {
					System.out.println("2 x " + i + " = " + (2 * i));
				}
			}
		}
		System.out.println();
		/*
		 * 這是我自己的想法 for(int k =1;k<=4;k++){ System.out.println("2 x " + k +
		 * " =  "+(2*k)); } for(int h =5;h<=9;h++){ System.out.println("2 x "+ h
		 * +" = "+(2*h)); }
		 */
	}

}
