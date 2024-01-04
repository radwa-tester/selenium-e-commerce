package Runner;

import Steps.userregistration;
import io.cucumber.testng.CucumberOptions;
import selen.exercises.TestBase;


@CucumberOptions(features="src/test/java/Feature"
,glue={"userregistration.java"},plugin= {"pretty","html:target/cucumber-html-report"})

public class Testrunner extends TestBase {

}
