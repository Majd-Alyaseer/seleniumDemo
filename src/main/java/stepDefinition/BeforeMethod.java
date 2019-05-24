package stepDefinition;


import cucumber.api.Scenario;
import cucumber.api.java.Before;
import initilizer.DriverInitializer;

public class BeforeMethod {
	public static Scenario myScenario;
	
	@Before
	public void setup (Scenario scenario) throws Throwable{
		DriverInitializer.initiateBrowser();
		myScenario = scenario;
	}
	
	public static Scenario getScenario(){
		return myScenario;
	}
}
