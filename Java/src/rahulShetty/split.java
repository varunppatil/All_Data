package rahulShetty;

public class split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Transaction completed successfully [252010] kjhkfahdh";
		String st=str.replaceAll("[^\\d]","");
		System.out.println(st);
		System.out.println(str.matches(".*[\\d].*"));
		String sarr[]=str.split(".*[\\d].*", -1);
		System.out.println((sarr[0] + " " + sarr[1]));
		

}
}
