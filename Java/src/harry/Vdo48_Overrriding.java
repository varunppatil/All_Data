package harry;

abstract class A {
	public void v1() {
		System.out.println("I am v1 method in class A");
	}
	public void method2() {
		System.out.println("I am method 2 in class A");
	}
	abstract void v3();
}
class B extends A{
	@Override
	public void v1() {
		int a=20;
		super.v1();
		System.out.println("I am v1 method in class B "+a);
	}
	@Override
	public void method2() {
		int b=30;
		super.method2(); // Its on us call or not
		System.out.println("I am method 2 in class B "+b);
	}
	public void v3() {
		System.out.println("Abstract method implemented");
	}
}


public class Vdo48_Overrriding  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new B();
		b.method2();
		b.v1();
	}

}
