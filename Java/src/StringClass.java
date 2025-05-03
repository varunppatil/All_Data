

public class StringClass
{
	public static void main(String[] args)
	{
		String myAge = "22F";
		String myHeight = "22F";
		String myAgeAfter = myAge;
		//myAge = "25";
		String name = "  Varun Premnath Patil   ";
	
		String nameSub = name.substring(name.indexOf('n')+1, name.indexOf('l')+1);
		System.out.println(nameSub);
		
		
		//	System.out.println(name.strip());
		System.out.println(name.trim());
		StringBuffer s=new StringBuffer(name);
		
		StringBuffer sb = new StringBuffer("Varun");
		sb.replace(0,1,"VA");
		System.out.println(sb.reverse());
		
		sb.delete(2,4);
		System.out.println(sb);
		
		sb.deleteCharAt(0);
		System.out.println(sb);
		
		
		System.out.println("The age now  " +myAge.replace('2','8'));
		System.out.println("The Height now  " +myHeight);
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