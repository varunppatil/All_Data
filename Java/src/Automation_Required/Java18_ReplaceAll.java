package Automation_Required;

public class Java18_ReplaceAll {

	public static void main(String[] args) {
		
		String str= "{something123}";
		
		
		
	//	str.replaceAll("\\{[^}]+\\}","{}").toString();
	//	str=str.replaceAll("\\{[^\\]+\\}","[ ]").toString();
		str=str.replaceAll("\\{|\\}","").toString();
		
	//	StringBuilder sb = new StringBuilder(str);
		System.out.println(str);
	}

}
