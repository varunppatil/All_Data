package rahulShetty;

public class ThisKeyword {
	
	
	int a=2;
	
	
	public void getData() {
		int a=3;
		//this refer to current object scope lies in class level
		System.out.println(a);
		//Global
		System.out.println(this.a);
		
		//global + local variable 
		int b = this.a +a;
		System.out.println(b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ThisKeyword t=new ThisKeyword();
		t.getData();
		
	}

}
