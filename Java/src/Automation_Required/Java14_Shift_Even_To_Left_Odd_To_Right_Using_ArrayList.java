package Automation_Required;

import java.util.*;

public class Java14_Shift_Even_To_Left_Odd_To_Right_Using_ArrayList {

	public static void main(String[] args) {

		int[] arr = { 0,23, 56, 8, 0, 9, 3, 79, 9, 0, 0, 456, 35, 77, 63 };
		int start = 0, end = arr.length - 1;

		/*
		 * LinkedList<Integer> arrList = new LinkedList<Integer>();
		 * 
		 * for (int i = 0; i < arr.length; i++) {
		 * 
		 * if (arr[i] % 2 == 0) {
		 * 
		 * arrList.addFirst(arr[i]);
		 * 
		 * } else arrList.addLast(arr[i]); } System.out.println(arrList);
		 */
		int tmp = 0;
		while (start < end) {
			
			
			// I will reduce start or end if and only if I get 0 there as per condition - mhanje ekach start kinva end vadhtoy and dusra check krtoy condition true aahe ka ithe end aahe tsa variable

			System.out.println("Start:" + start + " End" + end);
			/*
			 * if(arr[start] % 2 == 0) { start++;
			 * 
			 * } else { tmp=arr[end]; arr[end]=arr[start]; arr[start] = tmp; end--; } }
			 */
			if (arr[end] == 0) {
				end--;
			} else {
				tmp = arr[end];
				arr[end] = arr[start];
				arr[start] = tmp;
				start++;
			}
		}
		System.out.println(Arrays.toString(arr));

	}
	/*
	 * for (int i = 0; i < arr.length; i++) {
	 * 
	 * if (arr[i] % 2 != 0) {
	 * 
	 * arrList.add(arr[i]);
	 * 
	 * } }
	 */

}

//Implement logic for adding from last 

/*
 * package Automation_Required;
 * 
 * import java.util.ArrayList;
 * 
 * public class Java14_Shift_Even_To_Left_Odd_To_Right_Using_ArrayList {
 * 
 * public static void main(String[] args) { int[] arr = { 23, 56, 8, 9, 3, 79,
 * 9, 456, 35, 77, 63 }; ArrayList<Integer> arrList = new
 * ArrayList<>(arr.length);
 * 
 * int evenIndex = 0; // Tracks where to insert the next even number
 * 
 * for (int num : arr) { if (num % 2 == 0) { // Add even numbers at the
 * beginning of the current list arrList.add(evenIndex, num); evenIndex++; }
 * else { // Add odd numbers at the end of the list arrList.add(num); } }
 * 
 * // Output the resulting ArrayList System.out.println(arrList); } }
 */
