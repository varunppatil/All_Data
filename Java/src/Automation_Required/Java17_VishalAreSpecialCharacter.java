package Automation_Required;

import java.util.Arrays;

public class Java17_VishalAreSpecialCharacter {

	public static void main(String[] args) {
		String str = "Vis@$ha*^/l ar_+e";

		// Replace all non-alphanumeric characters with a space
		str = str.replaceAll("[^a-zA-Z0-9]", " ");

		// Replace multiple spaces with a single space & trim extra spaces
		str = str.replaceAll("\\s+", "").trim();

		System.out.println("Processed String: " + str);
		
		int index = str.indexOf('l');
		System.out.println(index);
		
		String [] newArr = str.split(" ");
		
		System.out.println(Arrays.toString(newArr));
				
	
	
	}
}
