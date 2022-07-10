package test;

public class TestTributables {

	public static void main(String[] args) {

		model.CheckingAccount ca = new model.CheckingAccount(222	, 333);
		ca.deposit(100.0);
		
		model.LifeInsurance li = new model.LifeInsurance();
		
		model.TaxCalculator tc = new model.TaxCalculator();
		tc.register(ca);
		tc.register(li);
		
		System.out.println(tc.getTotalTax());
		
	}

}
