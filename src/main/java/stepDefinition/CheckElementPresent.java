package stepDefinition;

import org.junit.Assert;

import cucumber.api.java.en.Then;
import initilizer.DriverUtitlites;

public class CheckElementPresent {
	@Then("^Check element present \"([^\"]*)\"$")
	public void checkElementNotPresent(String elementID) throws Throwable {
		Boolean isPresent = DriverUtitlites.getElementByID(elementID).isDisplayed();	
		Assert.assertTrue("Element isn't present", isPresent);
	}
}
