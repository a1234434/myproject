package com.java2.object;

public class PracticeABnumber {
	int result = 0;
	String number;

	public PracticeABnumber(String number) {
		this.number = number;
	}

	public int validate(String secret) {
		int len = secret.length();

			for (int i = 0; i < number.length(); i++) {
				char c = number.charAt(i);
				for (int j = 0; j < len; j++) {
					if (c == secret.charAt(j)) {
						if (j == i) {
							result = result + 10;
						} else {
							result += 1;
						}
						break;
					}
				}
			
		}
		return result;
	}
}