package com.biraneves.bb.bank.test;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(new File("contas.csv"));
		
		while (scanner.hasNextLine()) {
			
			String line = scanner.nextLine();
			System.out.println(line);
			
//			String[] values = line.split(",");
//			System.out.println(Arrays.toString(values));
			
			Scanner lineScanner = new Scanner(line);
			lineScanner.useLocale(Locale.US);
			lineScanner.useDelimiter(",");
			
			String value1 = lineScanner.next();
			int value2 = lineScanner.nextInt();
			int value3 = lineScanner.nextInt();
			String value4 = lineScanner.next();
			double value5 = lineScanner.nextDouble();
			
			System.out.println(value1 + value2 + value3 + value4 + value5);
			
			lineScanner.close();
			
		}
		
		scanner.close();

	}

}
