
public class PrintNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printNos(6);
		printSquareOfNos(6);
	}
	
	static void printNos(int n) {
		for(int i=1;i<=n;i++) {
			System.out.println(i);
		}
	}
		
		static void printSquareOfNos(int n) {
			for(int i=1;i<=n;i++) {
				System.out.println(i*i);
		}
	}
}
