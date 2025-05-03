package harry;

public class ConvertSpacesToUnderscores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "[I am Varun Patil]";
		String newstr = str.replace(" ", "_");
		System.out.println(newstr);
		
		String str1 = newstr.replaceAll("\\[|\\]", " ");
	//	String str1 = newstr.replaceAll("[^_]", " ");
		String str2 = str1.replaceAll("_", " ");
		System.out.println(str2);
	}

}
