package com.Judy;

//記得搞懂

public class DateOfYear {

	public static void main(String[] args) {
          int n =30;
          int i[]={31,28,31,30,31,30,31,31,30,31,30,31};
          for(int k=0;k<=i.length;k++){
			  if(n<=i[k]){
				  System.out.print(k+1+"月"+n+"日");
				  break;
			  }else{
				  n=n-i[k];
			  }
				 
		  }
		
		
		
	}
	}

