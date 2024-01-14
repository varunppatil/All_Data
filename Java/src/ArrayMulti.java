import java.util.Scanner;

public class ArrayMulti {

	public static void main(String[] args) {
	
		int [][] nos = new int[2][2];
		
		
		for(int i=0;i<nos.length;i++) {
		
			
			
			for(int j=0;j<nos[i].length;j++) {
				Scanner a=new Scanner(System.in);
				System.out.println("Take a input");
				int b=a.nextInt();
				nos[i][j]=b;
				System.out.println(nos[i][j]);
			}
		}
			for(int i=nos.length-1;i>=0;i--) {
				
				for(int j=nos[i].length-1;j>=0;j--) {
					
					
					System.out.println(nos[i][j]);
				//	System.out.println(nos.length);

		}
	}
			System.out.println(nos.length);

		}
	}
