package harry;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Vdo99_Gregorian {

	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		
		System.out.println(c.getTime());
		System.out.println(c.get(Calendar.DATE));
		System.out.println(c.get(Calendar.HOUR));
		System.out.println(c.get(Calendar.MINUTE));
		
		System.out.println(c.get(Calendar.HOUR_OF_DAY));
		
		GregorianCalendar cal = new GregorianCalendar();
		
		System.out.println(cal.isLeapYear(2018));		
		System.out.println(TimeZone.getAvailableIDs()[1]);		
		
	
		
	}

}