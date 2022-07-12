package com.biraneves.bb.bank.model;

/**
 * A class that represents the structure of an account.
 * 
 * @author biraneves
 * @version 0.1.0
 *
 */

public abstract class Account extends Object implements Comparable<Account> {

	protected double balance;
	private int agency;
	private int number;
	private Customer accountHolder;
	private static int total = 0;
	
	/**
	 * Constructor to build an account from agency and number.
	 * 
	 * @param agency
	 * @param number
	 */
	
	public Account(int agency, int number) {
		
		Account.total++;
		
		this.agency = agency;
		this.number = number;
		
	}

	public abstract void deposit(double amount);
	
	/**
	 * Function to withdraw an amount from an account.
	 * 
	 * @param amount
	 * @throws NotEnoughFundsException
	 */
	
	public void withdraw(double amount) throws NotEnoughFundsException {
		
		if (this.balance < amount) {
			
			String msg = "Balance: $" + this.balance + "; amount: " + amount;
			throw new NotEnoughFundsException(msg);
			
		}
		
		this.balance -= amount;
		
	}

	public void transfer(double amount, Account dest) throws NotEnoughFundsException {
			
		this.withdraw(amount);
		dest.deposit(amount);
		
	}

	public double getBalance() {
		
		return balance;
		
	}

	public int getNumber() {
		
		return number;
		
	}
	
	public void setNumber(int number) {
		
		if (number <= 0) {
			
			System.out.println("The number must be greater than zero.");
			return;
			
		}
		
		this.number = number;
		
	}

	public int getAgency() {
		
		return agency;
		
	}
	
	public void setAgency(int agency) {
		
		if (agency <= 0) {
			
			System.out.println("Agency number must be greater than zero.");
			return;
			
		}
		
		this.agency = agency;
		
	}

	public Customer getAccountHolder() {
		
		return accountHolder;
		
	}

	public void setAccountHolder(Customer accountHolder) {
		
		this.accountHolder = accountHolder;
		
	}
	
	public static int getTotal() {
		
		return Account.total;
		
	}
	
	public String toString() {
		
		String s = "Account, Number: " + this.getNumber() + ", Agency: " + this.getAgency();
		
		return s;
		
	}
	
	@Override
	public boolean equals(Object ref) {
		
		Account acc = (Account) ref;
		
		if (this.agency == acc.agency && this.number == acc.number)
			return true;
		
		return false;
		
	}
	
	@Override
	public int compareTo(Account other) {
		
		return Double.compare(this.balance, other.balance);
		
	}
	
}
