package Runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import selen.exercises.TestBase;



@CucumberOptions(features="src/test/java/Feature/userreg.feature"
,glue={"Exercise.steps"},plugin= {"pretty","html:target/cucumber-html-report"})

public class Testrunner extends TestBase {

}
