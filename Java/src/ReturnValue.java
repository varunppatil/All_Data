
public class ReturnValue {


	 static int sumOfNos(int x, int y) {
			int sum =x+y;
			System.out.println("Check");
			return sum;
		}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumOfNos(20, 02));
		ReturnValue value = new ReturnValue();
		System.out.println(value.anglesOfTriangle(20, 60));
	}
	
	int anglesOfTriangle(int a, int b) {
		int c=180-(a+b);
		
		return c;
	}
	
}
