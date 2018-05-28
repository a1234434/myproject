package com.java2.snowing;
//參考同學的,尚未了解
import java.awt.Canvas;
import java.util.Random;

public class Snow extends Thread{
	Random random = new Random();
	int x;
	int y = 800;
    private Canvas canvas;
	
    public Snow() {
		
	}
	public Snow(Canvas canvas) {
		x = random.nextInt(600);
		y=random.nextInt(800);
		this.canvas=canvas;
	}

	@Override
	public void run() {
		for (int i = 0; i < 800; i++) {
//			System.out.println(getName() + "(" + x + "," + y + ")");
			
			y = y + 1;
			int movement = random.nextInt(3) - 1;
			x = x - movement;
			System.out.print(new String(new char[x].toString()));
			System.out.println("雪");
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

