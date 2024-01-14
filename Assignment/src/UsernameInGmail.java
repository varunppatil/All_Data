import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsernameInGmail {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S-2062797469%3A1670135468016515&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=ARgdvAuh5Kuug7InjA4reYP2t8Racsx7bdzNOGR869ww74wgZRnSJcWmQolQUgJdXLDbzoVFLNfN");
		
		WebElement ele = driver.findElement(By.xpath("//input[contains(@type,'email')]"));
		WebElement el1 = driver.findElement(By.xpath("//button[text() ='Forgot email?']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", el1);
		//For Dropdown --- ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(True);", "WebElementofselectdrpdown")
		driver.navigate().back();
		ele.sendKeys("varun@trial.com");
		Thread.sleep(2000);
		ele.sendKeys(Keys.chord(Keys.CONTROL, "a"), "WrongEmail");
		ele.sendKeys(Keys.TAB);
		Thread.sleep(8000);
		driver.quit();
		
		
	}

}
