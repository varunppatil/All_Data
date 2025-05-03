package Automation_Required;

import java.util.*;
import java.lang.*;

public class FibonacciPractise {

	public static void main(String[] args) {

		int num1 = 0, num2 = 1; // 0 1 1 2

		Scanner sc = new Scanner(System.in);
		int lengthOfSeries = sc.nextInt();
		if (lengthOfSeries <= 2 || lengthOfSeries > 2) {
			System.out.print(num1 + " " + num2);
		}
		int sum = 0;
		for (int i = 2; i < lengthOfSeries; i++) {
			sum = num1 + num2;
			num1 = num2;
			num2 = sum;
			System.out.print(" " + sum);
		}

	}

}
