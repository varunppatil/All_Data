package Techniques;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class practice {

	
	    public static void main(String[] args)
	    {
	        String input = "Geeks For Geeks";
	        char[] hello = input.toCharArray();
	        List<Character> trial1 = new ArrayList<>();
	 
	        for (char c : hello)
	            trial1.add(c);
	 
	        Collections.reverse(trial1);
	        Iterator li = trial1.iterator();
	        while (li.hasNext())
	            System.out.print(li.next());
	    }
	}
