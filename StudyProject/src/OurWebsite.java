import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OurWebsite {
	
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Documents\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		
		String Url="http://setwyn.com";
		
		driver.get(Url);
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("body > div.header > div.header_top > div > div.menu > ul > li:nth-child(3) > a")).click();
		driver.findElement(By.cssSelector("img.img-responsive")).click();
		driver.findElement(By.cssSelector("body > div.wrap > div > div > div > div:nth-child(8) > a > div:nth-child(1) > img")).click();
		
		for(int i=0;i<3;i++)
			{
		driver.findElement(By.xpath("//button[@onclick='plusDivs(1)']")).click();
		i++;
		} 
		
		driver.quit();
		
		//driver.findElement(By.cssSelector("a[href*='product']")).click();
		//driver.findElement(By.xpath("//img[contains(@src,'admin/images/category-img/651305dd8d180d2be46077d36095b298.jpg')]")).click();
	//driver.findElement(By.xpath("//button[contains(@onclick,'plusDivs(1)')]")).click();
	
	}

}
