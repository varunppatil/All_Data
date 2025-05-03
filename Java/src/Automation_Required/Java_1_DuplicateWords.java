package Automation_Required;

import java.util.Arrays;

public class Java_1_DuplicateWords {

	public static void main(String[] args) {

		String str = "Tata,Swift,Audi,Mercedes,Tata,Swift,Audi,Renault";

		String[] arrayStr = str.split(",");

		String newArray = "";
		String s1;
		String s2;
		int count =0;
		for (String arr:arrayStr) {
			s1 = arr;
			for (int j =count + 1; j < arrayStr.length; j++) {
				s2 = arrayStr[j];
				if (s1.equals(s2)) {
				//	System.out.println(s1);
					newArray = newArray + "," + s1;
					
					if (newArray.startsWith(",")) {
						newArray = newArray.replace(",", "");
					}
					break;
				}
				count++;
			}
		}
		System.out.println(newArray);

	}

}
