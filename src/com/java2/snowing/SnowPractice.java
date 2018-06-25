package com.java2.snowing;

import java.util.Random;

public class SnowPractice extends Thread {
	int x;
	int y;
	Random random = new Random();

	public SnowPractice() {
		x = random.nextInt(800);
		y = 0;
	}

	@Override
	public void run() {
		for (int i = 0; i < 600; i++) {
			y++;
			x = x+ random.nextInt(3) - 1;
			System.out.println(new String(new char[x]).replace("\0", " ") + "雪");
			try {
				sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}