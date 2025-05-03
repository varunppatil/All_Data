package java_100_codes;

import java.util.*;

public class Code14_N_NumbersInFibonacci {

	public static void main(String[] args) {
		
		
		//Not right logic
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Take a number");
		int n = sc.nextInt();

		int num1 = 0;
		int num2 = 1;

		for (int i = 0; i < n; i++) {

			System.out.println(" " + num1 + ",");

			int sum = num1 + num2;

			num1 = num2;
			num2 = sum;

		}

	}

}