package rahulShetty;

public class StaticVar {

	//Instance Variable
	String name;
	String address;
	
	//static mule ha class variable asel
    static String city ="Jalgaon";
	static int i=0;
	StaticVar(String name, String address /*String city*/){
	
		this.name=name;
		this.address=  address;
	//	this.city =city;
		i++;
		System.out.println(i);
	
	}
	
	// Static block for initializing static attributes
	static {
		int j=0;
	}
	
	public void getAddress() {
		System.out.println(address+" " + city);
	}
	
	public static void staticMethod() {
		System.out.println("Static method will accept static attributes only");
	}
	public static void main(String[] args) {
	
		
	//	StaticVar obj = new StaticVar("Varun","Pimpale", "Jalgaon");
	//	StaticVar obj1 = new StaticVar("Vishal","Lohtar", "Jalgaon");
	
		//commented above code as using static now
		StaticVar obj = new StaticVar("Varun","Pimpale"); //for this i will be 1
		StaticVar obj1 = new StaticVar("Vishal","Lohtar");// here 1 increase it will be 2 as its is static so same i will be used
		
		//if static remove then 1 will be printed 2 times
		obj.getAddress();
		obj1.getAddress();
		staticMethod();
		
		StaticVar.city="Pune";
		obj.name ="Baggdda";
	}

}
