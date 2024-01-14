package harry;

public class AccessModifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staticWithpublic();
//		staticWithoutpublic();
	}
 
	public static void staticWithpublic() {
		System.out.println("Static with public");
	}
	public  void staticWithoutpublic() {
		System.out.println("Static without public");
		staticWithpublic();
		main(null);
	}
}
