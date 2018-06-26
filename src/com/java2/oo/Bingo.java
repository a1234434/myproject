package com.java2.oo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Bingo {
	int winnum;
	int table[][] = new int[5][5]; // 定義一個五行五列的數組
	int bk;
	int end = 0;
	int x = 0;
	int i;
	int j;
	String s = new String();
	List<Integer> wn = new ArrayList<>();

	public Bingo(int winnum) {
		super();
		this.winnum = winnum;
	}

	public void setWinnum(int winnum) {
		this.winnum = winnum;
	}

	public int getWinnum() {
		return winnum;
	}

	public Bingo() {
	}

	public void Bingo() {
		while (end == 0) {
			x = (int) ((Math.random() * 25) + 1); // 用x來接受隨機數
			bk = 1;
			// 判斷是否重復了
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5; j++) {
					if (table[i][j] == x) {
						bk = 2;
						break;
					} else {
						if (table[i][j] == 0) {
							table[i][j] = x;
							bk = 2;
							break;
						}
					}
				}
				if (bk == 2) {
					break;// 如果滿足條件控制程式for循環跳出來
				}
			}
			int sum = 0;
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5; j++) {
					if (table[i][j] != 0) {
						sum = sum + 1;// 統計數組中不是0的數的個數
					}
				}
				if (sum == 25) {
					end = 1;// 如果數據個數為25個則令e=1；那么此時while循環將會終止
				}

			}
		}
		for (int i = 0; i < 5; i++) {
			s = "";
			for (int j = 0; j < 5; j++) {
				if (table[i][j] < 10) {
					s = s + "  " + table[i][j];
				} else {
					s = s + " " + table[i][j];
				}
			}
			System.out.println(s);
		}
	
	}

	public void Decide() {
		System.out.println("New Bingo!");
		for (int i = 0; i < wn.size(); i++) {
			s="";
			if (wn.get(i) == table[i][j]) {
				String a =Integer.toString(table[i][j]);
				s = s+" "+a.replace(a, "X");
			}
			    if (table[i][j] < 10) {
					s = s + "  " + table[i][j];
				} else {
					s = s + " " + table[i][j];
				}
			}
		System.out.println(s);
	}
}