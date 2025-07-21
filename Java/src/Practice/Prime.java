package Practice;

//Online Java Compiler
//Use this editor to write, compile and run your Java code online
import java.util.*;

class Prime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberToPrint = sc.nextInt();

		/*
		 * if(numberToPrint==1){ System.out.println("Prime is no is: "+2); } else
		 */

		for (int i = 2; i <= numberToPrint; i++) {
			boolean prime = true;
			for (int j = 2; j <= (i / 2); j++) {
				// System.out.println(i+ "");
				if (i % j == 0) {
					prime = false;
				}
			}
			if (prime) {
				System.out.print(i+" ");
			}
		}

	}
}