
public abstract class Account {

	protected double balance;
	private int agency;
	private int number;
	private Customer accountHolder;
	private static int total = 0;
	
	public Account(int agency, int number) {
		
		Account.total++;
		
		this.agency = agency;
		this.number = number;
		
	}

	public abstract void deposit(double amount);
	
	public boolean withdraw(double amount) {
		
		if (balance >= amount) {
			
			balance -= amount;
			return true;
			
		}
		
		return false;
		
	}

	public boolean transfer(double amount, Account dest) {
		
		if (balance >= amount) {
			
			this.withdraw(amount);
			dest.deposit(amount);
			return true;
			
		}
		
		return false;
		
	}

	public double getBalance() {
		
		return balance;
		
	}

	public int getNumber() {
		
		return number;
		
	}
	
	public void setNumber(int number) {
		
		if (number <= 0) {
			
			System.out.println("The number must be greater than zero.");
			return;
			
		}
		
		this.number = number;
		
	}

	public int getAgency() {
		
		return agency;
		
	}
	
	public void setAgency(int agency) {
		
		if (agency <= 0) {
			
			System.out.println("Agency number must be greater than zero.");
			return;
			
		}
		
		this.agency = agency;
		
	}

	public Customer getAccountHolder() {
		
		return accountHolder;
		
	}

	public void setAccountHolder(Customer accountHolder) {
		
		this.accountHolder = accountHolder;
		
	}
	
	public static int getTotal() {
		
		return Account.total;
		
	}
	
}
