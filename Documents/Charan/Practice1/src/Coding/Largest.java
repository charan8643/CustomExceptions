package Coding;

import java.util.Scanner;

public class Largest {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		int a= sc.nextInt();
		int c =sc.nextInt();
		
		if (a>c) {
			System.out.println("a is largest");
		}
				
		else {
			System.out.println("c"
					+ " is largest");
		}
	}

}
