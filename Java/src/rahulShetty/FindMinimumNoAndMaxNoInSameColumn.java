package rahulShetty;

public class FindMinimumNoAndMaxNoInSameColumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int a[][] = new int {{2,3,1},{4,5,6}};

		int b[][] = { { 2, 3, 1 }, { 4, 5, 6 }, {8,9,10}};
		int min = b[0][0];
		int max = b[0][0];
		int maxValueColNo = 0;
		int maxValueInMinValueCol = 0;
		for(int i=0; i<b.length;i++) {
			for(int j=0;j<b[i].length;j++) {
				//System.out.println(b[i][j]);
				
				if(min>b[i][j]) {
					min=b[i][j];
					maxValueColNo =j;
				}
				if(max<b[i][j]) {
					max=b[i][j];
				}
			}
		}
		for(int k=0;k<b.length;k++) {
			if(min<b[k][maxValueColNo]) {
				maxValueInMinValueCol =b[k][maxValueColNo];
				
			}
			
		}
		
		System.out.println(min);
		System.out.println(maxValueInMinValueCol);
		//System.out.println(max);
	}

}
