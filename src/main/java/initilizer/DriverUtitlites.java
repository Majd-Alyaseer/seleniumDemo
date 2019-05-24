package initilizer;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.cucumber.listener.Reporter;

import stepDefinition.BeforeMethod;

public class DriverUtitlites {
	public static WebElement getElementByID(String id) {
		try{
			return DriverInitializer.getDriver().findElement(By.id(id));
		}catch(NoSuchElementException e){
			System.out.println(e);
			return null;
		}
	}
	
	public static WebElement getElementByCss (String selector) {
		try{
			return DriverInitializer.getDriver().findElement(By.cssSelector(selector));
		}catch(NoSuchElementException e){
			System.out.println(e);
			return null;
		}
	}
	
	public static String getTitle(){
		
		return DriverInitializer.getDriver().getTitle();
	}
	
	
	public static void takeScreenShot() {
		byte[] screenshot;
		String SCREEN_SHOTS_PATH="/target/ScreenShots";
		String imageName = "ScreenShot_" + System.currentTimeMillis();
		
			screenshot = ((TakesScreenshot) DriverInitializer.getDriver()).getScreenshotAs(OutputType.BYTES);	
			BeforeMethod.getScenario().write("<a href='../ScreenShots/" + imageName + ".png'><img src='../ScreenShots/"
					+ imageName + ".png' width='100px'height='170px'></a>");
		
		try {
			File destinationPath = new File(System.getProperty("user.dir") + SCREEN_SHOTS_PATH + "/" + imageName + ".png");
			FileUtils.writeByteArrayToFile(destinationPath, screenshot);
			Reporter.addScreenCaptureFromPath(destinationPath.toString());
			 
		} catch (IOException e) {
			System.out.println(e);	
		}
		
	}

}
