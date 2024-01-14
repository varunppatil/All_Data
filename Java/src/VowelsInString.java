
public class VowelsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Welcome";
		int count = 0;
		for(int i = 0; i< str.length(); i++) {
				
		if (str.charAt(i) == ('a') || str.charAt(i) == ('e') || str.charAt(i) == ('i') || str.charAt(i) == ('o') || str.charAt(i) == ('u') ) {
			System.out.println("Vowel present at : " +i+ " in String  " +str.charAt(i));
			//boolean b =str.contains("a") || str.contains("e") || str.contains("i") || str.contains("o") || str.contains("u");
		  //  if (str.contains("a") || str.contains("e") || str.contains("i") || str.contains("o") || str.contains("u") )	{	
		    	count ++;
		}
		   
		}
		 System.out.println("No of vowels present in string are : " + count);
	}
}
