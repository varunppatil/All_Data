package _200Questions;

public class RemoveSpecialCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		String str = "abbkdja^*()mls222";
		
		//Remove means replace 
		
		String newStr = str.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(newStr);
		
		
	}

}
