package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src\\test\\java\\Features\\Login.feature"},
		glue = {"Steps"},
		monochrome = true)
		//dryRun = true)

public class LoginTestRunner {

}
