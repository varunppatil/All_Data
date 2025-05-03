package harry;

import java.util.Scanner;

class MyException extends Exception{
	
	
	public String toString() {
		return  "Returning toString()";
	}
	public String getMessage() {
		return  "Returning getMessage()";
	}
}





public class Vdo83_Exception_Class extends NewThread4 {

	public static void main(String[] args) {
	
		Vdo83_Exception_Class v = new Vdo83_Exception_Class();
		
		try {
			Vdo83_Exception_Class.newMethod();
		} catch (MyException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		NewThread4 ent = new NewThread4();
	//	ent.run();
		
	int a = 0;
	Scanner sc = new Scanner(System.in);
	if (a<9) {
		
		try {
			//Exception getting or we deliberatly throwing exception the catch block will execute
		//	throw new MyException();
			throw new ArithmeticException("This is arithmetic exception");
		}
		
		catch(Exception e) {
			System.out.println("getMessage(): "+e.getMessage() );
			System.out.println("getMessage(): "+e.toString() );
			System.out.println("getMessage(): "+e );
			e.printStackTrace();
			
		}
		System.out.println("Finished");
	}
		
		

	}
	//If it's static then with object also it will be called but not static then we need object --- In inheritenace cases need to check like for extends
	public static void newMethod() throws MyException
	{
		System.out.println("Checking object creation and static"+ new MyException());
	}
}
