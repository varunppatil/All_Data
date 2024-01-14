package harry;

import java.util.Scanner;

public class Vdo25_FactorialOfNo {

	public static void main(String[] args) {
		System.out.println("Number to check for factorial: ");
		Scanner sc = new Scanner(System.in);
		int c = sc.nextByte();
		int j = 1;
// Another logic was .....
//		for(int i=1;i<=c;i++) {
		for(int i=c;i!=0;i--) {			
			j = (j*i); 
		}
		System.out.println(j);
	}

}
