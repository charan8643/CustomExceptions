package Loops;

import java.util.Scanner;

public class Eligibilty {

	
	public static void main (String[]args) {
		Scanner s=new Scanner(System.in);
		
		int n= s.nextInt();
		
		if (n>18) {
			System.out.println("Eligible");
		}
		else {
			System.out.println("Not Eligible")	;
		}
	}
}
