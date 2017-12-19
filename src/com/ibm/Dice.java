package com.ibm;

import java.util.Random;

/*
每一次擲出四顆骰子，類別執行後共擲10次，並印出結果，例如： (10分)
1 2 1 2
3 1 1 1
4 1 2 3
4 3 1 1
4 4 2 1
3 4 1 3
3 4 3 3
2 3 4 1
3 1 3 4
2 4 4 2

請在每次擲時，若四個點數都不一樣，印出星號，如下： (20分)
1 2 1 2
3 1 1 1
4 1 2 3 *
4 3 1 1
4 4 2 1
3 4 1 3
3 4 3 3
2 3 4 1 *
3 1 3 4
2 4 4 2
*/
public class Dice {

	public static void main(String[] args) {
		Random n = new Random();
		int a[] = new int[4];
		for (int j = 1; j < 11; j++) {
			for (int i = 0; i < a.length; i++) {
				a[i] = n.nextInt(6) + 1;
				System.out.print(a[i] + " ");
                
               
			}
			if(a[0]!=a[1]&&a[0]!=a[2]&&a[0]!=a[3]&&a[1]!=a[2]&&a[1]!=a[3]&&a[2]!=a[3]){
            	System.out.print("*");
            }
			System.out.println(" ");
		}
	}

}
