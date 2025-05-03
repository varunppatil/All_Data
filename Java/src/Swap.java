
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
		//	System.out.println(x+ " and " +y);
		}
	
	static void swapString(String str1, String str2) {
		
		String str11 = str1;//var
		String str21 = str2;//Pat
		
		System.out.println( str11 + " " + str21);
		String newStr = str11+str21;//varpat
		
		str21= newStr.substring(0,str11.length());
		//str11 = newStr.substring(str11.length());
		str11 = newStr.substring(newStr.length()-str21.length());
		
		System.out.println( str11 + " " + str21);
	}
	
	public static void main(String[] args) {
	
	//	System.out.println(x+ " and " +y);
	//	swap(x,y);
	//	System.out.println(x+ " and " +y);
		//swap1(20,40);
		//System.out.println(x+ " and " +y);
		
	
	swapString("Var", "Pat");
	}
}
