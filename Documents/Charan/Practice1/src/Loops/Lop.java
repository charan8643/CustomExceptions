package Loops;

import java.util.Scanner;

public class Lop {

	public static void main(String[] args) {
		
Scanner s=new Scanner(System.in);
		
		int n= s.nextInt();
		if (n> 90) {
			System.out.println("cibil good");

	}
		else if(n>50) {
			System.out.println("cibil is normal");	
		}
		else  
		{
			System.out.println("worst");
		}
	}
}
