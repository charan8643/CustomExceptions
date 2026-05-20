package ExceptionHandling;

public class prgm2 {
	
	public static  void Depoist (int amount) {
		int Amount = 45000;
	  	
		if(Amount <amount ) {
			throw new ArithmeticException("success");
			
		}else {
			System.out.println("SS");
		}
	}
	
	public static void main(String []args) {
		try {
			Depoist(76000);
			
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
