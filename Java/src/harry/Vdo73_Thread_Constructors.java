package harry;

class ForThread extends Thread{
	
	public ForThread(String name) {
		super(name);
	}
	
	public void run() {
		int i=8;
		while(i!=0) {
			System.out.println("THread is running");
			i--;
		}
	}
	
}









public class Vdo73_Thread_Constructors {
	public static void main(String[] args) {
		ForThread t=new ForThread("Varun");
		t.start();
		System.out.println(t.getId() + " " + t.getName() );
	
		
	}

}
