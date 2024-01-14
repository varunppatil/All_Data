import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {
	
	
	public static void main(String[] args) {
		
    System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Documents\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		//driver.manage().window().maximize();
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	//System.out.println(driver.getPageSource());
	driver.get("http://yahoo.com");
	driver.navigate().back();
	//driver.navigate().forward();
    driver.navigate().to ("http://yahoo.com");	
   // driver.close();
    driver.quit();
    
	}

}
