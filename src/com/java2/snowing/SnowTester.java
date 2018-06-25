package com.java2.snowing;

//依舊參考同學的,把它完整了,待會了解
import java.awt.Canvas;
import java.util.ArrayList;
import java.util.List;

public class SnowTester {

	public static void main(String[] args) {
		List<Snow> snows = new ArrayList<>();
		for (int s = 0; s < 150; s++) {
			Canvas canvas = null;
			Snow snow = new Snow(canvas);
			snow.start();
			snows.add(snow);
		}
	}

}