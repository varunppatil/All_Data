
public class VowelsInStringToCharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Welcome";
		String str1=str.toLowerCase();
		char [] charArray = str1.toCharArray();
		int noOfVowels = 0;
		for(int i=0;i<charArray.length;i++) {
		if(charArray[i]=='a' || charArray[i]=='e' || charArray[i]=='i' || charArray[i]=='o' || charArray[i]=='u'  )	{
			System.out.println("Vowel present at "+i+ " is " +charArray[i]);
			noOfVowels++;
		}
		
		}
		System.out.println("So no of vowels present are " +noOfVowels);
	}
	}


