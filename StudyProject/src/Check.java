import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Documents\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://google.com" );
		driver.navigate(). to ("http://yahoo.com");
		driver.navigate().back();
		driver.getTitle();
		driver.manage().window().maximize();
		
		driver.getPageSource();
		//System.out.println(driver.getCurrentUrl());
	}

}
