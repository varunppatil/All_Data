package _200Questions;

import java.util.*;

public class FactorialRecursion {
	static int factorial(int number) {
		if (number <= 1) {
			return 1;
		} else
			return number * factorial(number - 1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Calculate factorial for number: ");
		int num = sc.nextInt();
		System.out.println("Factorial of number is: " + factorial(num));
	}
}
