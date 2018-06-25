package com.java2.snowing;

import java.awt.Canvas;
import java.util.Random;

public class SnowPractice extends Thread {
	int x;
	int y;
	Random random = new Random();
	private Canvas canvas;

	public SnowPractice(Canvas canvas) {
		this.canvas = canvas;
		x = random.nextInt(800);
		y = random.nextInt(600);
	}

	@Override
	public void run() {
		for (int i = 0; i < 600; i++) {
			y++;
			int movement = random.nextInt(3) - 1;
			x = x - movement;
			canvas.repaint();
//			System.out.println(new String(new char[x]).replace("\0", " ") + "雪");
			try {
				sleep(200);
				canvas.repaint();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}