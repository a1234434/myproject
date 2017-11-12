package com.Judy;

import java.util.Scanner;

/*
 * 請使用者輸入一個數字，印出階梯型的星號+井字號  
如:  輸入6  
*#####  
**####  
***###  
*****##  
*****#  
******   

*/
public class QuestionStarMattress {

	public static void main(String[] args) {
		Scanner math = new Scanner(System.in);
		int X = 0, n;
		System.out.println("請輸入一個數字");
		n = Integer.parseInt(math.nextLine());
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i >= j) {
					System.out.print("*");
				} else {
					System.out.print("#");
				}

			}
			System.out.println();
		}

	}
}
