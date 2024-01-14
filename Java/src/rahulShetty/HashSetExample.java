package rahulShetty;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//HashSet, TreeSet, LinkedHashSet implements Set Interface
		
		
		HashSet<String> hs=new HashSet<String>();
		hs.add("USA");
		hs.add("INDIA");
		hs.add("UK");
		// It will Ignore duplicate
		hs.add("INDIA");
		
		System.out.println(hs);
		
		System.out.println(hs.remove("UK"));
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());	
		
		for(String h:hs) {
			System.out.println(h);
		}
		
		Iterator<String> i=hs.iterator();
		while(i.hasNext()) {
		System.out.println(i.next());
		//System.out.println(i.next());
		
		}
		
		
	}

}
