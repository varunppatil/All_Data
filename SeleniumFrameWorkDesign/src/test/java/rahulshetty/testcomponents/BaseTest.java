package rahulshetty.testcomponents;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;



import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	protected WebDriver driver;
	public WebDriver initializeDriver() throws IOException {
		
		Properties prop = new Properties();
//		FileInputStream input = new FileInputStream("D:\\Games\\GlobalData.properties");
		FileInputStream input = new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\SeleniumFrameWorkDesign\\src\\main\\java\\resources\\prop.properties");
		prop.load(input);
		String browserName=System.getProperty("browser")!=null ? System.getProperty("brower"): prop.getProperty("browser");
		//String browserName=prop.getProperty("browserName");
		//String browserName="edge";
		switch(browserName){
	    case "chrome":
	    	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\HP\\\\Documents\\\\chromedriver.exe");	
		driver = new ChromeDriver();		
		driver.manage().window().maximize();			
		break;
		
	    case "edge":		
	   System.setProperty("webdriver.edge.driver", "C:\\\\Users\\\\HP\\\\Documents\\\\msedgedriver.exe");		
		driver = new EdgeDriver();		
		driver.manage().window().maximize();
		break;
	/*
	 * default :
	 * 
	 * WebDriverManager.chromedriver().setup(); driver = new ChromeDriver();
	 * driver.manage().window().maximize();
	 */
		
		}
		return driver;
	}
	
	public String getScreenshot(String testCaseName, WebDriver driver) throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source= ts.getScreenshotAs(OutputType.FILE);
		File file =new File (System.getProperty("user.dir")+"//reports" + testCaseName + ".png");
		FileUtils.copyFile(source, file);
		return System.getProperty("user.dir")+"//reports" +testCaseName + ".png";
		
	}
	@BeforeMethod(alwaysRun=true)
	public void launchApplication() throws IOException {
		driver=initializeDriver();
	}
	@AfterMethod(alwaysRun=true)
	public void tearDown() {
		driver.close();
	}


}
