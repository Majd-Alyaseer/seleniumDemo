package stepDefinition;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.When;
import initilizer.DriverUtitlites;

public class SearchForTopic {

	@When("^Search for \"([^\"]*)\" topic$")
	public void search_for_topic(String text) throws Throwable {
		WebElement searchBox = DriverUtitlites.getElementByCss("input[role=\"combobox\"]");
		searchBox.sendKeys(text);
		searchBox.sendKeys(Keys.ENTER);
	}
}
