package Automation_Required;

import java.util.Scanner;

public class Java_5_Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Number of series to print");
		int num =sc.nextInt();
		
		int num1=0, num2 = 1, sum = 0;
		System.out.print(num1+ " "+num2);
		
		for(int i=2;i<num;i++) {
			sum = num1+num2;
			num1=num2;
			num2=sum;
			
			
			System.out.print(" "+sum);
		}

	}

}
