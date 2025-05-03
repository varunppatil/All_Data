package harry;
import java.util.*;

public class Vdo92_Collection {

	
	
	public static void main(String[] args) {
		LinkedList<Integer> a1=new LinkedList<>();
		LinkedList<Integer> a2=new LinkedList<>();
		a2.add(56);
		a2.add(67);
		a2.add(78);
		a1.add(3);
		a1.add(4);
		a1.add(6);
		a1.add(7);
		a1.add(8);
		a1.add(3,3);
		a1.addAll(0,a2);
		a1.addLast(4555);
		System.out.println(a1);
		System.out.println(a2);
	}

}
