package com.java2.snowing;

//依舊參考同學的,把它完整了,待會了解
import java.awt.Canvas;
import java.util.Random;

public class Snow extends Thread {
	Random random = new Random();
	int x;
	int y = 600;
	private Canvas canvas;

	public Snow(Canvas Canvas) {
		this.canvas = Canvas;
		x = random.nextInt(800);
		y = random.nextInt(600);
	}

	@Override
	public void run() {
		for (int i = 0; i < 600; i++) {
			// System.out.println(getName() + "(" + x + "," + y + ")");

			y = y + 1;
			int movement = random.nextInt(3) - 1;
			x = x - movement;
			// System.out.print(new String(new char[x].toString()));
			// System.out.println("雪");
			canvas.repaint();
			try {
				sleep(50);
				canvas.repaint();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
