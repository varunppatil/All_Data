import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebelementsCheck {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://gmail.com/");
		
		
		WebElement m=driver.findElement(By.xpath("//input[@type=\"email\"]"));
				
		m.sendKeys("I'll erase it after pasting");
		
		m.clear();
		
		System.out.println("The element displayed...."+m.isDisplayed());
		System.out.println("The element selected...."+m.isSelected());
		System.out.println("The element enabled....."+m.isEnabled());
		
		if(m.isDisplayed()) {
			m.click();
		}
		
	}

}
