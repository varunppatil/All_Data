package Automation_Required;

public class Java20_ReverseNumber {

	public static void main(String[] args) {
		
		int num =1020, temp=num;
		int num1=0;
		while(temp>1) {			
			num1= num1*10+temp%10;
			temp = temp/10;
		}		
		System.out.println(num1);		
		if(num==num1) {
			System.out.println("Number "+num+" is palindrome");
		}
	}

}
