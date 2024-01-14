package rahulShetty;

import java.util.Scanner;

public class prime2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Taking a input");
		int number = sc.nextInt();
		int count;
		for(int i=2;i<=number;i++) {
			count=0;
			if(i==2) { 
		    System.out.println(i); 
			continue;
			}	
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					count++; 
					break;
				}
			}
			if(count==0) {
				System.out.println(i);
			}
		}
	}

}
