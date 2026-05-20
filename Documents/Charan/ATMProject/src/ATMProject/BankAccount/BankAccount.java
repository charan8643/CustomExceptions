package ATMProject.BankAccount;

import ATMProject.exceptions.DailyLimitException;
import ATMProject.exceptions.InsufficientBalnce;

public class BankAccount {
	
	private double balance =5000;
	private final double dailylimit = 4000;
	
	public double  getBalance() {
		return balance;
	}
	
	public void depoist (double amount) {
		balance += amount;
		System.out.println("Depoisted :" + amount);
	}

	public void withdraw(double amount) {
		throws InsufficientBalnce , DailyLimitException{
			
			if(amount > dailylimit) {
				throw new DailyLimitException("Daily limit excedded");
				
			}
			
			if (amount > balance) {
				throw new InsufficientBalnce("No amount");
			}
			
			balance -=amount;
			System.out.println("Withdraw :" + amount);
		}
	}
	
}
