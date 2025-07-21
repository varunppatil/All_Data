package Automation_Required;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.*;

public class Java_Sapient {
	public static void main(String[] args) {
		//Integer [] a = {1,5,8,22,12,0,99,11,4};
		ArrayList<Integer> arr = new ArrayList(Arrays.asList(1,5,8,22,12,0,99,11,4,45101249));
		/*arr.add(1);
		arr.add(5);
		arr.add(8);
		arr.add(22);
		arr.add(12);
		arr.add(0);
		arr.add(99);
		arr.add(11);
		arr.add(4);*/
		//arr.toArray
		for (int i = 0; i < arr.size(); i++) {
			for (int j = 0; j < arr.size()-1; j++) {
				if(arr.get( j)>arr.get( j+1)) {
					int temp = arr.get( j);
					arr.set( j,arr.get( j+1));
					arr.set( j+1,temp);
				}
			}
			System.out.println(arr.toString());
		}
	}
}
