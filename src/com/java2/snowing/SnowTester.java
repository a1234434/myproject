package com.java2.snowing;
//參考同學的,尚未了解
import java.awt.Canvas;
import java.util.ArrayList;
import java.util.List;

public class SnowTester {


		public static void main(String[] args) {
			List<Snow> snows = new ArrayList<>();
			for (int s = 0; s < 100; s++) {
				Canvas canvas =null;
			    Snow snow =new Snow(canvas);
				snow.start();
				snows.add(snow);
			}
		}

}