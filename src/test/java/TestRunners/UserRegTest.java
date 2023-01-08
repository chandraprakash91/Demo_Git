package TestRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/AppFeatures/Registration.feature"},
		glue = {"stepDefinitions"},
		plugin = {"pretty",
				"json:target/MyReport/report.json",
				"json:target/Myreport/report.xml"},
		
		 
		monochrome = true,
		publish = true,
		dryRun = false
		//strict = true    //   it is deprecated
		)
public class UserRegTest {
	

}
