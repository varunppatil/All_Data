package rahulShetty;

import java.util.ArrayList;

public class ArraylistPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			ArrayList<String> a = new ArrayList<String>();
			a.add("Varun");
			a.add("Name");
			a.add("Something");
			a.remove(1); // as we remove 1 then "Something" will be new member at 1.
		System.out.println( a.get(1));
		
		// String is an object an object that represent seq of character.
		String str1 = "Varun";
		String str2 = "SomeData"; //same string declaration (duplicate) is not possible
		
		String str4= new String ("Kaay");
		String str3= new String ("Kaay"); //we create object and allocate memory space and duplicate arer possible as we are providing new memory allocation. 
		
		String str = "Rahul Shetty Academy";
		String [] splited = str.split(" ");
		for (String s: splited) {
			System.out.println(s + " ");
			
		}
		char [] arryChar = str.toCharArray();
		for (char s1: arryChar) {
			System.out.print(s1 + " " );
		}
		String str5= "Your transaction is successful (256542)";
		
		String strarr  = str5.replaceAll("[^\\d]", "");
		System.out.println("\n"+ strarr);
		
		String xpath = "xpath|//input[@id='q']";
		String [] splitXpath = xpath.split("\\|");
		System.out.println(splitXpath[0] + " & " +splitXpath[1]);
	}

}
