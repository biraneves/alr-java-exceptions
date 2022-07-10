package test;

import model.Account2;
import model.MyException;

public class AccountCheckedException {

	public static void main(String[] args) {

		model.Account2 account = new model.Account2();
		
		try {
			
			account.deposit();
			
		} catch (MyException e) {
			
			System.out.println("Tratment...");
			
		}
		
	}

}
