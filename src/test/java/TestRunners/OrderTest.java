package TestRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome=true,
		features = {"src/test/resources/AppFeatures/Order.feature"},
		glue = {"stepDefinitions"},
		plugin = {"pretty"}
            )

public class OrderTest {

}
