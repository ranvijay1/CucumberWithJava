package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src\\test\\java\\Features\\Registration.feature"},
		glue = {"Steps"},
		monochrome = true,
		tags = "@Admin, ~@User")
		//dryRun = true)

public class RegistrationTestRunner {

}
