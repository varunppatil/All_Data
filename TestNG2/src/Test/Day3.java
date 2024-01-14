package Test;

import org.testng.annotations.Test;

public class Day3 {
	

	@Test
	public void MobileLoginHomeLoan() {
		System.out.println("MobileLogin pehle");
	}
	@Test(dependsOnMethods= {"MobileLoginHomeLoan","WebLoginHome"})
	public void LoginAPIHomeLoan() {
		System.out.println("API after ");
	}
	@Test
	public void WebLoginHome() {
		System.out.println("Login");
	}
	
}
