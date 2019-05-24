package stepDefinition;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import initilizer.DriverInitializer;
import initilizer.DriverUtitlites;

public class ClickLink {
	@Given("^Open first result$")
	public void clickLink() throws Throwable {
		WebDriver driver = DriverInitializer.getDriver();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String script = "var resultList=document.querySelector('#ires');"
				 	+	"var firstItem= resultList.getElementsByTagName('a')[0];"
				 	+ 	"firstItem.click(); ";
		
		js.executeScript(script);
		Thread.sleep(500);
		DriverUtitlites.takeScreenShot();
	}
}
