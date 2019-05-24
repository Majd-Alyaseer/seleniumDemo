package stepDefinition;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import initilizer.DriverInitializer;
import initilizer.DriverUtitlites;

public class AfterMethod {

	@After
	 public void afterScenario(Scenario scenario) {
	 if (scenario.isFailed()) {
		 DriverUtitlites.takeScreenShot();
	 }
	 
	 DriverInitializer.getDriver().close();
	 }
	 
}
