package SeleniumUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParameterizationProperties {
	
	public static String getPropValue(String popFilePath, String key ) throws IOException {
		Properties prop = new Properties();
		FileInputStream file = new FileInputStream(popFilePath);
		prop.load(file);
		return prop.getProperty(key);
	}

	public static void main(String[] args) throws IOException {
		String propFilePath = "D:\\Study\\Testing Class\\Java\\Batch6\\Batch6Selenium\\src\\SeleniumUtilities\\config.properties";
		System.setProperty("webdriver."+getPropValue(propFilePath, "browser") +".driver", getPropValue(propFilePath,"path"));
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);			
		driver.get(getPropValue(propFilePath,"url"));
	}
}
