package utils;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pageObjects.LandingPage;

public class GenericUtils {
	public WebDriver driver;
	
	public GenericUtils(WebDriver driver) {
		this.driver = driver;
	}
	
	
	
	public void switchWindowToChild() {
		String parentWindow =driver.getWindowHandle();
		System.out.println(parentWindow);
		LandingPage landingPage = new LandingPage(driver);
		landingPage.topDealsPage();
		Set<String> allWindows = driver.getWindowHandles();

		for (String window : allWindows) {

			if (!window.equalsIgnoreCase(parentWindow)) {
				driver.switchTo().window(window);
				if (driver.findElements(By.xpath("//*[@id='search-field']")).size() != 0) {
					break;
				}
			}
		}
	}
	
}
