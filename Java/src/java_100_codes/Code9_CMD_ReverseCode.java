package java_100_codes;

public class Code9_CMD_ReverseCode {

	public static void main(String[] args) {

		String nameToReverse = "Varun Patil";

		char ch;
		String reverse = "";

		for (int i = nameToReverse.length() - 1; i >= 0; i--) {

			ch = nameToReverse.charAt(i);

			reverse = reverse + ch;

		}

		System.out.println(reverse);

	}
}