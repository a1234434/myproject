package com.java2.oo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Bingo {
	int winnum;
	int table[][] = new int[5][5]; // 定義一個五行五列的數組
	int bk;
	int end = 0;
	int x = 0;
	int i;
	int j;
	String s = new String();
	Set<Integer> bin = new HashSet();
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
		for (i = 0; i < 5; i++) {
			for (j = 0; j < 5; j++) {
				int x = -1;
				do {
					x = (int) ((Math.random() * 25) + 1);
				} while (!bin.add(x));
				table[i][j] = x;
			}
		}
		for (int n = 0; n < wn.size(); n++) {
			s = "";
			for (int y = 0; y < bin.size(); y++) {
				if (wn.get(n) == get(y)) {
					s = s + " " + bin.set(bin.get(y), Integer.parseInt("X"));
					break;
				} else {
					if (bin.get(y) < 10) {
						s = s + "  " + bin.get(y);
						break;
					} else {
						s = s + " " + bin.get(y);
						break;
					}
				}
			}
			System.out.println(s);
		}
	}
}