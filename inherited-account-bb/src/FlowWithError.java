
public class FlowWithError {

	public static void main(String[] args) {

		System.out.println("Main init");
		
		try {
			method1();
		} catch (ArithmeticException | NullPointerException e) {
			String msg = e.getMessage();
			e.printStackTrace();
		}
		
		System.out.println("Main end");
		
	}
	
	public static void method1() {
		
		System.out.println("Method1 init");
		method2();
		System.out.println("Mehotd2 end");
		
	}
	
	public static void method2() {
		
		System.out.println("Method2 init");
		
		method2();
		
		System.out.println("Method2 end");
		
	}

}
