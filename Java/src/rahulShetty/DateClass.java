package rahulShetty;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Date d = new Date();
	    SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
	    
	    String formatDate = sdf.format(d);
		
		String date = d.toString();
		System.out.println(date);
		
		System.out.println(formatDate);
		
	}

}
