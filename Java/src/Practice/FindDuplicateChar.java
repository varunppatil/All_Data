package Practice;
import java.util.*;


class FindDuplicateChar {
    public static void main(String[] args) {
       String str = "VarunV";
       
       char [] arr = str.toCharArray();
       HashMap<Character, Integer> hm = new HashMap<>();
       
       for (int i =0; i<arr.length;i++){
           
           if(hm.containsKey(arr[i])){
               //hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
               hm.put(arr[i],hm.get(arr[i])+1);
           }
           else
           hm.put(arr[i],1);
       }
       System.out.println(hm.entrySet());
       
       
    }
}