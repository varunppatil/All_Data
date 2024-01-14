package cucumberOptions ;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features",dryRun=false, glue="stepDefinitions"
, monochrome=true, tags ="@NetBanking", plugin= {"pretty", "html:target/cucumber.json"})
public class TestNGRunner extends AbstractTestNGCucumberTests{

}
