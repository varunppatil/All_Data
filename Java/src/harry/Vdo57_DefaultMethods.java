package harry;

interface Phone {
	void cameraCapture();
	void calculator();
	default void nameOfMobile() {
		bigMethodToUtilize();
		System.out.println("Please provide me name ");
	}
	private void bigMethodToUtilize() {
		System.out.println("This method can be use wity default for big methods");
	}
}
interface WiFi {
	String [] wifiNetworks();
	 boolean WifiStatus();
}
class Some implements Phone, WiFi{
	public void cameraCapture() {
		System.out.println("I can take photo");
	}
	public void calculator() {
		System.out.println("Using calculator");
	}
	public String[] wifiNetworks() {
		String [] str33 = {"Sam@1234", "Rock", "peter"};
		return str33;
	}
	public boolean WifiStatus() {
		return true;
	}
	public void nameOfMobile() {
		System.out.println("Override default method... Interesring");
	}
}



public class Vdo57_DefaultMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Some some = new Some();
		some.cameraCapture();
	//We can't talk  some.bigMethodToUtilize();
		some.nameOfMobile();
		
	}

}
