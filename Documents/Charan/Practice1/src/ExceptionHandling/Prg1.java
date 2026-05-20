package ExceptionHandling;

public class Prg1 {
	
	public static void withdraw(int amount) {
		int balance = 5000;
		if (amount> balance) {
			throw new ArithmeticException("insufficient balance");
		}
		else {
			System.out.println("Withdraw success");
		}
	}
	
	public static void main(String [ ]args) {
		try {
			withdraw(5000);
			
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
