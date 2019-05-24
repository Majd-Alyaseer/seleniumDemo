package initilizer;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


public class DriverInitializer {
	static WebDriver driver;
	static File file = new File("src/main/java/Properties/config.properties"); 
	static String baseURL= "";
	static String browser= "";
	static String reportConfigPath;
	static String geckoDriverPath ="src/main/java/drivers/geckodriver.exe";
	static String chromePath ="src/main/java/drivers/chromedriver.exe";
	//static DriverInitializer initilizer;

	public static void initiateBrowser() throws Throwable {
		setProperties();
		switch (browser.toLowerCase()){
			case "firefox":
				setFFBrowser();
				break;
			case "chrome":
				setChromeBrowser();
				break;
			default:
				System.out.println("Invalid browser name");
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();		
	}
	
	
	public static void setProperties() throws Throwable {       		
		FileInputStream fileInput = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fileInput);
		baseURL = prop.getProperty("URL");
		browser = prop.getProperty("Browser");
		reportConfigPath = prop.getProperty("reportConfigPath");
	}

	public String getReportConfigPath(){
		if(reportConfigPath!= null) return reportConfigPath;
		else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");		
	}
	
	public static void setFFBrowser(){
		System.setProperty("webdriver.gecko.driver", geckoDriverPath);
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		driver = new FirefoxDriver();
	}

	public static void setChromeBrowser(){
		System.setProperty("webdriver.chrome.driver", chromePath);
	    driver = new ChromeDriver();   
	}
	
	
	public static WebDriver getDriver() {
		
		return driver;
	}
	
}


