package Automation_Required;

public class Java10_FindDuplicatesInArrayWithoutSetLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arrToCheck = { 67, 5, 67, 26, 5, 2, 90 };
		
		for (int i=0; i<arrToCheck.length;i++) {
			
		for(int j=i+1; j<arrToCheck.length;j++) {
				
				if (arrToCheck[i]==arrToCheck[j]) {
					System.out.print(arrToCheck[i]+ " ");
				}
				
			}
		}

	}

}
