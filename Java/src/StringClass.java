

public class StringClass
{
	public static void main(String[] args)
	{
		String myAge = "22F";
		String myHeight = "22f";
		String myAgeAfter = myAge;
		//myAge = "25";
		String name = "Varun Premnath Patil";
		StringBuffer s=new StringBuffer(name);
		
		/*System.out.println("The age now  " +myAge);
		System.out.println("The Height now  " +myHeight);*/
		System.out.println("The age after  " +myAgeAfter);
		System.out.println("Some operations..."+myHeight.charAt(0));
		System.out.println("Character in String>>>"+name.charAt(8));
		System.out.println("Next operation in String.." +myHeight.chars());
		System.out.println("Contains method is here.."+name.contains("th "));
		System.out.println("Equals method check karto atta..."+name.equals(myAge));
		System.out.println("Equals ignore bghto atta...."+myHeight.equalsIgnoreCase(myAge));
		System.out.println("Dekh..."+myAge.contentEquals(myHeight));
		
		int a=s.length();
		System.out.println(a);
		
		boolean c=s.equals(myAge);
		
		System.out.println(c);
		
		String str = "I am ";
		
		str=str.concat("Varun");
		str=str.indent(5);
		System.out.print(str);
		System.out.println(str.split("").length+(1));
		
		
		
		
		
		
		
	}
}