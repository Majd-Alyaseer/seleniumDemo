package stepDefinition;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import initilizer.DriverInitializer;
import initilizer.DriverUtitlites;

public class NavigateToPage {
	
	@Given("^Open google homepage$")
	public void openHomepage() throws Throwable {
		WebDriver driver = DriverInitializer.getDriver();
		driver.navigate().to("https://www.google.jo");	
		DriverUtitlites.takeScreenShot();
	}
}
