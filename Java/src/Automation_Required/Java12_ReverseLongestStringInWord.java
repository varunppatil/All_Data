package Automation_Required;

import java.util.Arrays;

public class Java12_ReverseLongestStringInWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// array[0] array[1] array[2]
		// int indexMax =0;
		// for array[0]
		// if(array[i].length() > 0)
		// ' indexMax =i
		// Try first to with single for loop
		String str = "Vishal5353 Manohar Wani";
		String[] a = str.split("\\s");
		int indexMax = 0;
		int maxLength = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i].length() > maxLength) {
				maxLength = a[i].length();
				indexMax = i;
			}
		}
		String largeString = a[indexMax];
		String reverseLarge = "";
		for (int k = largeString.length() - 1; k >= 0; k--) {
			reverseLarge = reverseLarge + largeString.charAt(k);
			a[indexMax] = reverseLarge;
		}
		System.out.println(Arrays.toString(a));
	}
}
