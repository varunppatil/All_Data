
public class LeetCodeReverseNumber {
	public static int reverse(int x) {   
	     long  y=0;
	    while(x!=0){      
	       y=y*10+x%10;     
	        x=x/10;
	    }
	    System.out.println(y);
	    if(y>Integer.MAX_VALUE || y< Integer.MIN_VALUE) return 0;
	    else return (int)y;
	     }
	 public static void main(String[] args) {
		 reverse(2147483647);
	}

}
