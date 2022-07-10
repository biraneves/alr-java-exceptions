package test;

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
		} catch (model.MyException e) {
			String msg = e.getMessage();
			System.out.println("Exception: " + msg);
		}
		
		System.out.println("Method2 end");
		
	}
	
	public static void method2() throws model.MyException {
		
		System.out.println("Method2 init");
		
		throw new model.MyException("It really went wrong!");
		
//		System.out.println("Method2 end");
		
	}

}
