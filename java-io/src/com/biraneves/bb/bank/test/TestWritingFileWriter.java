package com.biraneves.bb.bank.test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TestWritingFileWriter {

	public static void main(String[] args) throws IOException {

//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));	// Best practice
		
		bw.write("Lorem ipsum 2");
		bw.newLine();
		
		bw.close();

	}

}
