package rahulshettyacademy.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import rahulShetty.abstractcomponents.AbstractComponents;

public class ProductCatalogue extends AbstractComponents {
	WebDriver driver;

	public ProductCatalogue(WebDriver driver) {
		// Best place to initialize
	    super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// WebElement userEmail= driver.findElement(By.id("userEmail"));

	// Page Factory

	
	public void iterateOnProduct(List<WebElement> products) {
		List<WebElement> elements = products;
		for (WebElement ele : elements) {

			if (ele.isDisplayed()) {
				String nameProduct = driver.findElement(By.xpath(
						"//div[@class='col-lg-4 col-md-6 col-sm-10 offset-md-0 offset-sm-1 mb-3 ng-star-inserted']/div/div/h5/b"))
						.getText();

				if (nameProduct.equalsIgnoreCase("zara coat 3")) {
					driver.findElement(By.xpath("//button[@class='btn w-10 rounded']")).click();
					break;
				}
			}
		}
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
