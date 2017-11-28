package com.Judy;

public class BubleSort {
//尚未搞懂,回家繼續
	public static void main(String[] args) {
          int num[]={51,23,6,15,65};
          for(int n =0;n<=num.length;n++){
	         for(int i=1;i<num.length;i++){
	        	 if(num[n]>num[i]){
	        		 int tmp=num[n];
	        		 num[n]=num[i];
	        		 num[i]=tmp;
//	        		 System.out.print(num[n]+" ");
	        		 break;
	        	 }else{
	        		 System.out.print(num[n]+" ");
	        		 break;
	        	 }
	         }
		
	}

}
}

//int i=1;i<num.length;i++
//int n =0;n<=num.length;n++

