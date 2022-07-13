package com.biraneves.bb.bank.test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;

public class TestPrintStreamPrintWriter {

	public static void main(String[] args) throws IOException {
		
//		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));	// Best practice
		PrintStream ps = new PrintStream("lorem2.txt");
		
		ps.println("Lorem ipsum 3");
		ps.println();
		ps.println("A new line!");
				
		ps.close();

	}

}
