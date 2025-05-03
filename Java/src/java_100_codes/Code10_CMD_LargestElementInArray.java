package java_100_codes;

public class Code10_CMD_LargestElementInArray {

	public static void main(String[] args) {

		long[] a = new long[]{ 2, 5, 8, 9,7, 5, 8, -4, -66, -66, (long) 6869.99};
		
//		long [] a1 = { -67824824, 798429472, 2, 5, 8, 8.99, 9,7, 5, 8, -4, -66, -66};
		

		Long max = Long.MIN_VALUE;

		for (int i = 0;i<=a.length - 1; i++) {

			if (a[i] > max) {
				max = a[i];			
			}
		
		}
		System.out.println(max);

	}

}