import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {

		// 20 - 2 3 5 7 11 13 15 17 19 --- num%2,3,4,5

		Scanner sc = new Scanner(System.in);
		System.out.println("Print prime number until: ");
		int numbers = sc.nextInt();
		if (numbers == 2) {
			System.out.println(numbers);
		}

		for (int i = 2; i <= numbers; i++) {
			boolean isPrime= true;
			for (int j = 2; j <=i/2; j++) {
			/*	if (i == 2) {
					System.out.print(i+" ");
				}*/
				if (i % j == 0) { 
					isPrime=false;
					break;
				}
			}
				/*else {
					System.out.print(i+" ");
					break;
				}*/
				if(isPrime) {
					System.out.print(i+" ");	
			}
		
			
		}

	}

}
