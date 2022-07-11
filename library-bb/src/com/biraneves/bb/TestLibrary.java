package com.biraneves.bb;

import com.biraneves.bb.bank.model.*;

public class TestLibrary {

	public static void main(String[] args) {

		Account account = new CheckingAccount(123, 321);
		account.deposit(300.0);
		System.out.println(account.getBalance());

	}

}
