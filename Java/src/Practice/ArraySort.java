package Practice;

import java.util.*;

public class ArraySort {
	public static void main(String[] args) {

		int[] arr = { 45, 23, 600, 2, 67, 12, 888, 9 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
