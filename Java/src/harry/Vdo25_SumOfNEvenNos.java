package harry;

import java.util.Scanner;

public class Vdo25_SumOfNEvenNos {

	public static void main(String[] args) {
		
		System.out.println("How many even no.s to add: ");
		Scanner sc = new Scanner(System.in);
		int noLimit =sc.nextInt();
		int i=0;
		int sum=0;
		while(i<noLimit) {
			sum+=2*i;
			i++;		
		}
		System.out.println("Addition of first "+noLimit+" even no.s is "+sum);
	}

}
