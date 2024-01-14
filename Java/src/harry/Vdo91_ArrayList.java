package harry;

import java.util.*;

public class Vdo91_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr= {91,92,93,94};
		ArrayList<Integer> a1=new ArrayList<>();
		ArrayList<Integer> a2=new ArrayList<>();
		a2.add(56);
		a2.add(67);
		a2.add(78);
		a1.add(3);
		a1.add(4);
		a1.add(6);
		a1.add(7);
		a1.add(8);
		a1.add(3,0);
		a1.addAll(0,a2);
		Iterator<Integer> i = a1.iterator();
		System.out.println(i.hasNext());
	forEach( a1); // Check this implementation, i think it is not right
		{
			//System.out.println(a1);
			System.out.println(a1.contains(56));
		}
		System.out.println(a1.indexOf(4));
		System.out.println(a2.indexOf(100));// Not present then it will return -1.
		
	// ArrayList<Integer> a3 = new ArrayList<>();
		Object[] arr1=a1.toArray();
		
		for(Object i1:arr1) {
			System.out.print(i1+",");
		}
	}
	LinkedList<Integer> g=new LinkedList<>();
	

	private static void forEach(ArrayList<Integer> a1) {
		// TODO Auto-generated method stub
		
	}



}
