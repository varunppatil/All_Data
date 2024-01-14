package rahulShetty;

public class Vdo24 {

	public static void main(String[] args) {
		
		
		//Break will directly end the loop
		//Continue will skip that iteration only and continue for next iteration if any there....
		
		int m = 23;
		do {
			m++;
			if (m==25) {
				break;
				//continue;
			}
			System.out.println(m);
			
		}
		while(m<27);
	}

}
