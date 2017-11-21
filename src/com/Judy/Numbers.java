package com.Judy;

import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {
//		Scanner ma =new Scanner(System.in);
//		k=Integer.parseInt(ma.nextLine());
		int n;
		for (n = 1; n <= 25; n++) {
			if (n % 3 == 0)
				continue;

			System.out.println(n);

		}

		System.out.print("Please enter a number:");
		Scanner number = new Scanner(System.in);
		int i;
		i = Integer.parseInt(number.nextLine());
		int m = 1;
		while (m <= i) {
			System.out.print(m + " ");
			m = m + 1;
			if (m == 11) {
				break;
			}

		}

	}
}