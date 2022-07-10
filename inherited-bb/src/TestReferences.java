
public class TestReferences {

	public static void main(String[] args) {
		
		Manager m1 = new Manager();
		m1.setName("Marcos");
		m1.setSalary(5000.0);
		
		VideoEditor v1 = new VideoEditor();
		v1.setSalary(2500.0);
		
		Designer d1 = new Designer();
		d1.setSalary(2000.0);
		
		BonusControl bc = new BonusControl();
		bc.register(m1);
		bc.register(v1);
		bc.register(d1);
		
		System.out.println(bc.getSum());
		
	}

}
