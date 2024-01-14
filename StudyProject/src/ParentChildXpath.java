import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentChildXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Documents\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://google.com" );
		//driver.findElement(By.xpath("//body[@jsmodel='hspDDf']/div/div/div/div/div/div/div/div[2]/a")).click();
		driver.findElement(By.xpath("//*[text()= \"Sign in\"]")).click();
		driver.findElement(By.xpath("//*[()=\"Forgot emaitextl?\"]")).click();
		driver.findElement(By.xpath("//div[@class='V']")).click();
		//System.out.println(driver.getCurrentUrl());
	}

}
