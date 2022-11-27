package seleniumPerticular;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWaits {
	
	// 1. Implicit wait= applicable to all elements on the web-page
	public static Timeouts implicitWait(WebDriver driver, Duration duration) {
		Timeouts iWait = driver.manage().timeouts().implicitlyWait(duration);
		return iWait;
	}
	
	//2.a.  Explicit wait --> Fluent wait = applicable only to specific webelement
	public static void fluentSendKey(WebDriver driver, String xpath, String str) {
		waitForElement(driver, xpath).sendKeys(str);	
	}
	
	public static void fluentClick(WebDriver driver, String xpath) {
		waitForElement(driver, xpath).click();
	}
	
	public static void fluentSubmit(WebDriver driver, String xpath) {

		waitForElement(driver, xpath).submit();
	}
	
	public static boolean fluentIsEnabled(WebDriver driver, String xpath) {
		return waitForElement(driver, xpath).isEnabled();
	}
	
	public static boolean elementIsDisplayed(WebDriver driver, String xpath) {
		return webDriverWaitForElement(driver, xpath).isDisplayed();
	}
	
	public static WebElement waitForElement(WebDriver driver, String xpath) {
		FluentWait<WebDriver> wait = new FluentWait<>(driver);
		wait.withTimeout(Duration.ofSeconds(5));  //maximum timeOut
		wait.pollingEvery(Duration.ofMillis(10)); //polling time
		wait.ignoring(NoSuchElementException.class); // hold back exception maximum up to timeOut
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(xpath)));
		WebElement ele = driver.findElement(By.xpath(xpath));
		return ele;
	}
	
	public static WebElement webDriverWaitForElement(WebDriver driver, String xpath) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.pollingEvery(Duration.ofMillis(10)); //polling time
		wait.ignoring(NoSuchElementException.class); // hold back exception maximum up to timeOut
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(xpath)));
		WebElement ele = driver.findElement(By.xpath(xpath));
		return ele;
	}
	
	public static List<WebElement> waitForElements(WebDriver driver, String xpath) {
		//WebDriverWait wait = new WebDriverWait(WebDriver_instance,TimeOut,Polling );
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5),Duration.ofMillis(10));
		
		wait.ignoring(NoSuchElementException.class); // hold back exception maximum up to timeOut
//		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(xpath)));
		wait.until(ExpectedConditions
					.and(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(xpath)),ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(xpath))));
	    List<WebElement> eles = driver.findElements(By.xpath(xpath));
		return eles;
	}

}
