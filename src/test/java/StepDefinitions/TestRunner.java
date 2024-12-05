package StepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(	features="src/test/resources/Features", 
					glue= {"StepDefinitions"}, 
					monochrome = true, 
					plugin = {"pretty", "junit:target/JunitReports/report.xml","html:target/HtmlReports","json:target/JSONReports/report.json"}, 
					tags="@SmokeFeature")
public class TestRunner {

}
