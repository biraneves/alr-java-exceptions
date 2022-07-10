
public class InternalSystem {
	
	private int password = 2222;
	
	public void authenticate(Authenticable au) {
		
		boolean isAuthenticated = au.authenticate(password);
		
		if (isAuthenticated)
			System.out.println("You can access the system.");
		else
			System.out.println("You cannot access the system.");
		
	}

}
