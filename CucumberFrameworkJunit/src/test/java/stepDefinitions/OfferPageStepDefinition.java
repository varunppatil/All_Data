package stepDefinitions;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageObjects.LandingPage;
import pageObjects.OffersPage;
import pageObjects.PageObjectManager;
import utils.TestContextSetup;

public class OfferPageStepDefinition {
	public WebDriver driver;
	public String offersPageProductName;
	TestContextSetup testContextSetup;
	PageObjectManager pageObjectManager;

	public OfferPageStepDefinition(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
	}

	@Then("user searched for same shortname (.+) in offers page$")
	public void user_searched_for_same_shortname_in_offers_page(String name)
			throws InterruptedException {
		swithchToOffersPage();
		testContextSetup.pageObjectManager.OffersPage().searchItem(name);
		offersPageProductName = testContextSetup.pageObjectManager.OffersPage().getProductName();

	}

	public void swithchToOffersPage() {
			testContextSetup.genericUtils.switchWindowToChild();
	}

	@And("validate product name in offers page matches landing page")
	public void validate_product_name_in_offers_page_matches_landing_page() {

		Assert.assertEquals(testContextSetup.landingPageProductName, offersPageProductName);
		System.out.println("Product name in landing page is matching with offers page");
		

	}
}
