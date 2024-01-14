package rahulShetty;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Duplicate will accept as it is implementing List
		
		
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("Varun");
		a.add("Java");
		a.add("Java");
		
		System.out.println(a);

		a.add(0, "BAGGDDA");

		System.out.println(a);
		// a.remove(0);

		// System.out.println(a);
		String str=a.get(2);
		System.out.println(str);
		
		boolean b= a.contains("Varun");
		System.out.println(b);
		
		int i=a.indexOf("Varun");
		System.out.println(i);
		
		System.out.println(a.isEmpty());
		
		System.out.println(a.size());
		
		
		
		
		
		
		
		
	}

}
