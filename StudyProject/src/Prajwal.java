import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prajwal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Documents\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/date-picker");
		
	WebElement	m=driver.findElement(By.xpath("//input[@class='react-datepicker-ignore-onclickoutside' or @value='03/01/2022']"));
	    m.click();
	//m.click();
		//m.click();
		driver.findElement(By.xpath("//div[text()='1' or  @aria-label='Choose Tuesday, March 1st, 2022']//following::div[1]")).click();
	}

}
