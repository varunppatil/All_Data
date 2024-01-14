package harry;

class Base1{
	public int length;
	private int width;
	
		public Base1() {
			this.length = 4;
			this.width = 5;
			
		}
		public Base1(int l,int b) {
			this.length = l;
			this.width = b;
			
		}
		public void areaOfRectangle() {
			int area = (int) (length*width);
			System.out.println(area);
		}
}

public class Vdo44_constructorOverloadingRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Base1 bsre = new Base1();
		bsre.areaOfRectangle();
		Base1 v = new Base1(4,7);
		v.areaOfRectangle();

	}

}
