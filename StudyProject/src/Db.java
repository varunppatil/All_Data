import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Db {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.db.com/index?language_id=1&kid=sl.redirect-en.shortcut");
		driver.findElement(By.xpath("//a[@title=\"Careers\"]")).click();
		
		Alert m=driver.switchTo().alert();
		
		m.accept();
		

	}

}
