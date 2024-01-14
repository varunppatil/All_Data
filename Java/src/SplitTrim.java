
public class SplitTrim {
	public static void main(String[] args) {
		String b=" I ::am::Varun::Patil";
		String [] s= b.split(":");
		for(int i=0; i<s.length;i++) {
		System.out.println(s[i]);
		}
		String st=s[0].trim();
		System.out.println(st);
		String g=b.replaceAll("::", " ");
		System.out.println(g);
	}

}
