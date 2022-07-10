
public class TestSystem {

	public static void main(String[] args) {
		
		Manager m1 = new Manager();
		m1.setPassword(2222);
		
		Administrator a1 = new Administrator();
		a1.setPassword(3333);
		
		Customer c1 = new Customer();
		c1.setPassword(2222);
		
		InternalSystem s1 = new InternalSystem();
		s1.authenticate(m1);
		s1.authenticate(a1);
		s1.authenticate(c1);
		
	}

}
