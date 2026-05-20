package ExceptionHandling;

public class Ecommerce {
	
	public static void Shop(int stock, boolean status) {
		
		if (stock <=0) {
			throw new RuntimeException("No stock");
		}
		if(!status) {
			throw new ArithmeticException ("payment failed");
			}
			System.out.println("order placed");
		}
	
	
	public static void main(String []args) {
		try {
			Shop(0,false);
		}
		catch (ArithmeticException e) {
			System.out.println("status "+ e.getMessage());
		}
		catch (RuntimeException e) {
			System.out.println("stock" +e.getMessage());	
		}
		finally {
			System.out.println("happy shopping");
		}
	}

}
