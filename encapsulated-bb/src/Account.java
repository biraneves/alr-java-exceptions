
public class Account {

	private double balance;
	private int agency;
	private int number;
	private Customer accountHolder;
	private static int total = 0;
	
	public Account(int agency, int number) {
		
		Account.total++;
		System.out.println("The number of accounts is " + Account.total);
		
		this.agency = agency;
		this.number = number;
		
		System.out.println("Creating account number " + this.number);
		
	}
	
	public void deposit(double amount) {
		
		if (amount > 0)
			this.balance += amount;
		
	}

	public boolean withdraw(double amount) {
		
		if (this.balance >= amount) {
			
			this.balance -= amount;
			return true;
			
		}
		
		return false;
		
	}

	public boolean transfer(double amount, Account dest) {
		
		if (this.balance >= amount) {
			
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
	
	public int getAgency() {
		
		return agency;
		
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
