package com.Judy;

public class Prime {

	public static void main(String[] args) {
		boolean prime = true;
		for (int n = 1; n < 1001; n++) {
			for (int i = 2; i < n; i++) {
				if (n % i == 0) {
					prime = false;
				}
				
			}

			if (prime) {
				System.out.println(n);
			}
		}
	}
}
