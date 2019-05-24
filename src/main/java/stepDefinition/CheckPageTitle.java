package stepDefinition;

import org.junit.Assert;

import cucumber.api.java.en.Then;
import initilizer.DriverUtitlites;

public class CheckPageTitle {
	@Then("^Check page title is \"([^\"]*)\"$")
	public void checkTitle(String title) throws Throwable {
		String pageTitle = DriverUtitlites.getTitle();
		Assert.assertEquals("Page title is incorrect", title, pageTitle);
	}
}
