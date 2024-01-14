
public abstract class Bank {
	abstract int interestRate();
}
class SBI extends Bank() {
	int interestRate() {
		return 9;
	}
	class HDFC extends Bank() {
		int interestRate() {
			return 7;
		}
	}
	
	class B{
		public static void main(String[] args) {
			Bank b=new HDFC();
			System.out.println("Interest rate is"+b.interestRate()+"%");
			Bank b=new SBI();
			System.out.println("Interest rate is"+b.interestRate()+"%");
		}
	}
	
}

