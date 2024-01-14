import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

	public static String url ="https://www.techlistic.com/p/demo-selenium-practice.html";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Documents\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		
//		String url="https://www.techlistic.com/p/demo-selenium-practice.html";
		
		driver.get(url);
		int rows = driver.findElements(By.xpath("//table[@class='tsc_table_s13']//tr")).size();
		System.out.println(rows);
		
		for(int r=1 ; r <= rows;r++) {
			
		String build=driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tbody/tr["+r+"]/td[4]")).getText();
		int reqBuild =Integer.parseInt(build);
		if(reqBuild>2010) {
			String country=driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tbody/tr["+r+"]/td[1]")).getText();
		System.out.println(country);	
		}
		}
		driver.close();
	}

}