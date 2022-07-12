package com.biraneves.bb.bank.test.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import com.biraneves.bb.bank.model.Account;
import com.biraneves.bb.bank.model.CheckingAccount;
import com.biraneves.bb.bank.model.Customer;
import com.biraneves.bb.bank.model.SavingsAccount;

public class TestLambdaMethods {

	public static void main(String[] args) {

		Account acc1 = new CheckingAccount(22, 33);
		acc1.setAccountHolder(new Customer("Nico"));
		acc1.deposit(333.0);
		
		Account acc2 = new SavingsAccount(22, 44);
		acc2.setAccountHolder(new Customer("Guilherme"));
		acc2.deposit(444.0);
		
		Account acc3 = new CheckingAccount(22, 11);
		acc3.setAccountHolder(new Customer("Paulo"));
		acc3.deposit(111.0);
		
		Account acc4 = new SavingsAccount(22, 22);
		acc4.setAccountHolder(new Customer("Ana"));
		acc4.deposit(222.0);
		
		List<Account> list = new ArrayList<>();
		list.add(acc1);
		list.add(acc2);
		list.add(acc3);
		list.add(acc4);
				
		list.sort((a1, a2) -> a1.getNumber() - a2.getNumber());
		
		list.forEach((a) -> System.out.println(a));
		
		System.out.println("-------");
		
		list.sort((a1, a2) -> {
				
				String nameC1 = a1.getAccountHolder().getName();
				String nameC2 = a2.getAccountHolder().getName();
				
				return nameC1.compareTo(nameC2);

		});
		
		list.forEach((a) -> System.out.println(a + " - " + a.getAccountHolder().getName()));

		System.out.println("-------");
		
		Collections.sort(list);
		
		list.forEach((a) -> System.out.println(a + " $" + a.getBalance()));
		
	}

}
