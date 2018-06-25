package com.java2.snowing;

import java.awt.Canvas;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

public class SnowFramePractice extends JFrame {
	SnowCanvas1 canvas = new SnowCanvas1();

	public SnowFramePractice() {
		setSize(850, 630);
		setLocation(500, 300);
		setVisible(true);
		add(canvas);
		canvas.repaint();
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	}

	public static void main(String[] args) {
		new SnowFramePractice();
	}
	public class SnowCanvas1 extends Canvas{
		List<SnowPractice> snows =new ArrayList<>();
		public SnowCanvas1() {
		for(int i=0; i<100;i++) {
			SnowPractice snow =new SnowPractice(this);
			snows.add(snow);
			snow.start();
		}
		}
		@Override
		public void paint(Graphics g) {
			for(int i=0;i<100;i++) {
				SnowPractice snow =snows.get(i);
				g.drawString("雪", snow.x, snow.y);
			}
		}
	}
}


