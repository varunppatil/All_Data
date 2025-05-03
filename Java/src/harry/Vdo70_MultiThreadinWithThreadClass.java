package harry;

class Thread1 extends Thread {
	@Override
	public void run() {
		int i=1000;
		while (i>0) {
			System.out.println("Thread1 is running");

			System.out.println("Still running Thread 1 .....");
			i--;
		}
	}
}

class Thread2 extends Thread {
	@Override
	public void run() {
		int i=1000;
		while (i>0) {
			System.out.println("Thread2 is running");

			System.out.println("Still running Thread 2 .....");
			i--;
		}
	}

}

public class Vdo70_MultiThreadinWithThreadClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread1 t1 = new Thread1();

		Thread2 t2 = new Thread2();

		t1.start();
		t2.start();

	}

}
