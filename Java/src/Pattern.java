import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		System.out.println("Taking Input: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

			for (int row = 1; row<= n; row++) {
				for(int col=1; col<=row;col++) {
					System.out.print("*");	
				}
				System.out.println();
				}
}
}