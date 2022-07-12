package com.biraneves.bb.bank.test;

import java.util.*;
import com.biraneves.bb.bank.model.*;

public class Test {

	public static void main(String[] args) {

		int[] ages = new int[5];
		String[] names = new String[5];
		
		int age = 29;
		
		Integer ageRef = Integer.valueOf(age);
//		int value = ageRef.intValue();	// 
		System.out.println(ageRef.doubleValue());

		String s = args[0];
//		Integer number = Integer.valueOf(s);
		int number = Integer.parseInt(s);
		System.out.println(number);	// Parsing
		
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(29);		// Autoboxing
		
	}

}
