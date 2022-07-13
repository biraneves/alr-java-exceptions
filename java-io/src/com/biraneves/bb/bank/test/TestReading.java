package com.biraneves.bb.bank.test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestReading {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("lorem.txt");
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		String line = br.readLine();
		
		System.out.println(line);
		
		br.close();
		
	}

}
