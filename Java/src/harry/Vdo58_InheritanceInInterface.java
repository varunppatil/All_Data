package harry;

interface Iam {
	void meth1();
	void meth2();
}

interface Iam2 extends Iam {
	void meth3();
	void meth4();
}

class Bt implements Iam2 {
	public void meth1() {
		System.out.println("I am Varun ");	
	}
	public void meth2() {
		System.out.println("Methods should be public from parent interface");
	}
	public void meth3() {
		System.out.println("I am baggdda");
	}
	public void meth4() {
		System.out.println("I am Varun re bho");
	}
}


public class Vdo58_InheritanceInInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bt b=new Bt();
		b.meth1();
		b.meth2();
		b.meth3();
		b.meth4();
}
}
