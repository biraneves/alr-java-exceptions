package com.biraneves.bb.bank.model;

public class AccountWrapper {
	
	private Account[] refs;
	private int free;
	
	public AccountWrapper() {
		
		this.refs = new Account[10];
		free = 0;
		
	}
	
	public void add(Account ref) {
		
		this.refs[this.free] = ref;
		this.free++;
		
	}
	
	public int getNumberOfElements() {
		
		return this.free;
		
	}
	
	public Account getRef(int pos) {
		
		return this.refs[pos];
		
	}

}
