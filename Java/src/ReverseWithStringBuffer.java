

public class ReverseWithStringBuffer {

	public static void main(String[] args) {
		
		String name= "Varun Premnath Patil";
		StringBuilder bd2 = new StringBuilder();
		for (String n1:name.split(" ")) {
			StringBuilder bd=new StringBuilder(n1);
			bd.reverse();
			bd2.append(" "+bd);
		}
		System.out.println(bd2.toString().trim());
		StringBuffer sb = new StringBuffer("Varun Premnath Patil");
		for (int i=0;i<sb.length();i++) {
			char ch =sb.charAt(i) ;
			if(Character.isUpperCase(ch)) {
				sb.setCharAt(i, Character.toLowerCase(ch));
			}
			else if (Character.isLowerCase(ch))
				sb.setCharAt(i, Character.toUpperCase(ch));
		}
		System.out.println(sb.toString());
	}
	
	
}
