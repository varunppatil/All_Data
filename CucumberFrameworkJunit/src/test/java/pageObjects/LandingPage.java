package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	public WebDriver driver;
	By search = By.xpath("//input[@type='search']");
	By productName = By.cssSelector("h4.product-name");
	By increment = By.cssSelector("a.increment");
	By addToCart = By.xpath("//*[text()='ADD TO CART']");
	
	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}

	public void searchItem(String name) {
		driver.findElement(search).sendKeys(name);
	}
	
	public String getProductName() {
		String productName = driver.findElement(By.cssSelector("h4.product-name")).getText();
		return productName;
	}
	
	public void topDealsPage() {
		driver.findElement(By.xpath("//*[text()='Top Deals']")).click();
	}
	public String getTitleLandingPage() {
		return driver.getTitle();
	}

	public void incrementQuantity(int quantity) {
		int i =quantity-1;
		while(i>0) {
			driver.findElement(increment).click();
			i--;
		}
	}
	
	public void addToCart() {
		driver.findElement(addToCart).click();
	}
	

	
}
