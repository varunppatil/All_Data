package harry;

import java.util.Scanner;

public class Vdo25_StarPattern {

	public static void main(String[] args) {
		System.out.println("Maximum stars in first rows should be: ");
		Scanner sc = new Scanner(System.in);
		byte b =sc.nextByte();
		
		for (int i=1;i<=b;i++) {
			for(int j=i;j<=b;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		

	}

}
