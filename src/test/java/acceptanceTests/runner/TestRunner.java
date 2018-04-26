package acceptanceTests.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


/**
 * Created by Karthik on 10/26/2016.
 */

//@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/acceptanceTests/features"} , format = {"json:target/cucumber.json","html:target/site/cucumber-pretty"},
    glue = "acceptanceTests.Steps")
public class TestRunner extends AbstractTestNGCucumberTests{

}
