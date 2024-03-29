package stepDefinitions;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import utils.TestContextSetup;

public class LandingPageStepDefinition {
	public WebDriver driver;
	TestContextSetup testContextSetup;
	LandingPage landingPage;
	public LandingPageStepDefinition(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		this.landingPage=testContextSetup.pageObjectManager.getLandingPage();
	}
	
	

	@Given("User is on GreenCart Landing page")
	public void user_is_on_green_cart_landing_page() {
		
	// Due to testContextSetup setup in constructor testContextSetup constructor is agetting call
	//in that WebDriver manager method is called
		
	//	testContextSetup.testBase.WebDriverManager();
		Assert.assertTrue(landingPage.getTitleLandingPage().contains("GreenKart"));
		
	}

	@When("^user searched with Shortname (.+) and extracted actual name of product$")
	public void user_searched_with_shortnamr_and_extracted_actual_name_of_product(String shortName) throws InterruptedException {
		LandingPage landingPage = testContextSetup.pageObjectManager.getLandingPage();
		landingPage.searchItem(shortName);
		Thread.sleep(4000);
		testContextSetup.landingPageProductName = landingPage.getProductName().split("-")[0].trim();
		System.out.println(TestContextSetup.landingPageProductName + "is extracted from Home Page");
	}
	
	@And("^Added (.+) items of the selected product to cart$")
	public void Added_3_items_of_the_selected_product(String quantity) throws InterruptedException {
		Thread.sleep(3000);
		landingPage.incrementQuantity(Integer.parseInt(quantity));
		landingPage.addToCart();
	}

	
}
