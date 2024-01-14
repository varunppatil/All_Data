import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckSelenium {

	public static void main(String[] args) throws InterruptedException {
		
		
	System.setProperty("webdriver.chrome.driver", "C://Users//HP/Documents//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	
	driver.manage().window().maximize();
	driver.get("http:/google.com");
	
	//System.out.println(driver.getTitle());
	
	//Try to print title using string
	
	String m=driver.getTitle();
	
	System.out.println("I want to print url    " +m);
	
	//System.out.println(driver.getPageSource());
	
	driver.navigate().to ("http://yahoo.com");
	
	driver.navigate().back();
	driver.navigate().refresh();
	//Thread.sleep(4000);
	driver.quit();
	
	}

}
