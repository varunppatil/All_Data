package harry;
import java.util.Random;
import java.util.Scanner;

public class Vdo20_RockPaperScissor {

	public static void main(String[] args) {
		
//		My input ...
		System.out.println("Taking my input : ");
		Scanner sc = new Scanner(System.in);
		int myGesture =sc.nextInt();
		System.out.println(myGesture);
		
//		Computer's random no
		System.out.println("Computer's input : ");
		Random r = new Random();
		int compGesture = r.nextInt(3); // Here 3 means it will give random no less than 3
		System.out.println(compGesture);
		
//		Consider 0, 1 & 2 as Rock, Paper & Scissor respectively.		
	//	String _0 = "Rock";
	//	String _1 = "Paper";
	//	String _2 = "Scissor";
						
if((compGesture >=0 && compGesture<=2) && (myGesture>=0 && myGesture<=2)) {
	
	if(compGesture == myGesture) {
		System.out.println("No result : ");
	}
	
	if (compGesture == 0 && myGesture == 1 ) {
		System.out.println("The Paper will cover Rock");
		System.out.println("mygesture will win");
	}
	if (compGesture == 0 && myGesture == 2) {
		System.out.println("The Rock will damage Scissor");
		System.out.println("compGesture will win");
	}
	if (compGesture == 1 && myGesture == 0) {
		System.out.println("The Paper will cover Rock");
		System.out.println("compGesture will win");
	}
	if (compGesture == 1 && myGesture ==2) {
		System.out .println("The Scissor will cut Paper");
		System.out.println("myGesture will win");
	}
	if (compGesture == 2 && myGesture ==0) {
		System.out.println("The Rock will damage Scissor");
		System.out.println("myGesture will win");
	}
	if(compGesture == 2 && myGesture == 1) {
		System.out.println("The Scissor will cut Paper");
		System.out.println("compGesture will win");
	}
}
else
	System.out.println("Something wrong ! gesture you are providing : ");	
	}

}
