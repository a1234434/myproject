package com.java2.oo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 * 讀取bingo.txt的資料如下:
 * 25
 * 8,4,7,18,21,3,5,1,9,10
 * 
 * 25代表有5x5共25顆球,產生時就給亂數排列並列印出來
 * 如下:
 *  5 10 11  8 25
 * 13  6 21  4  1
 * 22 15 23 19  7
 *  2 20 18  3 14
 * 17  9 12 24 16
 */

public class BingoMain {

	public static void main(String[] args) {
		Bingo bingo = new Bingo();
		bingo.Bingo();
		try {
			FileReader fr = new FileReader("Bingo.txt");
			BufferedReader in = new BufferedReader(fr);
			String line = in.readLine();
			// String str;
			// int line=0 ;
			// while ((str = in.readLine()) != null) {
			// line++;
			//
			String[] token = line.split(",");
			int winnum = Integer.parseInt(token[0]);
			for (int i = 0; i < winnum; i++) {
				int wnu = Integer.parseInt(token[i]);
				bingo.wn.add(wnu);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
        bingo.Decide();
	}

}
