import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Both {

	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Documents\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
		String Url= "https://guru99.com";
		driver.manage().window().maximize();
		driver.get(Url);
		
		// Relative Xpath is implemented here. 
	driver.findElement(By.xpath("//a[starts-with(@title,'Software')]")).click();
		
		//Absolute Xpath is implemented here.
	//	driver.findElement(By.xpath("/div/div")).click();
		
		
		
		}

}
