package BookData;

public class BookRunner {

	public static void main(String[] args) {
		
		Book artOfComputerProgramming = new Book();
		Book effectiveJava = new Book();
		Book cleanCode = new Book();
		
		cleanCode.book();
		effectiveJava.book();
		artOfComputerProgramming.book();
		
		/* When instance variable is public
		artOfComputerProgramming.noOfCopies = 20;
		effectiveJava.noOfCopies = 100;
		cleanCode.noOfCopies =150; */
		
		//When instance variable is public
		artOfComputerProgramming.setNoOfCopies(20);
		effectiveJava.setNoOfCopies(100);
		cleanCode.setNoOfCopies(150);
		//artOfComputerProgramming.setNoOfCopies(-20);
		artOfComputerProgramming.increaseCopies(10);
		artOfComputerProgramming.defectedCopiesReturn(100);
		
		System.out.println(artOfComputerProgramming.getNoOfCopies());
		System.out.println(effectiveJava.getNoOfCopies());
		System.out.println(cleanCode.getNoOfCopies());
		artOfComputerProgramming.setNoOfCopies(20);
	}

}
