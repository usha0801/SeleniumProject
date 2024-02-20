package testRunnerPackage;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
				features="C:\\Users\\sudhu\\eclipse-workspace\\Pinkproject\\src\\test\\java\\featurePackage\\Rose.feature",
				glue="stepDefinitionPackage",
				dryRun=false,
				monochrome=true
			)
public class Testrunner {

}
