package harry;

interface Int1 {
	void meth1();

	void meth2();
}

class Required  {
	public void display() {
		System.out.println("Display");
	}

	
	public void meth1() {
		System.out.println("Meth1");

	}

	
	public void meth2() {
		System.out.println("Meth2");
	}
}

public class Vdo109_Anonymous_Class {

	public static void main(String[] args) {
		
		Required r = new Required(){
			@Override
			public void meth1() {
				System.out.println("I want to print something else");

			}
			};
			r.meth2();
			
	}
}
