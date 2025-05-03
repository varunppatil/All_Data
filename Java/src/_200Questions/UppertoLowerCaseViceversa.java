package _200Questions;

public class UppertoLowerCaseViceversa {

	public static void main(String[] args) {
		
		String str = "Something That Works  ****";
		
		StringBuffer bf = new StringBuffer();
		
		for (int i=0;i<str.length();i++) {
			
			if(Character.isLowerCase(str.charAt(i))) {
				bf.append(Character.toUpperCase(str.charAt(i)));
			}
			else if(Character.isUpperCase(str.charAt(i))) {
				bf.append(Character.toLowerCase(str.charAt(i)));
			}
			else bf.append(str.charAt(i));
			
		}
		
		System.out.println(bf);
		
		
		
		
	}

}
