
public class Administrator extends Employee implements Authenticable {
	
	private AuthenticationUtil authenticator;

	public Administrator() {
		
		this.authenticator = new AuthenticationUtil();
		
	}

	@Override
	public double getBonus() {

		return 50.0;
		
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
