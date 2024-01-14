package frameworkrahulsheety;

import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import rahulshettyacademy.pageobjects.LandingPage;

public class StandAloneTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		// System.setProperty("webdriver.edge.driver",
		// "C:\\\\Users\\\\HP\\\\Documents\\\\chromedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/client");
		driver.manage().window().maximize();
		
		LandingPage landingPage = new LandingPage(driver);
		//landingPage.goTo();
		/*
		 * Object obj =driver.getClass(); System.out.println(obj); Object
		 * obj2=driver.hashCode(); System.out.println(obj2);
		 */

		driver.findElement(By.id("userEmail")).sendKeys("varunpatil316@gmail.com");
		driver.findElement(By.id("userPassword")).sendKeys("Password@123");
		driver.findElement(By.id("login")).click();
		Thread.sleep(5000);
		List<WebElement> elements = driver.findElements(
				By.xpath("//div[@class='col-lg-4 col-md-6 col-sm-10 offset-md-0 offset-sm-1 mb-3 ng-star-inserted']"));

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

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='toast-container']")));*/

		// wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className(".ng-animating")));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@routerlink='/dashboard/cart']")).click();

		List<WebElement> listItems = driver.findElements(By.xpath("//div[@class='cartSection']/h3"));

		Boolean match = listItems.stream().anyMatch(listItem -> listItem.getText().equalsIgnoreCase("zara coat 3"));
		Assert.assertTrue(match);
		driver.findElement(By.cssSelector(".totalRow button")).click();

		Actions action = new Actions(driver);

		Thread.sleep(5000);
		action.sendKeys(driver.findElement(By.xpath("//input[@placeholder='Select Country']")), "india").build()
				.perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[contains(@class,'ta-item')])[2]")).click();
		/*
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(
		 * ".ta-results")));
		 * driver.findElement(By.xpath("(//button[contains(@class,'ta-item')])[2]")).
		 * click();
		 */
		
		driver.findElement(By.xpath("// a[@class='btnn action__submit ng-star-inserted']")).click();
		Thread.sleep(3000);
		String msg = driver.findElement(By.cssSelector(".hero-primary")).getText().trim();

		Assert.assertTrue(msg.equalsIgnoreCase("Thankyou for the order."));
		driver.close();

		// a[@class='btnn action__submit ng-star-inserted']

	}
}
