package seleniumPerticular;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass {
	
	/* To initialise/instantiate desired browser driver instance*/
	public static WebDriver intialisation(String browser) {
		WebDriver drv = null;
		if(browser.equals("chrome")) {
			//language binding & to locate and initialize browser specific driver
			System.setProperty("webdriver.chrome.driver", "D:\\Study\\Drivers\\Batch7\\chromedriver_win32\\chromedriver.exe");
			//create browser specific driver object
			drv = new ChromeDriver();      // to trigger browser pointed by driver
		}
		if (browser.equals("edge")) {
			System.setProperty("webdriver.edge.driver", "D:\\Study\\Drivers\\Batch7\\edgedriver_win64\\msedgedriver.exe");
			drv = new EdgeDriver();
		}
		if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\Study\\Drivers\\Batch7\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			drv = new EdgeDriver();
		}
		return drv;
	}	
}
