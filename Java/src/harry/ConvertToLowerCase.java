package harry;

import java.util.Scanner;

public class ConvertToLowerCase {

	public static void main(String[] args) {
		// Problem 2T
		
		/*String str = "OO What's going on ..."; str = str.toLowerCase();
		  str = str.replaceAll(" ", "_"); 
		  str = str.replaceFirst("_", "-"); // Successful I want a dash after oo ...great yaaar :) System.out.println(str);
		 */
		//Problem 3
	/*	String str = "Dear <|name|>, Thanks  a lot";
		str = str.replace("<|name|>", "Varun Patil");
		System.out.println(str);
		*/
		
		//Problem 4
		System.out.println("Taking a input");
		Scanner sc = new Scanner (System.in);
		String str= sc.nextLine();
		System.out.println(str);
		
		if (str.contains("   ")) {
			System.out.println("String contains 3 spaces and 2 spaces");
		}
		else if ( str.contains("  ")) {
			System.out.println("String contains 2 spaces ");
		}
		else {
			System.out.println("Neither 2 or 3 spaces");
		}
		//Second Method If retrun type is -1 then double or triple whatever is there in not present
		System.out.println(str.indexOf("   "));
		System.out.println(str.indexOf("  "));
		System.out.println(str.indexOf(" "));
		System.out.println(str.lastIndexOf(" ",10));
		// Problem Escape sequence character
		String letter = "Dear Sir,\n\tI am varun. I am just doing some coding type of thing, what you thing about coding yaar.\n\nThanks and Regards\nVarun Patil.";
		System.out.println(letter);
		
				
	}

}
