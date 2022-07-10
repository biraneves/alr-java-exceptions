package com.biraneves.bb.bank.test;

import com.biraneves.bb.bank.model.*;

public class TestWithdraw {

	public static void main(String[] args) {
		
		Account account = new CheckingAccount(123, 321);
		
		account.deposit(200.0);
		
		try {
			
			account.withdraw(400.0);
			
		} catch (Exception e) {
			
			System.out.println("Exception: " + e.getMessage());
			
		}
		
		System.out.println(account.getBalance());
		
	}

}
