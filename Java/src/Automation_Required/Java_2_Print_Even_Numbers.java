package Automation_Required;

import java.util.Scanner;

public class Java_2_Print_Even_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Even numbers to print until");
		int numbToPrint = sc.nextInt();
		System.out.print(0);
		for (int i=2;i<=numbToPrint;i+=2) {			
			System.out.print(" "+i);
		}
		System.out.println();
		System.out.println("Number of even numbers");
		int numberOfEven = sc.nextInt();
		System.out.print(0);
		for(int i=1; i<(numberOfEven*2)-1;i+=2) {
			System.out.print(" "+(i+1));
		}
		
		
	}

}
