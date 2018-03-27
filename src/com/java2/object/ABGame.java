package com.java2.object;

import java.util.Scanner;

//回去繼續
public class ABGame {

	public static void main(String[] args) {
		String secret = "8546";
		// String nums = "1285";
		int a = 0;
		int b = 0;
		Scanner scanner = new Scanner(System.in);
		while (a != 4) {
			a = 0;
			b = 0;
			System.out.print("Please enter your guess:");
			String nums = scanner.nextLine();
			int length = secret.length();
			int len = nums.length();
			for (int n = 0; n < len; n++) {
				// charAt 使用方式：取出字串位置在索引為?的字元,看你選擇哪個位置。
				char c = nums.charAt(n);
				for (int i = 0; i < length; i++) {

					if (c == secret.charAt(i)) {
						if (i == n) {
							a++;
						} else {
							b++;
						}
						break;
					}
				}
			}
			System.out.println(a + "A" + b + "B");
		}
	}
}