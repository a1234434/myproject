package com.Judy;

import java.util.Scanner;

public class Question {

	/*
	 * 問題:以下誰年紀最大? 
	 * 1)周杰倫 2)
	 * 華晨宇 
	 * 3)梁朝偉 
	 * 答案為3 
	 * 依使用者輸入資料判斷,並回應答對或答錯
	 */

	public static void main(String[] args) {

		Scanner question = new Scanner(System.in);
		int x;
		// String s =new String("輸入數字");
		System.out.println("問題:以下誰年紀最大?");
		System.out.println("1)周杰倫");
		System.out.println("2)華晨宇");
		System.out.println("3)梁朝偉");
		x = Integer.parseInt(question.nextLine());
		if (x == 3) {
			System.out.println("答對囉!");
		} else {
			System.out.println("答錯了!");

		}
	}

}
