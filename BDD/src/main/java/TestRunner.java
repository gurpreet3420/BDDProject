import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.*;

	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "Features",
			glue = {"stepDefinitions"},
			plugin = {"pretty","html:target/reports"},
			monochrome = true,
			dryRun = false,
			strict = false			
			)

public class TestRunner {

}
