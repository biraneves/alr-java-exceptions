package com.biraneves.bb.bank.model;

public class CheckingAccount extends Account implements Tributable {

	public CheckingAccount(int agency, int number) {
		
		super(agency, number);
		
	}

	@Override
	public void deposit(double amount) {
		
		super.balance += amount;

	}

	@Override
	public void withdraw(double amount) throws NotEnoughFundsException {
		
		double withdrawAmount = amount + 0.2;
		super.withdraw(withdrawAmount);
		
	}

	@Override
	public double getTaxValue() {
		
		return super.balance * 0.01;
		
	}
	
	public String toString() {
		
		String s = "CheckingAccount, Number: " + this.getNumber() + ", Agency: " + this.getAgency();
		
		return s;
		
	}
	
}
