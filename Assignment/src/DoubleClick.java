
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class DoubleClick {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
	
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	driver.manage().window().maximize();
	
	Actions action=new Actions(driver);
	WebElement element=driver.findElement(By.xpath("//button[contains(text(),'Double-Click Me To See Alert')]"));
	action.doubleClick(element).perform();
	
	Alert alert = driver.switchTo().alert();
	
	System.out.println("Text the alert included is ..."+alert.getText()); //getText is for checking alert msg.
	alert.accept();
	
	
		
		
		
		
		
		
		
		

	}

}
