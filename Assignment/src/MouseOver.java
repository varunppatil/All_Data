import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver extends WebTables {

	public static void main(String[] args)   {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://spicejet.com");
		driver.get(url);
		Actions action=new Actions(driver);
		WebElement mouseover=driver.findElement(By.xpath("//div[contains(text(), 'Add-ons')]"));
		WebElement mouseover2=driver.findElement(By.xpath("//div[contains(text(), 'Extra Seat')]"));
		
		action.moveToElement(mouseover).perform();
		// Thread.sleep(5000);
		action.moveToElement(mouseover2).perform();
		mouseover2.click();
	    driver.quit();
		
	}

}
