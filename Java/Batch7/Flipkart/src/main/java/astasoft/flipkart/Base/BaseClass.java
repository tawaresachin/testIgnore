package astasoft.flipkart.Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import astasoft.flipkart.Constants.ConfigPaths;
import astasoft.flipkart.Utilities.ReadParam;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public WebDriver driver;
	
	@BeforeSuite
	public void initialization() {
		String Browser = ReadParam.readProperties(ConfigPaths.ENVIRONMENT_VARIABLE_PATH, "browser");
		String url = ReadParam.readProperties(ConfigPaths.ENVIRONMENT_VARIABLE_PATH, "url");
		if(Browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		if (Browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		if (Browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
	}
	
	@AfterSuite
	public void tearDown() {
		driver.quit();
		driver = null;
	}
	
}
