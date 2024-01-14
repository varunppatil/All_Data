package harry;

interface gav{
	void lane1();
	void lane2();
	private void method() {
	}
	default void meth56() {
		
	}
}
interface town{
	void colony1();
	void colony2();
	
}
class ForChecking{
	void check() {
		int x=56;
		System.out.println("The value of x is " +x);
	}
}

// All methods from interface must be defined in implemented class
// All methods must be public
// We can't use other method in interface like abstract class
class Tehsil extends ForChecking implements gav,town{
	public void lane1() {
		System.out.println("Gavatli lane 1 ");
	}
	public void lane2(){
		System.out.println("Gavatli lane 2");
	}
	public void colony1() {
		System.out.println("Colony 1 somewhere");
	}
	public void colony2() {
		System.out.println("Colony 2 somewhere");
	}
}
public class Vdo55_MultipleInterfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tehsil t =new Tehsil();
		t.lane1();
		t.lane2();
		t.colony1();
		t.colony2();
		t.check();
		
	}

}
