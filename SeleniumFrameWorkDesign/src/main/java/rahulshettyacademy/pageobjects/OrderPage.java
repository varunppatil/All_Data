package rahulshettyacademy.pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import rahulShetty.abstractcomponents.AbstractComponents;

public class OrderPage extends AbstractComponents {
	
	WebDriver driver;
	public OrderPage(WebDriver driver) {
	super(driver);
	this.driver=driver;
	PageFactory.initElements(driver,this);
	
		// TODO Auto-generated constructor stub
	}

	

	@FindBy(css = ".totalRow button")
	WebElement checkoutEle;

	@FindBy(css = "tr td:nth-child(3)")
	private List<WebElement> productNames;

	public Boolean VerifyProductDisplay(String productName) {
		Boolean match = productNames.stream().anyMatch(product-> product.getText().equalsIgnoreCase(productName));
		return match;
}
	



}
