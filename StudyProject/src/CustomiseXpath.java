import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomiseXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Documents\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://login.yahoo.com/");
	  driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("Trying_customise_xpath");
		driver.findElement(By.xpath("//input[@id='login-signin']")).click();
		
	}

}
