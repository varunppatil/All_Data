package harry;

import java.util.ArrayDeque;
import java.util.Arrays;

public class Vdo93_Array_Deque {

	public static void main(String[] args) {
		
		ArrayDeque<Integer> ad= new ArrayDeque<>();
		ad.add(56);
		ad.add(23);
		ad.addFirst(89);
		System.out.println(ad.getFirst());
		System.out.println(ad.getLast());
		System.out.println(ad.offerFirst(553455353));
		System.out.println(ad.pollFirst());
		System.out.println(ad.peekFirst());
		System.out.println(ad.offerFirst(553455353));
		System.out.println(ad);
		System.out.println(ad.peekLast());
		System.out.println(ad.pollLast());
		System.out.println(ad);
	}

}
