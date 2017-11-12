package com.Judy;

public class Prime {

	public static void main(String[] args) {
		for (int n = 2; n <= 1000; n++) {
			boolean prime = true;
			for (int i = 2; i < n; i++) {
				if (n % i == 0) {
					prime = false;
					break;
				}
			}
			if (prime) {
				System.out.println(n);
			}
		}

	}
}
