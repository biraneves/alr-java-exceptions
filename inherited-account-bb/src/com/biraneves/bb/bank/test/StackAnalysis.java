package com.biraneves.bb.bank.test;

import com.biraneves.bb.bank.model.*;

public class StackAnalysis {

	public static void main(String[] args) {

		System.out.println("Main init");
		try {
			method1();
		} catch (ArithmeticException | NullPointerException e) {
			String msg = e.getMessage();
			System.out.println("Exception: " + msg);
			e.printStackTrace();
		}
		System.out.println("Main end");

	}
	
	public static void method1() {
		
		System.out.println("Method1 init");
		method2();
		System.out.println("Method1 end");
		
	}
	
	public static void method2() {
		
		System.out.println("Method2 init");
		
		for (int i = 1; i <= 5; i++) {
		
			System.out.println(i);
			
//				int a = i / 0;
			
			AccountException ae = null;
			ae.deposit(100.0);
			
		}
		
		System.out.println("Method2 end");
		
	}

}
