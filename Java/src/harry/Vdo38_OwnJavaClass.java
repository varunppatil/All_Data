package harry;

class Employee{
	public int id ;
	public String name ;
	//public int noOfGadgets;
	public Employee(int id2, String name2) {
		this.id  = id2;
		this.name = name2;
		//System.out.println("Gadgets are : " +  noOfGadgets);
	}
	
	public Employee() {
		
		System.out.println("Employee constructor");
	}
	
	public void details() {
	System.out.println("The id is: " + id);
	System.out.println("The name of employee is: " + name);
	}
}
	
public class Vdo38_OwnJavaClass {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("This is custom class: ");
		Employee varun = new Employee(2,"Varun");
		//varun.id = 12;
		//varun.name = "Varun";
		varun.details();
		
		Employee yash = new Employee(4,"yash");
		//yash.id = 25;
		//yash.name ="Yash";
		
		yash.details();
		
		Employee emp = new Employee(56,"Baggdda");
		
	}
}
	
	
	

