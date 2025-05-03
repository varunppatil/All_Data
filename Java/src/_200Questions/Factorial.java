package _200Questions;
import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {	
		// 4*3*2*1		
		int fact = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Number to calculate factorial");
		int numFact = sc.nextInt();		
		if (numFact<1) {
			System.out.println("Factorial is " +fact);
		}	
		else {			
			for (int i=1; i<=numFact;i++) {
				fact=fact*i;	
			}
			System.out.println(fact);	
		}
	}
}
