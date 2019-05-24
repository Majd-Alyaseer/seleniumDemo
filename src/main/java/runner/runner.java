package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

//Cucumber extent report path >> target/cucumber-reports/report.html
//Cucumber html report path >> target/cucumber-html-report/index.html
@CucumberOptions(plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html",
		"html:target/cucumber-html-report",
        "json:target/cucumber.json", "pretty:target/cucumber-pretty.txt",
        "usage:target/cucumber-usage.json", "junit:target/cucumber-results.xml" },
        
	features = { "src/main/java/features" }, //Features package path
        glue = { "stepDefinition"} //Step Definitions package name
        )		

public class runner {
	
}
