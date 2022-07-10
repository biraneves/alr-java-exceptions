
public class Manager extends Employee implements Authenticable {
	
	private AuthenticationUtil authenticator;

	public Manager() {
		
		authenticator = new AuthenticationUtil();
		
	}

	@Override
	public double getBonus() {
		
		return super.getSalary();
		
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
