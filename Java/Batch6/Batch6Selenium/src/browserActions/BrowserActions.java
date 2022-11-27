package browserActions;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserActions {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Study\\Testing Class\\Java\\Batch6\\Batch6Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		URL url = new URL("https://www.amazon.com/");
		//***********Open the given URL*****************		
		driver.get("https://www.google.com/");
		//***********get the title of page*****************
		String title = driver.getTitle();
		System.out.println("Title: "+title);	
		//***********get the current URL*****************
		String url1 = driver.getCurrentUrl();
		System.out.println("CurrentUrl: "+url1);
		//***********get the page source****************
		String pageSource = driver.getPageSource();
		System.out.println("PageSource: "+pageSource);
		//***********navigate to different URL*****************
		driver.navigate().to("https://www.flipkart.com/");
		driver.navigate().to(url);
		//***********navigate back to previous URL****************
		driver.navigate().back();
		//***********navigate forward to previously opened URL****************
		driver.navigate().forward();
		//***********Refresh the current page****************
		driver.navigate().refresh();
		//***********Maximize the current browser window****************
		driver.manage().window().maximize();
		//***********Minimize the current browser window****************
//		driver.manage().window().minimize();
		//***********Change the size of browser window****************
		Dimension size = new Dimension(500,500);
		driver.manage().window().setSize(size);
		//***********Change the position on browser window****************
//		Point position = new Point(5000,2000);
//		driver.manage().window().setPosition(position);
		//***********To close the current tab in browser****************
		driver.close();
		//***********To close all the tabs in browser****************
		Thread.sleep(5000);
		driver.quit();		
	}
}
