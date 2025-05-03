package harry;

class NewThread3 extends Thread {

	public NewThread3(String name) {
		super(name);
	}

	@Override
	public void run() {
		int i = 80;
		while (i != 0) {
			System.out.println("I am thread new 3");
			i--;
		}
	}

}

class NewThread4 extends Thread {
	@Override
	//Can't make this static as it's override method
	public void run() {
		int i = 80;
		while (i != 0) {
			System.out.println("I am thread new 4");
			i--;
		}

	}

}

public class Vdo75_ThreadMethods {
	public static void main(String[] args) {

		NewThread3 t1 = new NewThread3("Varun");
		NewThread4 t2 = new NewThread4();
		System.out.println(Thread.currentThread().getState());
		System.out.println(t1.getState());
		t1.start();
		System.out.println(t1.currentThread().getState());

		try {
			t1.join();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getState());
		t2.start();
		System.out.println(Thread.currentThread().getState());

	}

}
