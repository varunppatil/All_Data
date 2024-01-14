package harry;
import java.util.Scanner;

public class Vdo19_incomeTax {
	public static void main(String[] args) {
		 System.out.println("Providing my yearly income: ");
		 Scanner sc = new Scanner (System.in);
		 float income = sc.nextFloat();
		 float tax = 0;
		 
/*		 if (income < 2.5) {
			 System.out.println("There is no Tax");
		 }
		 if ( income >= 2.5 && income <= 5.0 ) {
			 System.out.println("Tax will be 5 %: ");		
		 }
		 if ( income > 5.0 && income <= 10.0 ) {
			 System.out.println("Tax will be 20 %: ");		
		 }
		 if (income > 10) {
			 System.out.println("Tax will be 30 %: "); 
		 }    */
		 
		 if (income <= 2.5f) {
			 tax = tax + 0;
		 }
		 if(income > 2.5f && income <= 5.0f) {
	
			 tax = tax +  0.05f * (income - 2.5f) ; // Tax for amount greater than 2.5 
		 }
		 if (income > 5.0f && income <= 10.0f) {
			 tax = tax + 0.05f *(5.0f - 2.5f); // Tax for amount greater than 2.5 to 5
			 tax = tax + 0.2f * (income -5.0f); // Tax for amount greater than 5
		 }
		 if (income > 10.0f) {
			 tax = tax + 0.05f *(5.0f - 2.5f); //Tax for amount greater than 2.5 to 5
			 tax = tax + 0.2f * (10.0f -5.0f); // Tax for amount greater than 5 - 10
			 tax = tax + 0.3f * (income - 10.0f); // Tax for amount greater than 10
		 }
		 System.out.println("Tax is: " +tax);
		 
		 
		 
	}

}
