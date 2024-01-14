
public class Swap {

	static int x=20,y=40;
	static void swap(int x, int y) {
	 
	 int z=y;
	    y=x;
	     x=z;
		System.out.println(x+ " and " +y);
	}
	static void swap1(int x, int y) {
		 
		    x=x+y;
		    y=x-y;
		    x=x-y;
			System.out.println(x+ " and " +y);
		}
	
	public static void main(String[] args) {
	
		System.out.println(x+ " and " +y);
		swap(x,y);
		System.out.println(x+ " and " +y);
		//swap1(20,40);
		//System.out.println(x+ " and " +y);
		}

}
