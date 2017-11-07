package com.Judy;

import java.util.Scanner;

public class Question {

	public static void main(String[] args) {
/*
	問題:以下誰年紀最大?	
	1)周杰倫
	2)華晨宇	
	3)梁朝偉	
	答案為3	
	依使用者輸入資料判斷,並回應答對或答錯	
*/	
		
	System.out.println("以下誰年紀最大?");
	System.out.println("1)周杰倫");
	System.out.println("2)華晨宇");
    System.out.println("3)梁朝偉");
    Scanner scanner = new Scanner(System.in);
    String line = scanner.nextLine();
    int n = 3;
    if(n == 3){
    	System.out.println("答對囉!");
    }else{
    	System.out.println("答錯囉!");
    }
	}

}

     /*請使用者輸入一個數字,印出階梯形的星號
      * 輸入6
        *
        **
        ***
        ****
        *****
        ******
      */







