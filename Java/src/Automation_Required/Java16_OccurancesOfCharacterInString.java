package Automation_Required;

import java.util.*;

public class Java16_OccurancesOfCharacterInString {

	public static void main(String[] args) {
		String str = "Varunpatil pimpale";
		HashMap<Character, Integer> hm = new HashMap<>();
		outer:for (int i = 0; i < str.length(); i++) {
			
			//But it is also character
		//	if (Character.isWhitespace(str.charAt(i))) {
		//		continue outer;}  
			if (!hm.containsKey(str.charAt(i))) {
				hm.put(str.charAt(i), 1);
			} 
			else {
				hm.put(str.charAt(i), hm.getOrDefault(str.charAt(i), 0) + 1);
			}
		}
		System.out.println(hm);
	}
}
