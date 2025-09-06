package Cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(features = "@target/failed_scenario.txt" //giving path of failed scenario file
,glue="Cucumber"
,plugin={"html:target/cucumber.html"})
public class FailedTestNG extends AbstractTestNGCucumberTests {

    // parallel testing
    @Override
    @DataProvider(parallel=true)
    public Object[][] scenarios(){
        return super.scenarios();
    }
}
