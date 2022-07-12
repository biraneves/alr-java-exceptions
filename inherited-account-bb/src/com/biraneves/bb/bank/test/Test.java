package com.biraneves.bb.bank.test;

import java.util.*;
import com.biraneves.bb.bank.model.*;

public class Test {

	public static void main(String[] args) {

		int age = 29;
		Integer ageRef = Integer.valueOf(age);
		System.out.println(ageRef.doubleValue());
		
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.SIZE);
		System.out.println(Integer.BYTES);
		
		int value = ageRef.intValue();
		String s = args[0];
		int number = Integer.parseInt(s);
		System.out.println(number);
		
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(29);
		
	}

}
