package astasoft.flipkart.Utilities;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class CustomWaits {

	public static void fluentSendKey(WebDriver driver, WebElement element, String str) {
		waitForElement(driver, element).sendKeys(str);	
	}
	
	public static void fluentClick(WebDriver driver, WebElement element) {
		waitForElement(driver, element).click();
	}
	
	public static void fluentSubmit(WebDriver driver, WebElement element) {

		waitForElement(driver, element).submit();
	}
	
	public static boolean fluentIsEnabled(WebDriver driver, WebElement element) {
		return waitForElement(driver, element).isEnabled();
	}
	
	public static boolean elementIsDisplayed(WebDriver driver, WebElement element) {
		return waitForElement(driver, element).isDisplayed();
	}
	
	public static WebElement waitForElement(WebDriver driver, WebElement element) {
		FluentWait<WebDriver> wait = new FluentWait<>(driver);
		wait.withTimeout(Duration.ofSeconds(5));  //maximum timeOut
		wait.pollingEvery(Duration.ofMillis(10)); //polling time
		wait.ignoring(NoSuchElementException.class); // hold back exception maximum up to timeOut
		wait.until(ExpectedConditions.visibilityOf(element));
		return element;
	}
}
