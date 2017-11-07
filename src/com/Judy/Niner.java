package com.Judy;

public class Niner {
	// 如何讓它印出所有99乘法還沒寫好,記得寫喔!(庭怡教我,理解了)
	public static void main(String[] args) {
		for (int n = 2; n <= 9; n++) {
			for (int i = 1; i <= 9; i++) {
				if ((n * i) < 10) {
					System.out.println(n +" x "  + i + " =  " + (n * i));
				} else {
					System.out.println(n + " x " + i + " = " + (n * i));
					
				}
				
			}
			System.out.println();
		}
		
		/*
		 * 這是我自己的想法 for(int k =1;k<=4;k++){ System.out.println("2 x " + k +
		 * " =  "+(2*k)); } for(int h =5;h<=9;h++){ System.out.println("2 x "+ h
		 * +" = "+(2*h)); }
		 */
		
	}

}
