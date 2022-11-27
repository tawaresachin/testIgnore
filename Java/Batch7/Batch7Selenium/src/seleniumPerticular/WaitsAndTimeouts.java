package seleniumPerticular;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WaitsAndTimeouts extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		String envProp = Constants.ENVIRONMENT_PROPERTIES;
		String browserName = Parameterization.readProperty(envProp, "browser");
		WebDriver driver = intialisation(browserName);
		
		//***************TimeOuts**********************************
		// To set custom Page load timeout --> time boundary to load elements on page
		// If not satisfied --> throws TimeOutException
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2));
		driver.get("https://www.facebook.com/");
		
		// Script timeout for JavaScript async calls
//		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(3));
		
		//***************Waits*********************
		//1. implicit wait
//		SeleniumWaits.implicitWait(driver, Duration.ofSeconds(3));
//		WebElement userName = driver.findElement(By.name("email"));
		
		//2. explicit wait
		WebElement createNewAccount = driver.findElement(By.xpath("//a[contains(@data-testid,'registration')]"));
		createNewAccount.click();
		
//		Thread.sleep(2000);     //System wait --> prohibited
		
//		WebElement firstName = driver.findElement(By.name("firstname"));
		SeleniumWaits.fluentSendKey(driver, "//*[@name='firstname']", "abcde");  // fluent wait method--> action specific
		
//		WebElement ele = SeleniumWaits.waitForElement(driver, "//*[@name='firstname']");  // fluent wait method --> element specific 
//		ele.sendKeys("abcde");
		
		//********To quit browser*********
		driver.quit();

	}

}
