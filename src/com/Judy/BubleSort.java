package com.Judy;

public class BubleSort {
	// 尚未搞懂,回家繼續
	public static void main(String[] args) {
		int num[] = { 51, 23, 6, 15, 65 };
		//
		for (int n = 0; n < num.length - 1; n++) {
			for (int i = n + 1; i < num.length; i++) {
				if (num[n] > num[i]) {
					int tmp = num[n];
					num[n] = num[i];
					num[i] = tmp;
				}
			}
		}
		//
// for(int i:n)這個叫做for each; i會一個個帶入n的值
		for (int y : num) {
			System.out.print(y + " ");
		}

	}
}

// int i=1;i<num.length;i++
// int n =0;n<=num.length;n++
