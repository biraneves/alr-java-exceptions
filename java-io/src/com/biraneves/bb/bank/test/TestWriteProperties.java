package com.biraneves.bb.bank.test;

import java.io.FileWriter;
import java.util.Properties;

public class TestWriteProperties {

	public static void main(String[] args) throws Exception {

		Properties props = new Properties();
		props.setProperty("login", "usuario");
		props.setProperty("password", "myPassword");
		props.setProperty("address", "biraneves.com");
		
		props.store(new FileWriter("conf.properties"), "Some comment.");

	}

}
