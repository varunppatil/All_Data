package harry;


class Base{
	private int radius;
	private int height;
	  public Base(int radius, int height){
	  this.radius = radius;
	  this.height = height;
	  
	  }
	 

/*	public void setRadius(int radius) {
		this.radius = radius;	
	}
	public int getRadius() {
		return radius;
	}
	public void setHeight(int height) {
		this.height = height;	
	}
	public int getHeight() {
		return height;
	}*/
	public void areaAndVolume() {
		int volume = (int) (3.14 *radius*radius*height);
		int surfaceArea = (int) (2*3.14*radius*(radius+height));
		System.out.println(volume);
		System.out.println(surfaceArea);
	}
	
	
}

public class Vdo44_AreaAndVolumeOfCylinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		Base bs = new Base();
		bs.setRadius(20);
		bs.setHeight(20);
		bs.areaAndVolume();*/
		
		Base bs = new Base (20,20);
		bs.areaAndVolume();
		
	}

}
