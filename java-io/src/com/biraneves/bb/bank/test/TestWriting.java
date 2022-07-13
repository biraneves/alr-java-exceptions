package com.biraneves.bb.bank.test;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TestWriting {

	public static void main(String[] args) throws IOException {

		OutputStream fos = new FileOutputStream("lorem2.txt");
		Writer sw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(sw);
		
		String line = "Este é um teste!";
		bw.write(line);
		bw.newLine();
		
		bw.close();

	}

}
