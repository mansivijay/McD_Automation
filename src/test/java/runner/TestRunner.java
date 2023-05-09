package runner;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features=".\\FeatureFile\\FeatureFileUsingPageFactory.feature",
 
                 glue = {"stepDefinition"},
                 dryRun = false,
                 monochrome= true,
                 /*tags= {"@Sanity","@Smoke"},*/
                 plugin= {"pretty","html:target/cucumber-reports",
                		 "json:target/cucumber-reports/cucumber.json",
                		 "junit:target/cucumber-reports/cucumber.xml"})

public class TestRunner {

}
