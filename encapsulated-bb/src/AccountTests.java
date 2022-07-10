
public class AccountTests {

	public static void main(String[] args) {
		
		Account account = new Account(1337, 23334);
		
		account.deposit(200.0);
		
		System.out.println(account.getBalance());
		System.out.println("The total number of accounts is " + Account.getTotal());

	}

}
