package Automation_Required;

import java.util.HashMap;

public class Java_22_a2b3c4_print_aabbbcccc {

	public static void main(String[] args) {
		
		String s = "a2b3c4";
		
		//a- arr[0] //2 - arr[1]
		//b- arr[2] //3 - arr[3]
				
		char [] arr = s.toCharArray();
		HashMap<Character,Integer> hm = new HashMap<>();
		for(int i=0;i<arr.length;i+=2) {
			hm.put(arr[i], Character.getNumericValue(arr[i+1]));
		// we need a string to parse from character to int
		//	hm.put(arr[i], Integer.parseInt(String.valueOf(arr[i+1]))); 
		//	hm.put(arr[i], arr[i+1] - '0');
			for(int j=0;j<Character.getNumericValue(arr[i+1]);j++) {
				System.out.print(arr[i]);
			}	
		}
		
		

	}

}
