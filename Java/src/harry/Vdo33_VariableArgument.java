package harry;

public class Vdo33_VariableArgument {

	static int sum(int x,int ...arr) {
		int result = x;
		for(int a:arr) {
			result +=a;
		}
		return result;
	}
	static int sum1(int ...arr) {
		int result = 0;
		for(int a:arr) {
			result +=a;
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int a=sum(3);
		int c=sum1(); // we must pass a single argument as per codn, if u pass single arg for (int ...arr) then it'll give 0 for arr.
		int b=sum(7,6,9,8);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

	}

}
