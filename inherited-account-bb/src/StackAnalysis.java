
public class StackAnalysis {

	public static void main(String[] args) {

		System.out.println("Main init");
		method1();
		System.out.println("Main end");

	}
	
	public static void method1() {
		
		System.out.println("Method1 init");
		try {
			method2();
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException");
		}
		
		System.out.println("Method1 end");
		
	}
	
	public static void method2() {
		
		System.out.println("Method2 init");
		
		for (int i = 1; i <= 5; i++) {
		
			System.out.println(i);
			
				int a = i / 0;
			
		}
		
		System.out.println("Method2 end");
		
	}

}
