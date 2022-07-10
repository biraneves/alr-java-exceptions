package com.biraneves.bb.bank.model;

public class TaxCalculator {
	
	private double totalTax;
	
	public void register(Tributable t) {
		
		double amount = t.getTaxValue();
		this.totalTax += amount;
		
	}
	
	public double getTotalTax() {
		
		return totalTax;
		
	}

}
