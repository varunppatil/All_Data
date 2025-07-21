package Demo;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ShadowDOM {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();

		//Method 1 - Try downgrading slenium still not worked
	/*	driver.get("https://selectorshub.com/shadow-dom-in-iframe/");
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.switchTo().frame("pact");

		WebElement shadowHost = driver.findElement(By.cssSelector("div[id='snacktime']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement shadowDOM = (WebElement) js.executeScript("return arguments[0].shadowRoot", shadowHost);

		// SearchContext shadowDOM = shadowHost.getShadowRoot();

		WebElement button = shadowDOM.findElement(By.cssSelector("input[id='tea']"));

		button.sendKeys("2345");*/

		// Method2

		driver.get("https://shop.polymer-project.org/");
		WebElement root1 = driver.findElement(By.tagName("shop-app"));

		WebElement shadowDOM1 = getShadowDOM(driver, root1);
		WebElement ironPages = shadowDOM1.findElement(By.tagName("iron-pages"));
		// The next element is in same shadow DOM so no need to create getDOM for
		// shadowRoot below ironpages not required
		// WebElement shadowDOM2=getShadowDOM(driver, ironPages);
		WebElement home = ironPages.findElement(By.cssSelector("[name='home']"));
		WebElement shadowDOM2 = getShadowDOM(driver, home);

		WebElement shopButton = shadowDOM2.findElement(By.cssSelector("div:nth-child(2) >shop-button>a"));
		shopButton.click();
	}

	static WebElement getShadowDOM(WebDriver driver, WebElement shadowHost) {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement shadowDOM = (WebElement) js.executeScript("return arguments[0].shadowRoot", shadowHost);
		return shadowDOM;
	}

}
