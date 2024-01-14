import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("windowButton")).click();
		//driver.switchTo().frame(1);
		//hb driver.switchTo().alert();
		String parentWindow = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();
		Iterator<String> itr = allWindows.iterator();
		
		while(itr.hasNext()) {
			String childWindow = itr.next();
			if(parentWindow.equalsIgnoreCase(childWindow)) {
				
				driver.switchTo().window(childWindow);
				//System.out.println(driver.getTitle());
			//	WebElement newElement=driver.findElement(By.id("sampleHeading"));
				//System.out.println("The text of window is..."+newElement.getText());
				System.out.println(allWindows);
			}
		}
		
	}

}
