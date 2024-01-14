package rahulShetty;

public class ChildDemo extends ParentDemo {

String name="Patil";


public ChildDemo() {
	super(); //It should be first line
	System.out.println("ChildClass constructor");
}
	
	public void getStringData() {
		System.out.println(name);
		System.out.println(super.name);
	}
	
	public void getData() {
		super.getData();
		System.out.println("New Method Child");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ChildDemo ch =new ChildDemo();
	ch.getStringData();
	ch.getData();
	}

}
