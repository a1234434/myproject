package com.java2.object;

//回去繼續
import java.util.Scanner;

public class ABTester {

	public static void main(String[] args) {
		String sercet = "8546";
		Scanner scanner = new Scanner(System.in);
		int result = 0;
		while (result != 40) {
			System.out.print("Please enter your guess:");
			// validate=驗證
			// ABNumber n =new ABNumber(scanner.nextLine());
			// result =n.validate(secret);
			System.out.print((result / 10) + "A" + (result % 10) + "B");
		}

	}

}
