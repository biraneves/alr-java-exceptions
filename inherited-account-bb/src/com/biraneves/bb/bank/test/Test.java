package com.biraneves.bb.bank.test;

import java.util.*;
import com.biraneves.bb.bank.model.*;

public class Test {

	public static void main(String[] args) {

		int [] ages = new int[5];
		String [] names = new String[5];
		List numbers = new ArrayList();
//		List<int> numbers = new ArrayList<int>(); ==> It doesn't work!
//		List<Integer> numbers = new ArrayList<Integer>(); ==> It works!
		
		int age = 29;	// Integer
		Integer ageRef = new Integer(29);	// This is deprecated, but it was equivalent to the declaration above
		numbers.add(age);	// Autoboxing
		
	}

}
