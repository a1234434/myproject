package com.java2.object;

//以搞懂
import java.util.Scanner;

public class ABTester {

	public static void main(String[] args) {
		String secret = "8546";
		Scanner scanner = new Scanner(System.in);
		int result = 0;
		while (result != 40) {
			System.out.print("Please enter your guess:");
			// validate=驗證
			ABNumber n = new ABNumber(scanner.nextLine());
			result = n.validate(secret);
			System.out.println((result / 10) + "A" + (result % 10) + "B");
		}

	}

}
