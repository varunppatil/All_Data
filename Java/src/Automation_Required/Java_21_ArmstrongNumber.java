package Automation_Required;

import java.util.Scanner;

public class Java_21_ArmstrongNumber {

	public static void main(String[] args) {
		
		System.out.println("Number to check: ");
		Scanner sc = new Scanner (System.in);
		
		//371 = 3^3+7^3+1^3
		int num = sc.nextInt();
		int actualNum = num;
		int result=0;
		
		while(num !=0) {
			int n = num %10;
			result+= Math.pow(n, 3);
			num /= 10;
		}
		
		System.out.println(result);
		if(result==actualNum) {
			System.out.println("is Armstrong number");
		}
		else System.out.println("is not Armstrong number");
		

	}

}
