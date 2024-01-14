package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	@Before("@NetBanking")
	public void netBanking() {
		System.out.println("setup entries in Netbanking databse");
	}
	
	@After
	public void tearDown() {
		System.out.println("Clear the entries");
	}
	
	@Before("@Mortgage")
	public void mortgageSetup() {
		System.out.println("setup entries in Mortage databse");
	}
}

//Before -> Background -> After