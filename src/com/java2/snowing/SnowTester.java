package com.java2.snowing;
import java.util.ArrayList;
import java.util.List;

public class SnowTester {


		public static void main(String[] args) {
			List<Snow> snows = new ArrayList<>();
			for (int s = 0; s < 100; s++) {
				Snow snow = new Snow();
				snow.start();
				snows.add(snow);
			}
		}

}