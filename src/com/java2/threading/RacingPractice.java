package com.java2.threading;

public class RacingPractice {

	public static void main(String[] args) {
     int h1;
     HorsePractice1 h2 =new HorsePractice1();
     h2.start();
     
     for(int i=0;i<=5000;i++) {
    	 System.out.println("h1"+":"+i);
     }
	}

}
