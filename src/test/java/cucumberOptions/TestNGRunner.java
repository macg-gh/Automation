package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features",
glue="stepDefinitions" , monochrome=true,
plugin= {"pretty","json:target/cucumber.json"} )
public class TestNGRunner extends AbstractTestNGCucumberTests {

}

//@CucumberOptions(features="src/test/java/features",
//glue="stepDefinitions" , monochrome=true,
//plugin= {"pretty","html:target/cucumber.html"} )
//public class TestNGRunner extends AbstractTestNGCucumberTests {
//
//}

//glue="stepDefinitions" , monochrome=true , tags="not @RegressionTest" )

//@CucumberOptions(features="src/test/java/features",
//glue="stepDefinitions" , monochrome=true  )
//public class TestNGRunner extends AbstractTestNGCucumberTests {
//
//}
