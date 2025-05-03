package Automation_Required;

import java.util.List;

public class Java_6_UpperToLowerAndLowerToUpper {

	public static void main(String[] args) {
		String str = "Varun Premnath Patil";
		String strCh = "";
		for (int i = 0; i < str.length(); i++) {
			if (Character.isUpperCase(str.charAt(i))) {
				strCh = strCh + Character.toLowerCase(str.charAt(i));
			} else if (Character.isLowerCase(str.charAt(i))) {
				strCh = strCh + Character.toUpperCase(str.charAt(i));
			} else
				strCh = strCh + " ";
		}
		System.out.println(strCh);

		char ch = '1';
		String str1 = "ABC";
		
		// 3 ways to convert char to String
		
		System.out.println(str1+ch);
		
		System.out.println(str1+ String.valueOf(ch));
		
		System.out.println(str1 + Character.toString(ch));
		
		
		
	}
}
