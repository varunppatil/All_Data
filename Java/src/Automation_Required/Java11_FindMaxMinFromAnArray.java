package Automation_Required;

public class Java11_FindMaxMinFromAnArray {

	public static void main(String[] args) {

		int[] a = { 52, 7895, 7, 1, 78, 56, 34, 67898, 10 };

		int n1 = Integer.MAX_VALUE;
		int n2 = Integer.MIN_VALUE;
		int secMax = 0, secMin = 0;
		// Highest
		for (int num : a) {
			if (n2 < num) {
				secMax = n2;
				n2 = num;
			}
		}
		System.out.println(n2 + " " + secMax);

		// Lowest
		for (int num : a) {
			if (n1 > num) {
				secMin = n1;
				n1 = num;
			}
		}
		System.out.println(n1 + " " + secMin);

	}

}
