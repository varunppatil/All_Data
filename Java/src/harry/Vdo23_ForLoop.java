package harry;

import java.util.Scanner;

public class Vdo23_ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// for(int i=1; i<=10; i++) {
		// System.out.print(i+" ");
		// }

//		 For odd numbers till a certain no ....if n=6 then 1,3,5 
//		System.out.println("Printing odd no.s till: ");
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//	    For odd numbers till a certain no
		/*
		 * for(int i=1;i<=n;i++) { System.out.println("Odd no: "+i); i+=1; }
		 */

		// For nth odd no from start .... like n=2 then 1,3

//		System.out.println("Printing nth odd no.s: ");
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		for (int i=0;i<n;i++) {
//			System.out.println(2*i+1);
//			}

//     For nth even no.s from start
		/*
		 * System.out.println("Printing first nth even no.s "); Scanner sc = new Scanner
		 * (System.in); int n=sc.nextInt(); for(int i=0;i<=n;i++) {
		 * System.out.println(2*i); }
		 */

//		for (int i=10; i!=0;i--) {
//			System.out.print(i+" ");
//		}

		int n = 10;
		for (int i = n; i > 0; i--) {
			System.out.println(i);
		}
		String v= "varun";
		String v11 = "varun";
		String v12 = "varun";

		String v1 = new String("varun");
		String v2 = new String("varun");
		System.out.println(v.substring(0, 4));
		System.out.println(v.charAt(0));
		System.out.println(System.identityHashCode(v11));
		System.out.println(System.identityHashCode(v12));
		System.out.println(System.identityHashCode(v1));
		System.out.println(System.identityHashCode(v2));
	}

}
