package Automation_Required;

import java.util.Scanner;

public class Java_4_Factorial {

	public static void main(String[] args) {
		System.out.println("Calculate factorial of number: ");
		Scanner sc = new Scanner(System.in);
		int noForFact = sc.nextInt();
		int fact = 1;
		for (int i = noForFact; i > 0; i--) {
			fact = fact * i;
		}
		System.out.println("Factorial of number is: "+fact);
	}
}
