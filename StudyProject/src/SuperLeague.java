

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SuperLeague {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		
		//cssSelector for firstName
		WebElement firstName=driver.findElement(By.cssSelector("input[id='firstName']"));
		firstName.sendKeys("Varun");
		
		//cssSelector for LastName
		WebElement lastName=driver.findElement(By.cssSelector("input[id='lastName']"));
		lastName.sendKeys("Patil");
		
		//Xpath for Email
		WebElement email=driver.findElement(By.xpath("//input[@id='userEmail']"));
		email.sendKeys("baggdda@anything.com");
		
		//Gender cssSelector
		WebElement gender=driver.findElement(By.cssSelector("label[class='custom-control-label']"));
		gender.click();
		
		//Mobile no we use ID
		WebElement mobNo=driver.findElement(By.id("userNumber"));
		mobNo.sendKeys("5652563210");
	/*check mobno take text or not
		mobNo.clear();
		mobNo.sendKeys("anyText"); */
		
		//DOB ID
		WebElement dob=driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
	
		dob.clear();
		dob.sendKeys("24 Apr 1900");
		
		//Subjects Regular css
		WebElement sub=driver.findElement(By.cssSelector("div[class*='subjects-auto-complete']"));
		sub.click();
		sub.sendKeys("Selenium with Java");
	


	}

}
