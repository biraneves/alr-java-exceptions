package com.biraneves.bb.bank.test.util;

import java.util.ArrayList;
import com.biraneves.bb.bank.model.*;

public class Test {

	public static void main(String[] args) {

		ArrayList<Account> list = new ArrayList<Account>();
		
		Account acc1 = new CheckingAccount(22, 11);
		list.add(acc1);
		
		Account acc2 = new CheckingAccount(22, 22);
		list.add(acc2);
		
		System.out.println(list.size());
		
		Account ref = list.get(0);
		System.out.println(ref.getNumber());
		
		list.remove(0);
		
		System.out.println("Size: " + list.size());
		
		Account acc3 = new CheckingAccount(33, 311);
		list.add(acc3);
		
		Account acc4 = new CheckingAccount(33, 322);
		list.add(acc4);
		
		for (int i = 0; i < list.size(); i++) {
			
			Account oRef = list.get(i);
			System.out.println(oRef);
			
		}
		
		System.out.println("-------------------");
		
		for (Account o : list) {
			
			System.out.println(o);
			
		}
		
	}

}
