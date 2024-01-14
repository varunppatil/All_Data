package Techniques;

public class RepetativeCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Varun Patil";
		
		char [] charArray = str.toCharArray();
		int count =0;
		for(int i =0 ; i<str.length();i++) {
			for(int j=i+1; j<str.length();j++) {
				if(charArray[i] == charArray[j]) {
					System.out.println(charArray[j]);
					count ++;
				}
			}
		}
		System.out.println(count);
	}

}
