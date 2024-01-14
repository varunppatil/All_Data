import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {
	
	
	public static void main(String[] args) {
		
		/*Set name and path for driver for specific webdriver
		execute webdriver with proper class name
		excess or execute the link address
		perform whatever you want*/
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://facebook.com");
    driver.findElement(By.id("email")).sendKeys("varunpatil316@gmail.com");
    driver.findElement(By.name("pass")).sendKeys("XYZ");
   // driver.findElement(By.linkText("Forgotten password?")).click();
    //driver.findElement(By.className("class=\"inputtext _55r1 _6luy")).sendKeys("Baggdda");  //class is keep changing so it will not wrok
    driver.findElement(By.xpath("//*[@id=\'u_0_d_8M\']")).click();
    
    
		
		
		
		
	}

}
