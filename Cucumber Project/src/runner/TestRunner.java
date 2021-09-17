package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features="Feature/login.feature", glue= {"stepDefinition"}, tags = {"@smoke"}, plugin = {"usage", "junit:junitrepo/cucumberjunit/cucumberrep.xml"})
public class TestRunner {

}

