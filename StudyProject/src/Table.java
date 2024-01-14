
public class Table {

	
	static void table(int tab,int from, int to) {
		for(int i=from;i<=to;i++) {
			System.out.println(+tab+"*"+i+"="+tab*i);
		}
	}
	public static void main(String[] args) {
		table(6,11,20);
	}
}
