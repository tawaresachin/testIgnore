package seleniumBasics;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserActions {
	/* To initialise desired browser driver instance*/
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

	/* To perform browser action related operations*/
	public static void browserActions(WebDriver driver) throws InterruptedException, MalformedURLException {		
		// to open specific URL (address of website)
		driver.get("https://www.google.co.in/");
		//to change dimensions of browser
		Dimension size = new Dimension(400,600);    //dimensions HxV in pixel according to resolution
		driver.manage().window().setSize(size);
		//to change position of browser				//position HxV in pixel according to resolution
		Point position = new Point(2000,800);
		driver.manage().window().setPosition(position);		
		//to minimize the browser
		driver.manage().window().minimize();
		//to maximize browser
		driver.manage().window().maximize();
		//to full screen browser
//		driver.manage().window().fullscreen();
		//to navigate to other url (URL = Universal Resource Locator = Website address)
//		driver.navigate().to("https://www.facebook.com/");			//using String url
		URL facebook = new URL("https://www.facebook.com/");		//using URL class object
		driver.navigate().to(facebook);
		//navigate back to previously opened page
		driver.navigate().back();
		//navigate forward to opened page
		driver.navigate().forward();
		//to refresh opened page
		driver.navigate().refresh();
		//to capture the title of the opened page
		String title = driver.getTitle();
		System.out.println("Title: " + title);
		//to capture url of current page
		String url = driver.getCurrentUrl();
		System.out.println("URL of current page: " + url);
		//to capture page source
		String source = driver.getPageSource();
		System.out.println("Page Source: " + source);
		Thread.sleep(5000);     //System wait in milliseconds
		// to close current window
//		driver.close();
		//to close all windows
		driver.quit();
	}
	
	/* Main method*/
	public static void main(String[] args) throws InterruptedException, MalformedURLException {		
		WebDriver driver = BrowserActions.intialisation("chrome");
		BrowserActions.browserActions(driver);
	}

}
