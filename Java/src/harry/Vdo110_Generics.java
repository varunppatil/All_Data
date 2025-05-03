package harry;

import java.util.ArrayList;

class MyGeneric<T1>{
	
	
	int a;
	private T1 t1;
	public MyGeneric(int a, T1 t1 ) {
		this.a=a;
		this.t1=t1;
	}
	
	public void setT1(T1 t1) {
		this.t1=t1;
	}
	
	public T1 getT1() {
		return t1;
	}
	
	public void setInt(int a) {
		this.a=a;
	}
	
	public int getInt() {
		return a;
	}


}




public class Vdo110_Generics {

	public static void main(String[] args) {
		
	/*	ArrayList arr = new ArrayList();
		
		arr.add("str1");
		arr.add(54);
		arr.add('v');
		
		//Would give error
		String s = arr.get(1);
		
	*/	
		//Right one
	//	ArrayList<Integer> arr = new ArrayList();
		
		MyGeneric<String> g1= new MyGeneric<>(2,"Varun");
		String str1=g1.getT1();
		int a1=g1.getInt();

	}

}
