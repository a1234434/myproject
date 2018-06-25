package com.java2.threading;

public class HorseRunnablePractice implements Runnable{

	public void run() {
	for(int i=0;i<=5000;i++) {
		System.out.println("h3:"+i);
	}
}
}