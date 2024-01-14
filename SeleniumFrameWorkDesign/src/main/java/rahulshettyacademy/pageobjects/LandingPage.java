package rahulshettyacademy.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import rahulShetty.abstractcomponents.AbstractComponents;

public class LandingPage extends AbstractComponents {
	WebDriver driver;

	public LandingPage(WebDriver driver) {
		// Best place to initialize
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// WebElement userEmail= driver.findElement(By.id("userEmail"));

	// Page Factory

	@FindBy(id = "userEmail")
	WebElement userEmail;

	@FindBy(id = "userPassword")
	WebElement userPassword;

	@FindBy(id="login")
	WebElement submit;

	public void loginApplication(String email, String pass) {
	
	userEmail.sendKeys(email);
	userPassword.sendKeys(pass);
	submit.click();
	
	}
	
	public void goTo(String url) {
		driver.get(url);
	}
	

	@FindBy(xpath="//div[@class='col-lg-4 col-md-6 col-sm-10 offset-md-0 offset-sm-1 mb-3 ng-star-inserted']")
	List<WebElement>products;
	
	public void ListofProduct(String productName)
	{
		for (WebElement ele : products) {

			if (ele.isDisplayed()) {
				String nameProduct = driver.findElement(By.xpath(
						"//div[@class='col-lg-4 col-md-6 col-sm-10 offset-md-0 offset-sm-1 mb-3 ng-star-inserted']/div/div/h5/b"))
						.getText();

				if (nameProduct.equalsIgnoreCase(productName)) {
					driver.findElement(By.xpath("//button[@class='btn w-10 rounded']")).click();
					break;
				}
			}
		}
	}

	@FindBy(xpath="(//button[@class='btn btn-custom'])[3]")
	WebElement addToCart;
	
	public void addToCart() {
		addToCart.click();
	}
	
	@FindBy(xpath="//button[text()='Checkout']")
	
	WebElement checkout;
	
	public void checkout() {
		checkout.click();
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
}
