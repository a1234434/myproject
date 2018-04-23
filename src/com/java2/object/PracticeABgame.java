package com.java2.object;

import java.util.Scanner;

public class PracticeABgame {

	public static void main(String[] args) {
		String secret = "7549";
		int a = 0;
		int b = 0;
		Scanner scanner = new Scanner(System.in);
		while (a != 4) {
			a=0;
			b=0;
			System.out.print("Please enter your guess number:");
			String num = scanner.nextLine();
			int le = secret.length();
			int len = num.length();
			for (int n = 0; n < len; n++) {
				char c = num.charAt(n);
				for (int i = 0; i < le; i++) {
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
