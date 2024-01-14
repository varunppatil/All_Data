package rahulShetty;

public class ConstructorClass {

	// Default Constructor - As not accepting any values
	public ConstructorClass() {
		System.out.println("I am in  Deafault constructor");
	}

	// Parameterized Constructor
	public ConstructorClass(int a, int b) {
		System.out.println("I am in  Parameterized constructor");
	}

	 public ConstructorClass(String str) {
		System.out.println(str);
	}

	public void getData() {
		System.out.println("Something is there");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstructorClass c = new ConstructorClass();
		ConstructorClass c1 = new ConstructorClass(3, 5);
		ConstructorClass c2 = new ConstructorClass("Varun");
		// c.getData();

	}

}
