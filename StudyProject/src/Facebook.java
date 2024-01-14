import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Documents\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://facebook.com/");
		
		
		driver.findElement(By.cssSelector("[id=email]")).sendKeys("Check");
		driver.findElement(By.cssSelector("#pass")).sendKeys("pass");
		driver.findElement(By.cssSelector("button[value='1']")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id='loginform']/div[2]/div[2]/a")).getText());
		
		
		
	}

}
