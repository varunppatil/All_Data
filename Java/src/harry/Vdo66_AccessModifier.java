package harry;
			
class Varun{
	public int a =40;
	protected int b=45;
	int c=50;
	private int d=55;
			
}
class Baggdda extends Varun1{
	Varun1 v= new Varun1();
	public void meth1() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	//	System.out.println(v.d); // Private is not accesible outside class
	}
	
}


public class Vdo66_AccessModifier extends Varun1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Baggdda bg = new Baggdda();
		bg.meth1();
		
		
	}

}
