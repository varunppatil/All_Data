package harry;

import java.util.HashSet;

public class Vdo95_HashSet {

	public static void main(String[] args) {
		
		HashSet<Integer> hs= new HashSet<>(8,0.5f);
		hs.add(4);
		hs.add(55);
		hs.add(424342);
		hs.add(4);
		System.out.println(hs);
	}

}