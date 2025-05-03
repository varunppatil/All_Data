package harry;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Vdo100_Java_time {

	public static void main(String[] args) {
	
		
		LocalDate d= LocalDate.now();
		System.out.println(d);
		System.out.println(d.isLeapYear());
		
		System.out.println(d.getYear());
		
		LocalDateTime t2 = LocalDateTime.now();
		System.out.println(t2.getDayOfMonth());

		
	}

}
