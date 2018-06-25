package com.java2.threading;

public class RacingPractice2 {

	public static void main(String[] args) {

		HorsePractice1 h1 = new HorsePractice1();
		HorsePractice1 h2 = new HorsePractice1();
		HorsePractice1 h3 = new HorsePractice1();
        h1.start();
        h2.start();
        h3.start();
        try {
			h1.join();
			h2.join();
	        h3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Main 中斷了!!!");
		}
        System.out.println("Main end");
	}

}
