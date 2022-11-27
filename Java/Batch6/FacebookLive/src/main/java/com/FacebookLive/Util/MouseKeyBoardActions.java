package com.FacebookLive.Util;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseKeyBoardActions {
	
	public Actions getActionInstance(WebDriver driver) {
		Actions action = null;
		try {
			if(driver == null) {
				throw new Exception("NullDriverException");
			}	
			action = new Actions(driver);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return action;
	}
	
	public void clickOnElement(WebDriver driver, WebElement element) {
		Actions action = null;
		try {
			if(driver == null) {
				throw new Exception("NullDriverException");
			}	
			action = new MouseKeyBoardActions().getActionInstance(driver);
			action.moveToElement(element).click().build().perform();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void rightClickOnElement(WebDriver driver, WebElement element) {
		Actions action = null;
		try {
			if(driver == null) {
				throw new Exception("NullDriverException");
			}	
			action = new MouseKeyBoardActions().getActionInstance(driver);
			action.moveToElement(element).contextClick().build().perform();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void dragToLocation(WebDriver driver, WebElement fromElement, int xPosition, int yPosition) {
		Actions action = null;
		try {
			if(driver == null) {
				throw new Exception("NullDriverException");
			}	
			action = new MouseKeyBoardActions().getActionInstance(driver);
			action.clickAndHold(fromElement).moveByOffset(xPosition, yPosition).release().build().perform();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void dragAndDrop(WebDriver driver, WebElement fromElement, WebElement toElement) {
		Actions action = null;
		try {
			if(driver == null) {
				throw new Exception("NullDriverException");
			}	
			action = new MouseKeyBoardActions().getActionInstance(driver);
			action.dragAndDrop(fromElement, toElement).build().perform();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void copyPasteText(WebDriver driver, WebElement sourceElement, WebElement targetElement) {
		Actions action = null;
		try {
			if(driver == null) {
				throw new Exception("NullDriverException");
			}	
			action = new MouseKeyBoardActions().getActionInstance(driver);
			action.moveToElement(sourceElement).click().keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL)
			.moveToElement(targetElement).keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void cutPasteText(WebDriver driver, WebElement sourceElement, WebElement targetElement) {
		Actions action = null;
		try {
			if(driver == null) {
				throw new Exception("NullDriverException");
			}	
			action = new MouseKeyBoardActions().getActionInstance(driver);
			action.moveToElement(sourceElement).click().keyDown(Keys.CONTROL).sendKeys("x").keyUp(Keys.CONTROL)
			.moveToElement(targetElement).keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void pressEnter(WebDriver driver, WebElement element) {
		Actions action = null;
		try {
			if(driver == null) {
				throw new Exception("NullDriverException");
			}	
			action = new MouseKeyBoardActions().getActionInstance(driver);
			action.moveToElement(element).click().keyDown(Keys.ENTER).keyUp(Keys.ENTER).build().perform();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
