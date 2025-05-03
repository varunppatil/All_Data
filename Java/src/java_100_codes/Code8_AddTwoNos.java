package java_100_codes;

public class Code8_AddTwoNos {

	public static void main(String[] args) {
		
		System.out.println(sum(2,3,8,6,77,7,8,9,-5,7,8));
		
	}
	
	public static int sum(int ...arr) {
		int sum =0;
		for(int a:arr) {
			sum=sum+a;
		}
		return sum;
	}
	

}
