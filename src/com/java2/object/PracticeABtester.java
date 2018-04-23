package com.java2.object;

import java.util.Scanner;

public class PracticeABtester {

	public static void main(String[] args) {
		String secret = "6985";
		Scanner scanner = new Scanner(System.in);
		int result = 0;
		
		while (result != 40) {
			System.out.print("Please enter the number:");
			PracticeABnumber p = new PracticeABnumber(scanner.nextLine());
			result=p.validate(secret);
			System.out.println((result / 10) + "A" + (result % 10) + "B");
		}
		
	}

}
