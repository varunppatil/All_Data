package _200Questions;
import java.util.*;
import java.lang.*;


public class SortOnlyLast3Numbers {

	public static void main(String[] args) {
		
		int arr[] = {2,7,89,3333,67};
		
	//	Arrays.sort(arr,arr.length-3,arr.length);
	//	System.out.println(Arrays.toString(arr));
		
		Scanner sc = new Scanner(System.in);
		int lastNumbersToSort= sc.nextInt();
		int temp=0;
		//int min =arr[arr.length-lastNumbersToSort];
		for (int i=arr.length-lastNumbersToSort;i<arr.length;i++) {
			for (int j=arr.length-lastNumbersToSort;j<arr.length-1;j++) {
			if(arr[j]>arr[j+1]) {
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1] = temp;
			}
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
		
		
		

	}

}
