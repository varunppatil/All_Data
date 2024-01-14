

 abstract class Bike {
	 abstract void run() ;
}
 
 class Hero extends Bike {
	 void run() {
		 System.out.println("Something we added ");
	 }
	
	 public static void main(String[] args) {
	 Bike bk = new Hero ();
	 bk.run();
	 AccessModifiers.staticWithpublic();
	 AccessModifiers a=new AccessModifiers();
	 a.staticWithoutpublic();
	 }
	 
public void check() {
	AccessModifiers.staticWithpublic();
//	 AccessModifiers.staticWithoutpublic();
}
 }
