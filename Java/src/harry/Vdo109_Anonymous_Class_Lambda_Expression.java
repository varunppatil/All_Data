package harry;

@FunctionalInterface
interface Int2 {
	void meth1(int a);
}

	
	
public class Vdo109_Anonymous_Class_Lambda_Expression {

	public static void main(String[] args) {
		
		Int2 obj =(a)->{System.out.println("Using lambda expression ");};
		obj.meth1(3);
	}

}
