package varunpatil.ExtendReport.ExtentReport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
public class ExtentReportDemo {
ExtentReports extent;
	@BeforeTest
	
	public void config() {
		//ExtendReports, ExtendSparkReporter
		String path = System.getProperty("user.dir")+"\\reports\\index.html";
		// create html file and configrn ---child class for configuration
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Web Automation Results");
		reporter.config().setDocumentTitle("Test Results");
		
		//main class which create report 
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Varun Patil");
		
	}
	
	@Test
	public void initialDemo() {
		ExtentTest test= extent.createTest("Initial Demo");
		System.setProperty("webdriver.edge.driver", "C:\\Users\\HP\\Documents\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		driver.close();
		// U can add condn usring test object
		test.fail("Failed");
		// It will pass but in report it will Fail :) ...
		extent.flush(); // At end necessary
	}
}
