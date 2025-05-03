package harry;

class NegativeRadiusException extends Exception{
	
	
	public String toString() {
		return  "Radius cannotbe negative";
	}
	public String getMessage() {
		return  "Radius cannotbe negative";
	}
}





public class Vdo84_Throws_And_Throw {
	
	
	public static double area(int r) throws NegativeRadiusException {
		double area =Math.PI*r*r;
		return area;
	}
	
	
	public static int divide(int a, int b) throws ArithmeticException {
		int result =a/b;
		return result;
	}
	

	public static void main(String[] args) {
		
		
		try {
			int c = divide(22,0);
			System.out.println(c);
		} catch (ArithmeticException e) {
			System.out.println("Exception");
			
		}

	try {
		double ar =area(-7);
		System.out.println(ar);
	} catch (NegativeRadiusException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
}
