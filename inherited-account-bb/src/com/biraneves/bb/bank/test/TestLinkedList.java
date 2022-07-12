package com.biraneves.bb.bank.test;

import java.util.*;
import com.biraneves.bb.bank.model.*;

public class TestLinkedList {

	public static void main(String[] args) {

//		List<Account> list = new ArrayList<Account>();
		List<Account> list = new LinkedList<Account>();
//		List<Account> list = new Vector<Account>();
		
		Account acc1 = new CheckingAccount(22, 11);
		list.add(acc1);
		
		Account acc2 = new CheckingAccount(22, 22);
		list.add(acc2);
		
		Account acc3 = new CheckingAccount(22, 22);
		boolean exists = list.contains(acc3);
		
		System.out.println("Already exists? " + exists);
		
		for (Account acc : list) {
			
			System.out.println(acc);
			
		}

	}

}
