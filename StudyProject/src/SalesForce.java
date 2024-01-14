import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Documents\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com");
		//driver.findElement(By.name("username")).sendKeys("Varun Leraning");
		//driver.findElement(By.name("pw")).sendKeys("for id and pw using name attributes");
		//driver.findElement(By.id("forgot_password_link")).click();
		//Error cause space in class name 
		//driver.findElement(By.className("input r4 wide mb16 mt8 username")).click();
		//driver.findElement(By.xpath("//*[@id='Login']")).click();
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("VarunPatil");
		driver.findElement(By.cssSelector("input#password.input.r4.wide.mb16.mt8.password")).sendKeys("Success with both xpath and cssSelector");
		//driver.findElement(By.cssSelector("#forgot_password_link")).click();
		driver.findElement(By.cssSelector("#Login")).click();
		System.out.println(driver.findElement(By.cssSelector("#error")).getText());
	}

}
