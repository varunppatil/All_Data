import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Any shortcut method you create must have driver or getdriver method else u have to initiate everything for driver
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		// For now keep it
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		
		// For loading page
//s		wait.until(driver -> ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete"));
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("q")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("q")));
		wait.until(ExpectedConditions.alertIsPresent());
}
}
