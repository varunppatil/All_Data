package harry;

public class Vdo32_MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		check();
		System.out.println(check(3,4));
	}
		

    static void check() {
			System.out.println("Check krtoy");
		}

    static int check(int x, int y) {
    	int c = x+y;
    	return c;
    }



}
	
