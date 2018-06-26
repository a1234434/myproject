package com.java2.oo;
//網路上找到的
public class B {
	int[][] table = new int[5][5];
	
	public static void main(String[] args) {
		String str = new String();
		int table[][] = new int[5][5];// 定義一個五行五列的數組
		int i, j, e = 0, x = 0, bk = 0;

		while (e == 0) {
			x = (int) (Math.random() * 25) + 1;// 用x來接受隨機數
			bk = 1;
			for (i = 0; i < 5; i++) {
				for (j = 0; j < 5; j++) {// 判斷是否重復了
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
				if (bk == 2) 
					break;// 如果滿足條件控制程式for循環跳出來
			}
			int sum = 0;
			for (i = 0; i < 5; i++) {
				for (j = 0; j < 5; j++) {
					if (table[i][j] != 0)
						sum = sum + 1;// 統計數組中不是0的數的個數
				}
			}
			if (sum == 25) {
				e = 1;// 如果數據個數為25個則令e=1；那么此時while循環將會終止
		}


	}
		for (i = 0; i < 5; i++) {
			str = "";
			for (j = 0; j < 5; j++) {
				str = str + " " + table[i][j];
			}
			System.out.println(str);// 輸出數組數據
		}
}
}
