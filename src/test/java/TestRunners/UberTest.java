package TestRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome=true,
		features = {"src/test/resources/AppFeatures/Uber.feature"},
		glue = {"stepDefinitions","MyHooks"},
		//tags="@Smoke or @Regression",
		//tags = "@All",
		plugin = {"pretty",
				"json:target/MyReport/report.json",
				"json:target/Myreport/report.xml"},
		
		publish = true
		//monochrome = false
		//dryRun = false
		//strict = true    //   it is deprecated
            )
public class UberTest {

}
