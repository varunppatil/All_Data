package Test;

import org.testng.annotations.Test;

public class Day1{
	
	@Test
	public void Demo() {
		System.out.println("Varun Patil here");
	}
	@Test(groups= {"sanity"})
	public void Varun() {
		System.out.println("Varun Patil back with TestNG");
	}
}