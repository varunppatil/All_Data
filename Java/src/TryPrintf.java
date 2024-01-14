
public class TryPrintf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printThrice(4);
		for(int i=1;i<=10;i++) {
			
			System.out.printf("%d*%d=%d \n",7,i,7*i);
			//printThrice();
		}
		
	}
	
	
	 static void printThrice(int no) {
		 for(int i=1;i<=no;i++) {
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");
		 }
	}

}
