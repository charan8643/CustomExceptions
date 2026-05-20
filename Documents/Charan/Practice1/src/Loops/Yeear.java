package Loops;

import java.util.Scanner;

public class Yeear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner s=new Scanner(System.in);
		
		int Leap= s.nextInt();
		
		if (Leap %400 ==0) {
			System.out.println("its Leap year");
			
		}
		else if(Leap %100 ==0) {
			System.out.println("its not Leap year");
		}
		else if (Leap %4 ==0) {
			System.out.println("Again its Leap year");
		}
	}

}
