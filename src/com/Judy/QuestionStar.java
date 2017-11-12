package com.Judy;

import java.util.Scanner;

/*
 * 請使用者輸入一個數字,印出階梯形的星號 
 * 輸入6
 *
 **
 ***
 ****
 *****
 ******
 */
public class QuestionStar {

	public static void main(String[] args) {
		
		Scanner math =new Scanner(System.in);
		int x = 0, n;
		System.out.println("請輸入一個數字");
		n =Integer.parseInt(math.nextLine());
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++)
		if(i>=j)
		System.out.print("*");
        System.out.println();
		}
	
/*		 int c = 5 ; //設定要的層數
	        for(int a =1 ; a <= c ; a++)
	         {
	             for(int b = 1 ; b <=c ; b++ )
	              if(a>=b) //if迴圈裡a<=b直角在左上，a>=b直角在左下
	                    System.out.print("*");
	                 System.out.println();
	         }		
*/		

	}

}
