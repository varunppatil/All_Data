import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		Actions action = new Actions(driver);
		WebElement element= driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
		
		action.contextClick(element).build().perform();
		
		driver.findElement(By.xpath("//body/ul/li[1]")).click();
		
		//Thread.sleep(6000);
		Alert s=driver.switchTo().alert();
		
		System.out.println("The alert text is ...."+s.getText());
		//s.accept();
		

	}

}
