package com.FacebookLive.Util;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class Locators {
	
	public WebElement locateVisibleElement(WebDriver driver, String locatorStrategy, String path) {
		return new Locators().waitForVisibilityOfElement(driver, byLocatorStrategy(locatorStrategy, path));
	}
	
	public WebElement locateVisibleElement(WebDriver driver, WebElement element) {
		return new Locators().waitForVisibilityOfElement(driver, element);
	}
	
	public List<WebElement> locateAllVisibleElements(WebDriver driver, String locatorStrategy, String path) {
		return new Locators().waitForVisibilityOfAllElements(driver, byLocatorStrategy(locatorStrategy, path));
	}
	
	public List<WebElement> locateAllVisibleElements(WebDriver driver, List<WebElement> elementList) {
		return new Locators().waitForVisibilityOfAllElements(driver, elementList);
	}
	
	public WebElement waitForVisibilityOfElement(WebDriver driver, By by) {
		WebElement ele = null;
		try {
		FluentWait<WebDriver> fluent = new FluentWait<>(driver);
		fluent.withTimeout(Duration.ofMillis(5000));
		fluent.pollingEvery(Duration.ofMillis(10));
		fluent.ignoring(NoSuchElementException.class, StaleElementReferenceException.class);
		ele = fluent.until(ExpectedConditions.presenceOfElementLocated(by));
		ele = fluent.until(ExpectedConditions.visibilityOf(ele));
		} catch(Exception e) {
			e.printStackTrace();
		}
		return ele;
	}
	
	public WebElement waitForVisibilityOfElement(WebDriver driver, WebElement element) {
		WebElement ele = null;
		try {
		FluentWait<WebDriver> fluent = new FluentWait<>(driver);
		fluent.withTimeout(Duration.ofMillis(5000));
		fluent.pollingEvery(Duration.ofMillis(10));
		fluent.ignoring(NoSuchElementException.class, StaleElementReferenceException.class);
		ele = fluent.until(ExpectedConditions.visibilityOf(element));
		} catch(Exception e) {
			e.printStackTrace();
		}
		return ele;
	}
	
	public List<WebElement> waitForVisibilityOfAllElements(WebDriver driver, By by) {
		List<WebElement> ele = null;
		try {
		FluentWait<WebDriver> fluent = new FluentWait<>(driver);
		fluent.withTimeout(Duration.ofMillis(5000));
		fluent.pollingEvery(Duration.ofMillis(10));
		fluent.ignoring(NoSuchElementException.class, StaleElementReferenceException.class);
		ele = fluent.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
		ele = fluent.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
		} catch(Exception e) {
			e.printStackTrace();
		}
		return ele;
	}
	
	public List<WebElement> waitForVisibilityOfAllElements(WebDriver driver, List<WebElement> elementList) {
		List<WebElement> ele = null;
		try {
		FluentWait<WebDriver> fluent = new FluentWait<>(driver);
		fluent.withTimeout(Duration.ofMillis(5000));
		fluent.pollingEvery(Duration.ofMillis(10));
		fluent.ignoring(NoSuchElementException.class, StaleElementReferenceException.class);
		ele = fluent.until(ExpectedConditions.visibilityOfAllElements(elementList));
		} catch(Exception e) {
			e.printStackTrace();
		}
		return ele;
	}
	
	public WebElement waitForElementToBeClickable(WebDriver driver, String locatorStrategy, String path) {		
		WebElement ele = null;
		try {
		FluentWait<WebDriver> fluent = new FluentWait<>(driver);
		fluent.withTimeout(Duration.ofMillis(5000));
		fluent.pollingEvery(Duration.ofMillis(10));
		fluent.ignoring(NoSuchElementException.class, StaleElementReferenceException.class);
		ele = fluent.until(ExpectedConditions
				.presenceOfElementLocated(byLocatorStrategy(locatorStrategy, path)));
		ele = fluent.until(ExpectedConditions.elementToBeClickable(ele));
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return ele;
	}
	
	public WebElement waitForElementToBeClickable(WebDriver driver, WebElement element) {		
		WebElement ele = null;
		try {
		FluentWait<WebDriver> fluent = new FluentWait<>(driver);
		fluent.withTimeout(Duration.ofMillis(5000));
		fluent.pollingEvery(Duration.ofMillis(10));
		fluent.ignoring(NoSuchElementException.class, StaleElementReferenceException.class);
		ele = fluent.until(ExpectedConditions.elementToBeClickable(element));
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return ele;
	}
	
	public static By byLocatorStrategy(String locatorStrategy, String path) {
		By by = null;
	    switch(locatorStrategy) {
		    case "id": by = By.id(path);
		    break;
		    case "name": by= By.name(path);
		    break;
		    case "className": by= By.className(path);
		    break;
		    case "linkText": by= By.linkText(path);
		    break;
		    case "partialLinkText": by= By.partialLinkText(path);
		    break;
		    case "xpath": by= By.xpath(path);
		    break;
		    case "cssSelector": By.cssSelector(path);
		    break;
		    default: by= null;	   
	    }	    
	    return by;
	}
}
