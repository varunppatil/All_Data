package Automation_Required;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.*;

public class Java_Sapient2 {
	public static void main(String[] args) {
		/*
		 * Input: deepa*%$#@ Output: "@a#p$e%e*d"
		 * 
		 * deepa %$#@
		 * 
		 * reverse -
		 * 
		 * @a#p lastSymbol:lastCharacter:SecondLast
		 */

		String str = "deepa*%$#@";

		String reverse = "";

		int indexChar = str.indexOf("a");
		for (int i = str.length() - 1; i >= (str.length()) / 2; i--) {

			// Character.isLetter()
			char ch = str.charAt(i);
			reverse = ch + reverse;

			for (int j = str.length() - 1; j >= (str.length()) / 2; j--) {
				char ch2 = str.charAt(indexChar);
				reverse = ch2 + reverse;

				indexChar--;
				break;
			
			}
		}
		System.out.println(reverse);

		StringBuffer bf = new StringBuffer(reverse);
		bf.reverse();
		System.out.println(bf);
	}
}
