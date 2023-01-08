package TestRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome=true,
		features = {"src/test/resources/AppFeatures/Search.feature"},
		glue = {"stepDefinitions","MyHooks"},
		plugin = {"pretty",
				"json:target/MyReport/report.json",
		        "json:target/Myreport/report.xml"}
            )

public class AmazonTest {

}
