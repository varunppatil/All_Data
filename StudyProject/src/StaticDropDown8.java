import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown8 {
	
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Documents\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://spicejet.com");
		driver.manage().window().maximize();
		WebElement sr = driver.findElement(By.id("path_of_dropdown"));
		
		Select s=new Select(sr);
		s.selectByValue("2");
		s.selectByIndex(2);
		s.selectByVisibleText("5 adults");
		
		
		//Just refer it will not work cause site is changed alot
		   
		
		
	}

}
