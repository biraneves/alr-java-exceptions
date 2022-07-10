
public class Customer implements Authenticable {

	private AuthenticationUtil authenticator;
	
	public Customer() {
		
		authenticator = new AuthenticationUtil();
		
	}
	
	@Override
	public void setPassword(int password) {
	
		authenticator.setPassword(password);
		
	}
	
	@Override
	public boolean authenticate(int password) {
		
		return authenticator.authenticate(password);
		
	}

}
