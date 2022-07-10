
public class FlowWithTreatment {

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
		try {
			method2();
		} catch (MyException e) {
			String msg = e.getMessage();
			System.out.println("Exception: " + msg);
		}
		
		System.out.println("Method2 end");
		
	}
	
	public static void method2() throws MyException {
		
		System.out.println("Method2 init");
		
		throw new MyException("It really went wrong!");
		
//		System.out.println("Method2 end");
		
	}

}
