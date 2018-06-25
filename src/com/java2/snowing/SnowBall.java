package com.java2.snowing;

//網路上找到的,有機會要試試看作出這種模式的
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Panel;

public class SnowBall {

	public static void main(String[] args) {
		Frame frame = new Frame();
		frame.setBackground(Color.BLACK);
		frame.setSize(1024, 768);

		MyPanel myPanel = new MyPanel();
		frame.add(myPanel);

		Thread thread = new Thread(myPanel);
		thread.start();
		frame.show();
	}

}

class MyPanel extends Panel implements Runnable {

	int x[] = new int[30];
	int y[] = new int[30];

	public MyPanel() {
		for (int i = 0; i < 30; i++)

		{
			x[i] = (int) (Math.random() * 1024);
			y[i] = (int) (Math.random() * 768);

		}
	}

	@Override
	public void paint(Graphics g) {
		g.setColor(Color.WHITE);

		for (int i = 0; i < x.length; i++) {
			g.fillOval(x[i], y[i], 20, 20);
		}

	}

	@Override
	public void run() {

		while (true) {
			for (int i = 0; i < 30; i++) {
				y[i]++;
				if (y[i] > 768) {
					y[i] = 0;
				}
				
				try {
					Thread.sleep(3);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			repaint();

		}
	}
}