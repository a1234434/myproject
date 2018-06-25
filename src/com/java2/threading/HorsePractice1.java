package com.java2.threading;

public class HorsePractice1 extends Thread{
   public void run() {
	   for(int i=0;i<=5000;i++) {
		   System.out.println(getName()+":"+i);
	   }
   }
}
