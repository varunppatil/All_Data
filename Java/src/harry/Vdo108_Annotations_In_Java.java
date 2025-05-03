package harry;

class ABD implements Phone {
	@Override
	public void calculator() {
		System.out.println("It's calculator");
	}

	@Override
	public void cameraCapture() {
		// TODO Auto-generated method stub

	}
}
	@FunctionalInterface
	interface R{
		 void meth();
	
}

public class Vdo108_Annotations_In_Java {

	public static void main(String[] args) {

		ABD a = new ABD();
		a.calculator();

	}

}
