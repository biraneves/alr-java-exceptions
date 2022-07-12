package com.biraneves.bb.bank.test.util;

import java.util.*;

public class TestOtherWrappers {

	public static void main(String[] args) {

		Integer ageRef = Integer.valueOf(29);	// Autoboxing
		System.out.println(ageRef.intValue()); 	// Unboxing
		
		Double dRef = 3.2;	// This is the same as Double dRef = Double.valueOf(3.2)
		System.out.println(dRef.doubleValue());
		
		Boolean bRef = Boolean.FALSE;
		System.out.println(bRef.booleanValue());
		
		Number refNumber = Integer.valueOf(29);
		
		List<Number> list = new ArrayList<>();
		list.add(10);
		list.add(32.6);
		list.add(25.6f);
		
		for (Number n : list)
			System.out.println(n);
		
	}

}
