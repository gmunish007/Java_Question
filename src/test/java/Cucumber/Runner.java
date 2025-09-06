package Cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(features = "src/test/java/Cucumber"
,glue="Cucumber"
,plugin={"html:target/cucumber.html"+
"rerun:target/failed_scenario.txt"}) //this will send data for all failed testCases in given path, then execute them from failed class runner file
public class Runner extends AbstractTestNGCucumberTests {

    // parallel testing
    @Override
    @DataProvider(parallel=true)
    public Object[][] scenarios(){
        return super.scenarios();
    }
}
