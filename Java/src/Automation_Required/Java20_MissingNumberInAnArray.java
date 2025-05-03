package Automation_Required;

public class Java20_MissingNumberInAnArray {
	
	public static void main(String[] args) {
		int[] arr = { 1, 2, 4 };
		int n = arr.length;
		int expectedSum = ((n + 1) * (n + 2)) / 2;
		System.out.println("Missing Number is: " + missingNumber(arr, expectedSum));
	}

	static int missingNumber(int[] a, int expectedSum) {
		int difference = 0, actualSum = 0;
		for (int i = 0; i < a.length; i++) {
			actualSum += a[i];
		}
		difference = expectedSum - actualSum;
		return difference;
	}
}
