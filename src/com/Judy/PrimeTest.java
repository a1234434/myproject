package com.Judy;

//搞不懂啊啊啊啊啊(崩潰

public class PrimeTest {

	public static void main(String[] args) {
		
		int n = 7;
		boolean prime = true;
		for (int i = 2; i < n; i++) {
			
			if (n % i == 0) {
				prime = false;
				break;
			}
		
			if (prime) {
				System.out.println(n);
				
			}

		}

	}

}