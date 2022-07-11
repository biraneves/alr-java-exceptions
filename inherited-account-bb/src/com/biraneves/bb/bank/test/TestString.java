package com.biraneves.bb.bank.test;

public class TestString {

	public static void main(String[] args) {

		String name = "Alura";
		String other = new String("Alura");	// This is ok, but it is not a good practice.
		
		name.replace("A", "a");
		name.toLowerCase();
		System.out.println(name);
		
		String another = name.replace("A", "a");
		System.out.println(another);
		
	}

}
