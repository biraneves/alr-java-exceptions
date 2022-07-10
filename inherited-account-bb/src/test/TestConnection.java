package test;

public class TestConnection {
	
	public static void main(String [] args) {
		
		try (model.Connection con = new model.Connection()) {
			
			con.readData();
			
		} catch (IllegalStateException e) {
			
			System.out.println("Connection error.");
			
		}
		
	}

}
