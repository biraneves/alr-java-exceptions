package com.biraneves.bb.bank.test;

public class TestPrimitives {

	public static void main(String[] args) {

		int [] idades = new int[5];
		
		for (int i = 0; i < 5; i++) {
			
			idades[i] = i * i;
			
		}
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println(idades[i]);
			
		}
		
	}

}
