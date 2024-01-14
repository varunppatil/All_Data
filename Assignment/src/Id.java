import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id {
        
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http:/facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("varun@trial.com");
		
		
	}

}
