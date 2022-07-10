package com.biraneves.bb.bank.test;

import com.biraneves.bb.bank.model.*;

public class TestConnection {
	
	public static void main(String [] args) {
		
		try (Connection con = new Connection()) {
			
			con.readData();
			
		} catch (IllegalStateException e) {
			
			System.out.println("Connection error.");
			
		}
		
	}

}
