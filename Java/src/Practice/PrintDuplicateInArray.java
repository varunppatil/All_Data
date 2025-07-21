package Practice;

//Online Java Compiler
//Use this editor to write, compile and run your Java code online
import java.util.*;

class PrintDuplicateInArray {
	static void meth(int[] a) {
		HashSet<Integer> hs = new HashSet<>();
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length - 1; j++) {
				if (a[i] == a[j]) {
					hs.add(a[j]);
					break;
				}
			}

		}
		System.out.println(hs);
	}

	public static void main(String[] args) {

		int[] a = { 3, 4, 56, 6, 3, 5, 4, 55, 2, 6, 7, 8, 8, 6, 55 };
		HashSet<Integer> duplicate = new HashSet<>();
		HashSet<Integer> unique = new HashSet<>();
		/*
		 * for(int i=0;i<a.length;i++){ // if(!unique.add(a[i])){ //
		 * duplicate.add(a[i]); // } // } System.out.println(duplicate);
		 */
		meth(a);
	}
}
