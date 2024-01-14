package harry;

class Super{
	public void sup1() {
		System.out.println("I am unique method in super ");
	}
	public void sup() {
		System.out.println("I am a common thing in super class ");
	}
}
class Sub extends Super{
	public void sub() {
		System.out.println("I am sub method ");
	}
	@Override
	public void sup() {
		System.out.println("I am a common thing in  classes");
	}
	
	
}

public class Vdo49_DynamicMethodDispatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Super sb=new Sub();
		sb.sup(); // Subclass sup method will be called as we are assigning sub class to object.
		sb.sup1();// Super class methods ca be accessible as we taking reference of super class.
		//	sb.sub(); //Not accessible for us
		
		// Can be accessed like this
		Sub sb2 = new Sub ();
		sb2.sub();
		
	}

}
