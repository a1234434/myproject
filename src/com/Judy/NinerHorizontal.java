package com.Judy;

public class NinerHorizontal {

	public static void main(String[] args) {
		for (int n = 1;  n <= 9; n++){
	           for(int i = 2; i <=5; i++){
	        	  if((n * i) < 10){ 
	        	   System.out.print( i+ " x "+ n + " =  " + (n*i)+ "\t");   //"\(在enter鍵上面)t"=tab鍵,會讓他排整齊       	
	           } else {
	        	   System.out.print(i + " x "+ n + " = " + (n*i)+ "\t");
	           }
	        	
	           }
	          System.out.println();
			}
		 
	}

}
