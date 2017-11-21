package com.Judy;

import java.util.Scanner;

public class ScoreTester {

	public static void main(String[] args) {
		System.out.print("Please enter your score:");
		Scanner score =new Scanner(System.in);
		int s;
		s=Integer.parseInt(score.nextLine());
		int level = s / 10;
		switch (level) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("Failed");
			break;
		case 6:
			System.out.println("Passedd");
			break;
		case 7:
			System.out.println("Gooddd");
			break;
		case 8:
			System.out.println("Greatttt");
			break;
		case 9:
		case 10:
			System.out.println("Excellenttttt");
			break;
		}
	}

}
