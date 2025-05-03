package java_100_codes;

import java.util.*;

public class Code12_CMD_Factorial_Recursion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		System.out.println(fact(n));
	}

	public static int fact(int n) {

		if (n >= 1) {
			return n * fact(n - 1);
		}

		else
			return 1;
	}

}