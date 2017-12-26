package com.kao;
/*
https://litotom.com/fju1219/
情境是圖片,晚點去看
飲料販賣機模擬程式, 達成以下需求:
1. 使用鍵盤輸入投幣金額, 只能輸入1,5,10元的硬幣
2. 使用鍵盤選擇飲料, 有三種, 分別為”a”、”b”與”c”,代表15元、20元與30元飲料
3. 每次投幣後,應先印出販賣機目前投入的餘額
4. 當餘額足夠,且選擇其中一個飲料後, 必須印出目前扣除飲料金額後的餘額,並印出”DON!”
5. 當選擇一種飲料,而餘額不足時, 請出目前餘額, 並印出”BEEP!”, 代表不足額
6. 輸入0時, 結束Main類別的執行

自己做的
 */

import java.util.Scanner;

public class 期末練習 {

	public static void main(String[] args) {
		Scanner money =new Scanner(System.in);
		Scanner beverage =new Scanner(System.in);
		int m;
		int b;
		int sum=0;
        System.out.print("請投入金幣並選擇飲料(a,b,c):");
		m=Integer.parseInt(money.nextLine());
		b=Integer.parseInt(beverage.nextLine());
		int s=sum+m;
		System.out.print("目前餘額:"+s);
		
		
		
	}

}
