package base;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) throws MalformedURLException {
		String driverType = "webdriver.chrome.driver";
		String driverPath = "D:\\Study\\Testing Class\\jars\\chromedriver_win32\\chromedriver.exe";
		System.setProperty(driverType, driverPath);
		WebDriver driver = new ChromeDriver();
		//-------------------------------------------
		driver.get("https://demoqa.com");
		//-------------------------------------------
		String url = driver.getCurrentUrl();
		System.out.println("URL: "+url);
		//-------------------------------------------
		String source = driver.getPageSource();
		System.out.println("Page Source: "+source);
		//-------------------------------------------
		String title = driver.getTitle();
		System.out.println("Page Title: "+title);
		//-------------------------------------------
		driver.manage().window().minimize();
		//-------------------------------------------	
		Dimension size= new Dimension(100,200);
		driver.manage().window().setSize(size);
		//-------------------------------------------
		Point location = new Point(100,200);
		driver.manage().window().setPosition(location);
		//-------------------------------------------
		driver.manage().window().maximize();	
		//-------------------------------------------
		driver.navigate().to("https://www.google.com");
		//-------------------------------------------
		URL url1 = new URL("https://demoqa.com");
		driver.navigate().to(url1);
		//-------------------------------------------
		driver.navigate().back();
		//-------------------------------------------
		driver.navigate().forward();
		//-------------------------------------------
		driver.navigate().refresh();
		//-------------------------------------------
		driver.close();
		//-------------------------------------------
		driver.quit();		
		
	}

}
