package cucumberOptions;

import org.junit.runner.RunWith;





@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/features",dryRun=false, glue="stepDefinitions"
, monochrome=true,tags="@OffersPage", plugin= {"pretty", "html:target/cucumber.html","json:target/cucumber.json"})
public class JunitRunnerTest {
	
	

	
}