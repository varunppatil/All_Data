package Automation_Required;

import java.util.Scanner;

public class Java_3_RemoveSpecialCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("String to replace special character");
		String str = sc.nextLine();
		
		String stringWithoutSpChar = str.replaceAll("[^a-zA-Z0-9]","");
		System.out.println("String without special character");
		System.out.println(stringWithoutSpChar);
	
	}

}
