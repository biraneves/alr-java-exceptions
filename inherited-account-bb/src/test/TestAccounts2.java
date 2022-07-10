package test;

public class TestAccounts2 {

	public static void main(String[] args) {

		// This instance intends to throw an exception
		model.CheckingAccount account = null;
		account.deposit(200.0);
		
		// CheckingAccount instance
		model.CheckingAccount ca = new model.CheckingAccount(111, 111);
		ca.deposit(100.0);
		
		// SavingsAccount instance
		model.SavingsAccount sa = new model.SavingsAccount(222, 222);
		sa.deposit(200.0);

	}

}
