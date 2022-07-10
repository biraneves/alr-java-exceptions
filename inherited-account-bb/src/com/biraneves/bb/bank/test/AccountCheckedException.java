package com.biraneves.bb.bank.test;

import com.biraneves.bb.bank.model.*;

public class AccountCheckedException {

	public static void main(String[] args) {

		Account2 account = new Account2();
		
		try {
			
			account.deposit();
			
		} catch (MyException e) {
			
			System.out.println("Tratment...");
			
		}
		
	}

}
