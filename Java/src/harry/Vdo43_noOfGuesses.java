package harry;

import java.util.Random;
import java.util.Scanner;

class Guess{
	
	private int randNo;
	private int userNo;
	private int count;
	public Guess(){
		Random rnd = new Random();
		randNo = 10+ rnd.nextInt(90); // Targeting for 2 digits no 
	System.out.println("The random no is " +randNo);
	}
	
	public void setNoOfGuesses(int count) {
		this.count=count;
		
	}
	public int getNoOfGuesses() {
		
		return count;
	}
	
	
	public int takeUserInput(int user) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Taking input ");
		userNo = user;
		System.out.println("The input no is " + userNo);
		return userNo;
	}
	
	public void isCorrectNo() {
		if(randNo==userNo) {
			System.out.println("No detected by userr is correct " + userNo);
			count++;
		}
		else if (randNo > userNo) {
			System.out.println("Increase " +userNo+ " near random No");
			count++;
			userNo++;
			isCorrectNo();
		}
		else if (randNo<userNo) {
			System.out.println("Decrease " +userNo+ " near random No");
			count++;
			userNo--;
			isCorrectNo();
		}
		
		
	}
	
}





public class Vdo43_noOfGuesses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Guess gs = new Guess();
		gs.setNoOfGuesses(0);
		gs.takeUserInput(50);
		gs.isCorrectNo();
		System.out.println("The no of guesses are "+gs.getNoOfGuesses());
		
	}

}
