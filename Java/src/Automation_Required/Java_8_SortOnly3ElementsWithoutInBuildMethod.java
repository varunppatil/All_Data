package Automation_Required;

import java.util.Arrays;
import java.util.Scanner;

public class Java_8_SortOnly3ElementsWithoutInBuildMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 52, 45, 78, 4, 47, 76, 12, 80, 7 };

		// if a[i] > a[j] 76 >12
		// var =a[j] =12
		// a[j] =a[i] =76

		// else
		// continue
		
		Scanner sc = new Scanner(System.in);
		
		int lastNoToSort =sc.nextInt();
		
		
		int var;
		for (int i = arr.length - lastNoToSort; i < arr.length; i++) {
			for (int j = i + 1; j <arr.length; j++) {
				if (arr[i] > arr[j]) {
					var = arr[j];
					arr[j] = arr[i];
					arr[i] = var;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
