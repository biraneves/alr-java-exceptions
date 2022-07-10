package test;

public class TestAccounts {

	public static void main(String[] args) throws model.NotEnoughFundsException {

		model.CheckingAccount ca = new model.CheckingAccount(111, 111);
		ca.deposit(100.0);
		
		model.SavingsAccount sa = new model.SavingsAccount(222, 222);
		sa.deposit(200.0);
		
		ca.transfer(10.0, sa);
		
		System.out.println("CA: " + ca.getBalance());
		System.out.println("SA: " + sa.getBalance());

	}

}
