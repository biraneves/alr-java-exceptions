package com.biraneves.bb.bank.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TestCopy {

	public static void main(String[] args) throws IOException {

		// Input stream
		InputStream fis = new FileInputStream("lorem.txt");
		Reader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		// Output stream
		OutputStream fos = System.out; // new FileOutputStream("lorem2.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		String line = br.readLine();
		
		while (line != null && !line.isEmpty()) {
			
			bw.write(line);
			bw.newLine();
			bw.flush();
			line = br.readLine();
			
		}
		
		br.close();
		bw.close();

	}

}
