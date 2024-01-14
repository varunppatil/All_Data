import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassName {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/aclk?sa=L&ai=DChcSEwiUoPvbv9_1AhWug0sFHV-YC0wYABAAGgJzZg&ae=2&sig=AOD64_2WPjaf_FUZZdNeZWGY9Y7ox7GQQg&q&adurl&ved=2ahUKEwjXlvTbv9_1AhW0S2wGHeEtD3kQ0Qx6BAgLEAE");
		
		driver.findElement(By.className("nav-a")).click();
		

	}

}
