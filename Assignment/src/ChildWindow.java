import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class ChildWindow {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		String Url="http://demoqa.com/browser-windows";
		driver.get(Url);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@id='windowButton']")).click();
		
		String mainWindowHandle = driver.getWindowHandle();
		Set<String> allWindowHandles = driver.getWindowHandles();
		Iterator<String> itr = allWindowHandles.iterator();

		while(itr.hasNext()) {
			String childWindow = itr.next();
			if(!mainWindowHandle.equalsIgnoreCase(childWindow)) {
				driver.switchTo().window(childWindow);
				WebElement text= driver.findElement(By.id("sampleHeading"));
				System.out.println("Heading of child window...." +text.getText());
				//driver.quit();
				}
		}
    
	}
	
}
