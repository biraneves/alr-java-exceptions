
public class CheckingAccount extends Account implements Tributable {

	public CheckingAccount(int agency, int number) {
		
		super(agency, number);
		
	}

	@Override
	public void deposit(double amount) {
		
		super.balance += amount;

	}

	@Override
	public boolean withdraw(double amount) {
		
		double withdrawAmount = amount + 0.2;
		return super.withdraw(withdrawAmount);
		
	}

	@Override
	public double getTaxValue() {
		
		return super.balance * 0.01;
		
	}
	
}
