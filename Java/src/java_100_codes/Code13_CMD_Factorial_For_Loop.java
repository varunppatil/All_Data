package java_100_codes;

import java.util.*;

public class Code13_CMD_Factorial_For_Loop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int fact = 1;

		for (int i = n; i >= 1; i--) {

			fact = fact * i;

		}
		System.out.println(fact);

	}
}