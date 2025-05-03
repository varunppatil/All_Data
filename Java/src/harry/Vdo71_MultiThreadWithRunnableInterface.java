package harry;


//Check different in multi threading


class MyRunnable implements Runnable {

	@Override
	public void run() {
		int i = 0;
		while (i < 900) {
			System.out.println("Thread with runnable interface 1st time");
			i++;
		}
	}

}

class MyRunnable2 implements Runnable {

	@Override
	public void run() {
		int i = 0;
		while (i < 900) {
			System.out.println("Thread with runnable interface 2nd time");
			i++;
		}

	}
}

	public class Vdo71_MultiThreadWithRunnableInterface {

		public static void main(String[] args) {

			MyRunnable rn = new MyRunnable();
			MyRunnable2 rn2 = new MyRunnable2();
			
			Thread th = new Thread(rn);
			th.setPriority(9);
			Thread th2 = new Thread(rn2);
			th.start();
			//Due this step after ending thread 1 thread 2 will start
			try {
				th.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			th2.start();
			th2.setPriority(5);

			// TODO Auto-generated method stub

		}

	}

