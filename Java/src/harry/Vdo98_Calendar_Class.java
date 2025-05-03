package harry;

import java.util.Calendar;
import java.util.TimeZone;

public class Vdo98_Calendar_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	Calendar c= Calendar.getInstance();
		
		System.out.println(c);
		System.out.println(c.getTime());
		System.out.println(c.getCalendarType());*/
		
		Calendar c= Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
		
		System.out.println(c);
		System.out.println(c.getTimeZone().getID());
		System.out.println(c.getCalendarType());
		
	}

} 
