package rahulShetty;

import java.util.ArrayList;
import java.util.List;

public class ExceptionDemo {

	public static void main(String[] args) throws Exception {

		try {
			int a = 4;
			int b = 2;
			int c = 0;

			int k = b / c;
		}

		catch (ArithmeticException e) {
			// Catch specific arithmetic exception
			//throw new Exception("Check for finally");
			System.out.println("I Catched Arithmetic Exceptions");
		}

		catch (Exception e) {
			// Use print only when you want to continue
			System.out.println("I Catched  Exceptions");
		} 

		finally {
			// Error jari una tri finally execute huyinch instead apan execution terminate krts nhi
			System.out.println("Delete cookies");
		//	ArrayList<String> a= new ArrayList<String>();
			
			// for closing browser and deleting cookies
		}

	}

}
