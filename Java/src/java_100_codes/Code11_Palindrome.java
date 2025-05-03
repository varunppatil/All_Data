package java_100_codes;

import java.util.*;

public class Code11_Palindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String stringToCheck = sc.nextLine();

		String reverseString = "";

		char ch;

		for (int i = stringToCheck.length() - 1; i >= 0; i--) {

			ch = stringToCheck.charAt(i);
			reverseString += ch;

		}
		if (reverseString.equals(stringToCheck)) {
			System.out.println("String is palindrome");
		} else
			System.out.println("String is not palindrome");

	}

}