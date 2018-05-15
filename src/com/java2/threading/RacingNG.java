package com.java2.threading;

//陽春版
public class RacingNG {

	public static void main(String[] args) {

		for(int i=0;i<=50000;i++){
			System.out.println("h1:"+i);
			System.out.println("h2:"+i);
		}
		
	}

}
