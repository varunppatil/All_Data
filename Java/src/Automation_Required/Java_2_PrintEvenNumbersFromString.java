package Automation_Required;

import java.util.Scanner;

public class Java_2_PrintEvenNumbersFromString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Even character to print for ");
		String text = sc.nextLine();
		// Here 0 is at 1st position which is odd
		for (int i=0; i<text.length()-1;i+=2) {		
			System.out.print(text.charAt(i+1));	
		}
		System.out.println();
		System.out.println("Odd character to print for ");
		String text2 = sc.nextLine();
		// Here 0 is at 1st position which is odd
		for (int i=0; i<text2.length()-1;i+=2) {		
			System.out.print(text2.charAt(i));			
		}
		

	}

}
