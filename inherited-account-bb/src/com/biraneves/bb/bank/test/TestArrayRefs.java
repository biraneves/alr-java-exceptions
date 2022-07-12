package com.biraneves.bb.bank.test;

import com.biraneves.bb.bank.model.*;

public class TestArrayRefs {

	public static void main(String[] args) {

		Object [] refs = new Object[5];
		
		CheckingAccount acc1 = new CheckingAccount(22, 11);
		SavingsAccount acc2 = new SavingsAccount(22, 22);
		Customer customer = new Customer();
		
		refs[0] = acc1;
		refs[1] = acc2;
		refs[2] = customer;
		
		SavingsAccount ref = (SavingsAccount) refs[1];
		
		System.out.println(ref.getNumber());
		
	}

}
