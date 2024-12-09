package StepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(	features="src/test/resources/FeatureWithTags", 
					glue= {"StepDefinitions"}, 					 
					//tags={"@smoke or @regression"}
					//tags={"@smoke and @regression"}
					//tags={"(@smoke or @regression) and @important"}
					tags={"@regression and not @smoke"}
					)
public class TestRunner_RunWithTags {

}
