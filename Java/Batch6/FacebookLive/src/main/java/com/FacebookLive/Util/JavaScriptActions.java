package com.FacebookLive.Util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptActions {
	
	public void scrollPageBy(WebDriver driver, int xPosition, int yPosition) {
		JavascriptExecutor js = null;		
		try {
			if(driver == null) {
				throw new Exception("NullDriverException");
			}
			js = (JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(xPosition, yPosition)");			
		} catch(Exception e) {
			e.printStackTrace();
		}		
	}
	
	public void scrollIntoElementView(WebDriver driver, WebElement element) {
		JavascriptExecutor js = null;		
		try {
			if(driver == null) {
				throw new Exception("NullDriverException");
			}
			js = (JavascriptExecutor)driver;
			js.executeScript("argument[0].scrollIntoView(true);", element);			
		} catch(Exception e) {
			e.printStackTrace();
		}		
	}

}
