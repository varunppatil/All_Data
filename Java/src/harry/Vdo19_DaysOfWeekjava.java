package harry;
import java.util.Scanner;

public class Vdo19_DaysOfWeekjava {

	public static void main(String[] args) {
		
		System.out.println("Serial no of Day in week: ");
		Scanner sc = new Scanner(System.in);
		int dayNo = sc.nextInt();
		
		switch(dayNo) {
		
		case 1:
			System.out.println("It's Monday: ");
			break;
		case 2:
			System.out.println("It's Tuesday: ");
			break;
		case 3:
			System.out.println("It's Wednesday: ");
			break;
		case 4:
			System.out.println("It's Thursday: ");
			break;
		case 5:
			System.out.println("It's Friday: ");
			break;
		case 6:
			System.out.println("It's Saturday: ");
			break;
		case 7:
			System.out.println("It's Sunday: ");
			break;
		default:
			System.out.println("Serial no you given is not valid Day no: ");
		
		}
		
		

	}

}
