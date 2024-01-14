package harry;
import java.util.Scanner;


public class Vdo19_LeapYear {
	public static void main (String[] main) {
		System.out.println("Enter Year which we are going to check as Leap Year: ");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
	System.out.println(leapYear(year)? "Leap Year " : "Not a Leap Year");
		
	// This is for non - static method
	//	Vdo19_LeapYear v = new Vdo19_LeapYear();
	//	v.leapYear(year);
		// If a year id divisible by 4 but excluding year divisible by 100
	}
	
  /* void leapYear(int year) {  
		if (year % 100 == 0 && year % 400 != 0) {
			System.out.println(year +" is not leap Year");
		}
		else if (year% 4 == 0 ) {
			System.out.println(year +" is Leap Year: ");
			
		}
		else  if (year % 400 == 0)
			System.out.println(year +" is Leap Year: ");
	 
		} */


	static boolean leapYear(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
			
	}
  
}

