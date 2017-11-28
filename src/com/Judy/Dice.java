package com.Judy;

public class Dice {

	public static void main(String[] args) {
//		int n[]=new int[6];
		int n[] = {5,6,7,8,9,10,45,56,74,81};
//      int n[]=new int[]{5,6,7,8,9,10};
/*		n[0] = 5;
		n[1] = 6;
		n[2] = 7;
		n[3] = 8;
		n[4] = 9;
		n[5] = 10;
*/		
// n跟n.length是連動的，n有幾個，n.length就有幾個		
/*		for (int i = 0; i < n.length; i++) {
			System.out.println(n[i]);
		}
*/		
// for(int i:n)這個叫做for each; i會一個個帶入n的值		
		for(int i:n){
			System.out.println(i);
		}
	}

}
