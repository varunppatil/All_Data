package harry;

public class StringMethods {
	
	public static void main (String[] args) {
		
		String str= "BestBaggddaReBhoBaggdda";
		
		System.out.println(str.length());		
		boolean b = str.equals("Baggdda");
		System.out.println(b);
		System.out.println(str.indexOf("st"));
		System.out.println(str.indexOf("gg",1));
		System.out.println(str.lastIndexOf("gg"));
		System.out.println(str.lastIndexOf("dda"));
		System.out.println(str.lastIndexOf("dda",23));
		
		boolean bh = str.equalsIgnoreCase("BestbaggddareBhoBaggdda");
		System.out.println("Check equalsIgnoreCse method " + bh);
		
		// It means contains method is case sensitive .......
		boolean che = str.contains("Baggdda");
		System.out.println("che  \n ndndjdd"  +che);  // \n is for new line
		System.out.println("I will use tab now\tLet's try" );

		
	}

}
