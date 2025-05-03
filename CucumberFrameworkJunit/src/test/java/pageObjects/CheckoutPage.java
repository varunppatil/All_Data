package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
	public WebDriver driver;
	By cartBag = By.alt='CartcssSelector("[']");
	By checkoutButton = By.xpath("//button[text()='PROCEED TO CHECKOUT']");
	By promoBtn= By.cssSelector(".promoBtn");
	By placeOrder = By.xpath("//button[text()='Place Order']");
	
	
	public CheckoutPage(WebDriver driver) {
		this.driver = driver;
	}

	public void checkoutItems() {
		driver.findElement(cartBag).click();
		driver.findElement(checkoutButton).click();
	}
	
	public Boolean verifyPromoBtn() {
	
		return driver.findElement(promoBtn).isDisplayed();
	}
	
	public Boolean verifyPlaceOrder() {
		
		return driver.findElement(placeOrder).isDisplayed();
	}
	
}
