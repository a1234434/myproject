package com.Judy;

public class ScoreArray {

	public static void main(String[] args) {
		//五個人（1、2、3、4、5）有三個成績(國、英、數)
       int n[][]=new int[5][3];
		n[0][0]=65;
		n[0][1]=85;
		n[0][2]=40;
		n[1][0]=75;
		n[1][1]=75;
		n[1][2]=20;
		n[2][0]=95;
		n[2][1]=65;
		n[2][2]=26;
		n[3][0]=67;
		n[3][1]=85;
		n[3][2]=40;
		n[4][0]=63;
		n[4][1]=84;
		n[4][2]=27;
//五個人,所以小於五(0,1,2,3,4)		
		for(int i=0;i<5;i++){
			System.out.print(n[i][0]+"\t"+n[i][1]+"\t"+n[i][2]+"\t");
//要分開前面成績跟平均			
			if(((n[i][0]+n[i][1]+n[i][2])/3)<60){
				System.out.println((n[i][0]+n[i][1]+n[i][2])/3+"*");
			}else{
				System.out.println((n[i][0]+n[i][1]+n[i][2])/3);
			}	
			
		}
		
	}

}


