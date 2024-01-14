package harry;

import java.util.Scanner;

public class Vdo34_RecursionInJava {

	// Experimenting method overloading in Recursion classs ... :)
	
	static int fibonacci(int n ) {
		
		if(n==0 || n==1) {
		 return 1;
		}
		else {
			return n* fibonacci(n-1);
		}
	}
	
	
	  public static void main(String[] args) { 
		  // TODO Auto-generated method stub
	
	  Scanner sc = new Scanner(System.in); System.out.println("Take to a no: ");
	  int no = sc.nextInt(); 
	 System.out.println(fibonacci(no)); 
	 System.out.println(fibonacci()); 
	  }
	 
	static int fibonacci() {
		int n=0;
		if(n==0 || n==1) {
		return 1;
		}
		else {
			return n* fibonacci(n-1);
		}
	}

}
