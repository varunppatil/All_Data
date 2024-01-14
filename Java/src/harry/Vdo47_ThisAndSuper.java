package harry;
// Super keyword is used in constructor to call a specific constructor of parent class
// Super keyword for variables and methods to call same name thing from parent class 


class First {
	private int f;
	public int h=45;
	public First() {
		System.out.println("I am first class constructor");
	}
	public First(int a) {
		System.out.println("I am constructor with value a "+a);
	}
	public void name() {
		System.out.println("I am Varun Patil in first class");
	}
	public void first(int b) {
		// This refer to that same class
		this.f=b;
	}
}
class Second extends First {
	private int h = 30;
	public Second() {
		System.out.println("I am second constructor");
	}
	public Second(int b) {
		super(5);
		System.out.println("I am second constructor with value b "+b);
	}
	public void name() {
		System.out.println("I am Varun Patil in second class");
	}
	public void display() {
		name();
		super.name();
		System.out.println(this.h); // We can say only h instead of this.h
		System.out.println(super.h);
		
	}
}
public class Vdo47_ThisAndSuper {

	public static void main(String[] args) {
	Second sec = new Second(3);
	sec.display();
	}
}
