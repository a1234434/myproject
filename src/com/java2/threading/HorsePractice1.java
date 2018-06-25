package com.java2.threading;

public class HorsePractice1 extends Thread {
	public void run() {
		for (int i = 0; i <= 500; i++) {
			try {
				sleep(50);
				System.out.println(getName() + ":" + i);
			} catch (InterruptedException e) {
				// System.out.println(getName()+"啊啊中斷了");
				e.printStackTrace();
			}

		}
	}
}
