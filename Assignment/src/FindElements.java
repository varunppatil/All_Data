
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
	driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&dsh=S1107604782%3A1643753559665417&biz=false&flowName=GlifWebSignIn&flowEntry=SignUp");
		
   List<WebElement>   allElements = driver.findElements(By.xpath("//input[@type='text']"));
   		ArrayList<String> options = new ArrayList();
   		for(WebElement ele: allElements) {
   		String option=	ele.getText();
   		options.add(option);
   		
   		}
       System.out.println("no of elements...."+allElements.size());
      
       

	}

}
