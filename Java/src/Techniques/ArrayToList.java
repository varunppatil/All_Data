package Techniques;

import java.util.*;

class ArrayToList {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        
        Integer a[] = new Integer[1];
        
        a[0]=3;
        System.out.println(Arrays.toString(a));
        
        List<Integer> arrNew = new ArrayList<>(Arrays.asList(a));
        
        System.out.println(arrNew);
        
        Object [] newArray = arrNew.toArray();
        System.out.println(newArray[0]);
        
      
    }
}