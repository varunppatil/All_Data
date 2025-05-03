
public class AccessModifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staticWithpublic();
		AccessModifiers ac = new AccessModifiers();
	//	ac.checkMain();
	}
 
	public static void staticWithpublic() {
		System.out.println("Static with public");
	}
	public void staticWithoutpublic() {
		System.out.println("Static without public");
		staticWithpublic();
		main(null);
	}
	public void checkMain() {
	//	System.out.println("Check main");

		main(null);
	}
}
