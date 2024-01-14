package BookData;

public class Book {
	 private int noOfCopies;
	 

	int getNoOfCopies() {
		return this.noOfCopies;
	}


	void setNoOfCopies(int noOfCopies) {
		if(noOfCopies>0) //for preventing from wrong entries so try to use condition in setter Method
		this.noOfCopies = noOfCopies;
		System.out.println(noOfCopies);
	}
	void increaseCopies(int howMuch) {
		setNoOfCopies(this.noOfCopies + howMuch);
	}
	void defectedCopiesReturn(int howMuch) {
		
		setNoOfCopies(this.noOfCopies - howMuch);
	}

	void book() {
		System.out.println("Books are our friends");
	}
}
