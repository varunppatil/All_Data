package harry;



class RunnableImplements1 implements Runnable{
	
	public void run() {
		int i=1000;
		while(i!=0) {
		System.out.println("Thread1 using runnable --- 1");
		i--;
		}
	}
}


class RunnableImplements2 implements Runnable{
	
	public void run() {
		int i=1000;
		while(i!=0) {
		System.out.println("Thread2 using runnable --- 2");
		i--;
		}
	}
}






public class Vdo71_Runnable_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunnableImplements1 r1= new RunnableImplements1();
		RunnableImplements2 r2= new RunnableImplements2();
		
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		t1.start();
		t2.start();
	

	}

}
