
public class TestEmployee {
	
	public static void main(String [] args) {
		
		Manager bira = new Manager();
		bira.setName("Ubirajara Neves");
		bira.setId("123.456.789-10");
		bira.setSalary(5000.0);
		
		System.out.println(bira.getName());
		System.out.println(bira.getBonus());
		
		
	}

}
