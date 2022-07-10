
public class TestWithdraw {

	public static void main(String[] args) {
		
		Account account = new CheckingAccount(123, 321);
		
		account.deposit(200.0);
		account.withdraw(400.0);
		
		System.out.println(account.getBalance());
		
	}

}
