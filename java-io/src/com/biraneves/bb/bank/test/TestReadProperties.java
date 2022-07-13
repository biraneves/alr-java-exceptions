package com.biraneves.bb.bank.test;

import java.io.FileReader;
import java.util.Properties;

public class TestReadProperties {

	public static void main(String[] args) throws Exception {

		Properties props = new Properties();
		props.load(new FileReader("conf.properties"));
		
		String login = props.getProperty("login");
		String password = props.getProperty("password");
		String address = props.getProperty("address");
		
		System.out.format("Login: %s, password: %s, address: %s%n", login, password, address);

	}

}
