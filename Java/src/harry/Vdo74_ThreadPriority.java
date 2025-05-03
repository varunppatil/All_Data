package harry;


	
	class Thread3 extends Thread{
		
		public Thread3(String name){
			super(name);
		}
		
		@Override
		public void run() {
			int i=800;
			while(i!=0) {
			System.out.println("I am thread 1");
			i--;
			}
		}
		
	}
	
	class Thread4 extends Thread{
		@Override
		public void run() {
			int i=800;
			while(i!=0) {
				System.out.println("I am thread 2");
				i--;
				}
			
		}
		
	}
	
	public class Vdo74_ThreadPriority {
	public static void main(String[] args) {
		
		Thread3 t1=  new Thread3("Varun");
		t1.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		
		Thread4 t2 = new Thread4();
		t2.setPriority(Thread.MIN_PRIORITY);
		t2.start();
		

	}

}
