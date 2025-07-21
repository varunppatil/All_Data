// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Display The Last 6 Even Numbers & Last 2 Prime Numbers In The Given List,
		//Input_List = [ 10, 20, 2, 5, 7, 9, 6, 11, 26, 77, 55, 02, 51, 1027, 77 ]
		
		//int [] a = {10, 20, 2, 5, 7, 9, 6, 11, 26, 77, 55, 02, 51, 1027, 77};
		
		ArrayList<Integer> ar = new ArrayList<>();
		ArrayList<Integer> even = new ArrayList<>();
		ArrayList<Integer> prime = new ArrayList<>();
		ar.add(10);
		ar.add(20);
		ar.add(2);
		ar.add(5);
		ar.add(7);
		ar.add(9);
		ar.add(6);
		ar.add(11);
		ar.add(26);
		ar.add(77);
		ar.add(55);
		ar.add(02); 
		ar.add(51);
		ar.add(1027);
		ar.add(77);	
		for(int a:ar) {
			if(a%2==0) {
				even.add(a);
			}
		}
		for(int i=even.size()-1; i>=even.size()-6;i--){
		  //  System.out.println(even.get(i));
		}
		
		
		for(int j=0; j<ar.size();j++ ){
		    int number =ar.get(j);
		    int condition=0;
		    for(int k=2;k<number/2;k++){
		        if(number%k==0){
		            condition++;
		        }
		    }
		    if(condition==0){
		        System.out.println(condition +" "+number);
		    }
		    
		    
		}
		
		
		
		
		
		
		
		
		
	}

}
