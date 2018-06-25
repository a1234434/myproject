package com.java2.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServerPractice {

	public static void main(String[] args) {

		try {
			ServerSocket server = new ServerSocket(9957);
			Socket socket = server.accept();
			System.out.println("Connect!");
			InputStream is = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader in = new BufferedReader(isr);
			String line = in.readLine();
			String token[] = line.split(":");
			String command = token[0];
			String option = token[1];
			System.out.println(command + "/" + option);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Eorror!");
		}

	}

}
