package Practice;

import java.util.*;

public class NewClass{
public static void main(String [] args){
    
	
    ArrayList<Integer> arr = new ArrayList(Arrays.asList(045101, 10101025,44, 154, 879, 12454, 547458, 984754, 45101249));
    
  /*  arr.add(44);
    arr.add(154);
    arr.add(879);
    arr.add(12454);
    arr.add(547458);
    arr.add(984754);*/
   // arr.add(10101025);
   // arr.add(045101);
    int rev=0;    
    LinkedList<Integer> seperateNo = new LinkedList<>();
    for(int a: arr) { 
    	int number =a;    
    	//int count =0;
    	while(number>=0) { 	
    		
    		if(number==0) {
    			seperateNo.addLast(0);
    			break;
    		}
    	
//check
    	rev = number%10;
    	
    	
    	seperateNo.add(rev);
    	number = number/10;
    	}
    	
    	int maxNumber =0;
    	for(int i=0;i<seperateNo.size();i++) {   		
    		for(int j=0;j<seperateNo.size()-1;j++) {
    			int temp=0;
    		/*	if(seperateNo.get(j)==0) {
    				temp=seperateNo.get(j);
    				seperateNo.set(j, seperateNo.get(seperateNo.size()-1));
    				seperateNo.set(seperateNo.get(seperateNo.size()-1), temp);
    				seperateNo.remove(j);
    				 seperateNo.addLast(seperateNo.get(j));
    				
    			} */
    			
    			if(seperateNo.get(j)<seperateNo.get(j+1)) {
    				temp=seperateNo.get(j);
    				seperateNo.set(j, seperateNo.get(j+1));
    				seperateNo.set(j+1, temp);	
    			}
    		}
    		String num="";
    		if(i==seperateNo.size()-1) {
    			
    			for(int s:seperateNo) {
    		num = num+s;

    		
    			}
    			System.out.print(num);
    			seperateNo.clear();
    			System.out.print(" ");
    		}
    	}
    		
    } 
}

}