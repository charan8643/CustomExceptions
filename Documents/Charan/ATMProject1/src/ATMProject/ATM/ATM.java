package ATMProject.ATM;

import java.util.Scanner;

import ATMProject.BankAccount.BankAccount;
import ATMProject.exceptions.DailyLimitException;
import ATMProject.exceptions.InsufficientBalnce;
import ATMProject.exceptions.InvalidPinException;

public class ATM {
	
	private final int correctpin =1234;
	
	private BankAccount account = new BankAccount();
	
	public void start() {
		Scanner sc =new Scanner(System.in);
		
		try {
			System.out.print("Enter pin : ");
			int pin =sc.nextInt();
			
			if(pin != correctpin) {
				throw new InvalidPinException("Wrong PIN");
			}
			
			System.out.println("Login successful");
			
			while(true) {
				System.out.println("\n1. check balance");
				System.out.println("2, withdraw");
				int choice =sc.nextInt();
			}
		}
		catch (InvalidPinException e) {
			System.out.println("Error :"+ e.getMessage());
		}
////		catch (InsufficientBalnce e) {
//			System.out.println("Error : "+ e.getMessage());
//		}
//		catch (DailyLimitException e) {
//			System.out.println("Error : "+ e.getMessage());
//	//	}
	}
}


