package harry;

public class Vdo85_Static_Block_Instance_Initializer {
	
	int a=10;
	static int b=10;
	
	static {
		System.out.println("Static block");
	//	this.a=2;
		System.out.println(/*a+*/" "+b);
	}
	 {
		System.out.println("Checking initilization block");
		this.a=2;
		System.out.println(a+" "+b);
	}
	 
	 public  Vdo85_Static_Block_Instance_Initializer () {
		 System.out.println("I am constructor");
	 }
	public static void main(String[] args) throws Exception {

		try {
			int a = 2, b = 0;
			int c = a / b;
		} catch (Exception e) {
			throw new Exception();
		} finally {
			System.out.println("Always execute");
			
			Vdo85_Static_Block_Instance_Initializer f= new Vdo85_Static_Block_Instance_Initializer();
		
		}

	}

}
