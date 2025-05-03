
public class CharacterPractise {

	public static void main(String[] args) {
				
		//Character.toString(ch);
		//Character.valueOf(ch)
		//ch+ ""
				
		char ch='c', ch2='c', ch3='d', ch4='_' , ch5=' ';
		String st="c";
		System.out.println(Character.compare(ch,ch2));
		System.out.println(Character.compare(ch,ch3));
		System.out.println(Character.isAlphabetic(ch));
		System.out.println(Character.isAlphabetic(ch4));
		System.out.println(Character.isLetter(ch));
		System.out.println(Character.isLetterOrDigit(ch4));
		System.out.println(Character.getType(ch3));
		System.out.println(Character.isWhitespace(ch3));
	//	System.out.println(Character.isSpace(ch3));
		System.out.println(Character.valueOf(ch)); //returns Character
	}

}
