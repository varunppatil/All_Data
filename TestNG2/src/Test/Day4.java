package Test;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Day4 {
	
	@Test
	public void SomeTest() {
		System.out.println("SomeTest");
	}
	@Test
	public void SomeData() {
		System.out.println("SomeData");
	}
	@Parameters({ "URL" })
	@Test//(timeOut=40000)
	public void SomeThing(String url) {
		System.out.println(url);
		//driver.get(url);
		//driver.findElement(By.id("q")).click();
	}
	@Test
	public void ThingSomeReverse() {
		System.out.println("ThingSomeReverse");
	}
	
	@Test(dataProvider="getData")
	public void needdata(String username, String pwd) {
		System.out.println(username + " " + pwd);
	}
	//@DataProvider(name="needdata")
	@DataProvider
	public String[][] getData() {
		
		String[][] data= {{"first","pwdfirst"},{"Second","Secondpwd"},{"Third","pwdThird"}};
		
		return data;
		

	}
}
