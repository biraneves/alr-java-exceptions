package com.biraneves.bb.bank.model;

public class Customer {
	
	private String name;
	private String id;
	private String profession;
	
	public Customer(String name) {
		
		this.name = name;
		
	}
	
	public String getName() {
		
		return name;
		
	}
	
	public void setName(String name) {
		
		this.name = name;
		
	}

	public String getId() {
		
		return id;
		
	}
	
	public void setId(String id) {
		
		this.id = id;
		
	}

	public String getProfession() {
		
		return profession;
		
	}
	
	public void setProfession(String profession) {
		
		this.profession = profession;
		
	}
	
}
