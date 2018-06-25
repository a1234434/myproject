package com.java2.snowing;

import java.awt.Canvas;
import java.util.ArrayList;
import java.util.List;

public class SnowTestPractice {

	public static void main(String[] args) {
        List<SnowPractice> snow1 =new ArrayList<>();
		for(int i =0;i<100;i++) {
			Canvas canvas =null;
		SnowPractice snow =new SnowPractice(canvas);
		snow.start();
		snow1.add(snow);
	}
	}
}
