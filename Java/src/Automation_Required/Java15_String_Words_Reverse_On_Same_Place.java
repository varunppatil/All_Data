package Automation_Required;

import java.util.*;

public class Java15_String_Words_Reverse_On_Same_Place {

	public static void main(String[] args) {

		String str = "Varun Premnath Patil";
	//	String str = "Hrishi Dada Aute";
		String[] arr = str.split(" ");
		String newStr = "";
		for (String each : arr) {
			for (int i = each.length() - 1; i >= 0; i--) {
				newStr = newStr + each.charAt(i);
			}
			newStr = newStr + " ";
		}
		newStr = newStr.trim();
		System.out.println(newStr);
	}

}
