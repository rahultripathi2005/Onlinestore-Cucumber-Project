package cucumbertest;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:/C Drive Backup/e3016804.old/workspace/OnlineStore/Feature/calculator.feature"
		,glue={"stepDefinition/hooks"}
		)
public class TestRunner {

	
	
}
