package rahulShetty.abstractcomponents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import rahulshettyacademy.pageobjects.OrderPage;

public class AbstractComponents {

	WebDriver driver;
	
	public static int low=2000;

	public AbstractComponents(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public void waitForElement(By findBy) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		wait.until(ExpectedConditions.visibilityOfElementLocated(findBy));

	}
	
	public void enterText(By xpath, String str) {
		
		driver.findElement(xpath).sendKeys(str);
	}
	
	@FindBy(xpath="(//button[contains(@class, 'tn btn-custom')])[2]")
	WebElement orderHeader;
	
	public OrderPage goToOrdersPage() {
		orderHeader.click();
		OrderPage cartPage =new OrderPage(driver);
		return cartPage;
	}
}
