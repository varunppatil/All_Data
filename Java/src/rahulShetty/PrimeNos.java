package rahulShetty;

import java.util.Scanner;

public class PrimeNos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();		
		int condition = 0;
		
		for(int i=2;i<=number;i++) {
			condition=0;			
			if(i==2) {
				System.out.println(i);
				continue;
			}
			
		for(int j=2;j<i;j++) {
				if(i%j==0) {
					condition++;
					break;
				}
				
			}
		if(condition==0) {
			System.out.println(i);
		}
		}
	}
}


