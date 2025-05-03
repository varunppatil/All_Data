package Char;

public class Charcode {

	public char ch;

	/*
	 * public Charcode(char ch) { this.ch= ch; }
	 */
	
	public boolean isDigit(char ch) {
		int b = (int) ch;
		if( ((int )ch)>=48 && ((int)ch)<=57) {
			return true;
		}
		
		return false;
		}
	
	public static void main(String [] args) {
		
	}
	
	public static CharRunner returnObject() {
		CharRunner ch = new CharRunner();
		return ch;
	}



	
}
