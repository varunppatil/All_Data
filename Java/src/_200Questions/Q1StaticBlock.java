package _200Questions;

public class Q1StaticBlock {

// Constructor of the class StaticBlock  
	Q1StaticBlock() {
		this("str");
		System.out.println("Inside the constructor of the class.");
	}
	
	Q1StaticBlock(String str) {
		
		System.out.println("Inside the constructor of the class.");
	}

// print method of the StaticBlock class  
	public static void print() {
		System.out.println("Inside the print method.");
	}

	static {
		System.out.println("Inside the static block.");
	}

// main method  
	public static void main(String[] args) {
//Q1
// instantiating the class StaticBlock  
		Q1StaticBlock sbObj = new Q1StaticBlock();
		print(); // invoking the print() method

// invoking the constructor inside the main() method  
		 new Q1StaticBlock();
//Q2	 
		 //Calling another constructor
		

	}
}