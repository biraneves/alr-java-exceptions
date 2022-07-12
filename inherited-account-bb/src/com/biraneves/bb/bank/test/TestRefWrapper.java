package com.biraneves.bb.bank.test;

import com.biraneves.bb.bank.model.*;

public class TestRefWrapper {

	public static void main(String[] args) {

		RefWrapper wrapper = new RefWrapper();
		
		Account acc1 = new CheckingAccount(22, 11);
		wrapper.add(acc1);
		
		Account acc2 = new CheckingAccount(22, 22);
		wrapper.add(acc2);
		
		int size = wrapper.getNumberOfElements();
		System.out.println(size);
		
		Account ref = (Account) wrapper.getRef(1);
		System.out.println(ref.getNumber());

	}

}
