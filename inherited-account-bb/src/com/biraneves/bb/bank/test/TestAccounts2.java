package com.biraneves.bb.bank.test;

import com.biraneves.bb.bank.model.*;

public class TestAccounts2 {

	public static void main(String[] args) {

		// This instance intends to throw an exception
		CheckingAccount account = null;
		account.deposit(200.0);
		
		// CheckingAccount instance
		CheckingAccount ca = new CheckingAccount(111, 111);
		ca.deposit(100.0);
		
		// SavingsAccount instance
		SavingsAccount sa = new SavingsAccount(222, 222);
		sa.deposit(200.0);

	}

}
