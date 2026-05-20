package Loops;

import java.util.Scanner;

public class Fibanoci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
Scanner s=new Scanner(System.in);
		
		int num= s.nextInt();
		
		int a=2 ;int b =5;
		for (int i=1;i<=num;i++) {
			System.out.print(a +" ");
			
			int c =a+b;
			a=b;
			b=c;
		}

	}

}
