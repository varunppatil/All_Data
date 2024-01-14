package frameworkrahulsheety;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import rahulshetty.testcomponents.BaseTest;
import rahulshetty.testcomponents.Retry;
import rahulshettyacademy.pageobjects.LandingPage;
import rahulshettyacademy.pageobjects.OrderPage;

public class SubmitOrderTest extends BaseTest implements IRetryAnalyzer {
String productName = "zara coat 3";
	@Test(retryAnalyzer= Retry.class)
	public void submitOrder() throws InterruptedException, IOException {
		//launchApplication();
		//Code is not fully in Page Factory Model
		String url= "https://rahulshettyacademy.com/client";
		//driver.manage().window().maximize();	
		LandingPage landingPage = new LandingPage(driver);
		landingPage.goTo("https://rahulshettyacademy.com/client");
		landingPage.loginApplication("varunpatil316@gmail.com", "Password@123");	
		Thread.sleep(3000);
		landingPage.ListofProduct("zara coat 3");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//button[@class='btn btn-custom'])[3]")).click();
		landingPage.addToCart();
		Thread.sleep(2000);
		landingPage.checkout();		
		Thread.sleep(2000);		
		Actions action = new Actions(driver);
		action.sendKeys(driver.findElement(By.xpath("//input[@placeholder='Select Country']")), "india").build()
		.perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[contains(@class,'ta-item')])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("// a[@class='btnn action__submit ng-star-inserted']")).click();
		Thread.sleep(3000);
		String msg = driver.findElement(By.cssSelector(".hero-primary")).getText().trim();
		AssertJUnit.assertTrue(msg.equalsIgnoreCase("Thankyou for the order."));
		tearDown();
	}
	
	@Test(dependsOnMethods= {"submitOrder"})
	
	public void orderHistory() throws IOException  {
		launchApplication();
		//Code is not fully in Page Factory Model
		String url= "https://rahulshettyacademy.com/client";
		//driver.manage().window().maximize();	
		LandingPage landingPage = new LandingPage(driver);
		landingPage.goTo("https://rahulshettyacademy.com/client");
		landingPage.loginApplication("varunpatil316@gmail.com", "Password@123");
		
		OrderPage orderPage = new OrderPage(driver);
		orderPage.goToOrdersPage();
		orderPage.VerifyProductDisplay(productName);
				
	}

	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		return false;
	}
}
