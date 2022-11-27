package Base;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.FacebookLive.Util.BrowserActions;
import com.FacebookLive.Util.FileOperations;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {	
	
	public static WebDriver driver;
	public static String environmentPath = "D:\\Study\\Testing Class\\Java\\Batch6\\FacebookLive\\resources\\evironment.properties";
	@BeforeSuite
	public void envSetup() {
		String browser = new FileOperations().readProperty(environmentPath, "browser");
		switch(browser) {
		case "safari": 
			WebDriverManager.safaridriver().setup();
			driver = new SafariDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		default:
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		}			
	}
	
	@BeforeTest
	public void initialization() {
		new BrowserActions().setWindowSize(driver, 1600, 960);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
	}
	
	@AfterTest
	public void cleanUp() {
		driver.quit();
		driver = null;
	}	

}
