package Automation_Required;

import java.util.*;

public class Java19_Even_To_Left_Odd_To_Right_ArrayDeque {

	public static void main(String[] args) {

		int[] arr = { 23, 56, 8, 9, 3, 79, 9, 456, 35, 77, 63 };

	//	ArrayDeque<Integer> arrList = new ArrayDeque<Integer>();
		LinkedList<Integer> arrList = new LinkedList<Integer>();
		

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] % 2 == 0) {

				arrList.addFirst(arr[i]);

			}
			else if (arr[i] % 2 != 0) {

				arrList.addLast(arr[i]);

			}
		}

	

		
		System.out.println(Arrays.toString(arrList.toArray()));
		//System.out.println(arrList);
	}

}