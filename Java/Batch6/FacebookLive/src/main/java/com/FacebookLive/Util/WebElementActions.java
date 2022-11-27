package com.FacebookLive.Util;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebElementActions {
	
	public void clickOnElement(WebElement ele) {
		try {
			if(ele == null ) {
				throw new Exception("ElementNotClickableException");
			}
			ele.click();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void clearTextBox(WebElement ele) {
		try {
			if(ele == null ) {
				throw new Exception("ElementNotPresentException");
			}
			if(!ele.isEnabled()) {
				throw new Exception("ElementNotAccessibleException");
			}
			ele.clear();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void clickOnSubmitButton(WebElement ele) {
		try {
			if(ele == null ) {
				throw new Exception("ElementNotPresentException");
			}
			if(!ele.isEnabled()) {
				throw new Exception("ElementNotAccessibleException");
			}
			ele.submit();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void enterTextToField(WebElement ele, String desiredString) {
		try {
			if(ele == null ) {
				throw new Exception("ElementNotPresentException");
			}
			if(!ele.isEnabled()) {
				throw new Exception("ElementNotAccessibleException");
			}
			ele.sendKeys(desiredString);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void selectSingleOption(WebElement ele, Object desiredOption, String type) {
		try {
			if(ele == null ) {
				throw new Exception("ElementNotPresentException");
			}
			if(!ele.isEnabled()) {
				throw new Exception("ElementNotAccessibleException");
			}
			Select sel = new Select(ele);
			if(desiredOption.getClass().equals(Integer.class) && type.equals("index")) {
				sel.selectByIndex((int)desiredOption);
			}
			if(desiredOption.getClass().equals(String.class) && type.equals("value")) {
				sel.selectByValue((String)desiredOption);
			}
			if(desiredOption.getClass().equals(String.class) && type.equals("text")) {
				sel.selectByVisibleText(type);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void deSelectSingleOption(WebElement ele, Object desiredOption, String type) {
		try {
			if(ele == null ) {
				throw new Exception("ElementNotPresentException");
			}
			if(!ele.isEnabled()) {
				throw new Exception("ElementNotAccessibleException");
			}
			Select sel = new Select(ele);
			if(desiredOption.getClass().equals(Integer.class) && type.equals("index")) {
				sel.deselectByIndex((int)desiredOption);
			}
			if(desiredOption.getClass().equals(String.class) && type.equals("value")) {
				sel.deselectByValue((String)desiredOption);
			}
			if(desiredOption.getClass().equals(String.class) && type.equals("text")) {
				sel.deselectByVisibleText(type);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<WebElement> getAllAvailableOptions(WebElement ele) {
		List<WebElement> options = null;
		try {
			if(ele == null ) {
				throw new Exception("ElementNotPresentException");
			}
			if(!ele.isEnabled()) {
				throw new Exception("ElementNotAccessibleException");
			}
			Select sel = new Select(ele);
			options = sel.getOptions();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return options;
	}
	
	public void selectMultipleOptions(WebElement ele, List<String> desiredOptions) {
		String availableOption = null;
		String desiredOption = null;
		try {
			if(ele == null ) {
				throw new Exception("ElementNotPresentException");
			}
			if(!ele.isEnabled()) {
				throw new Exception("ElementNotAccessibleException");
			}
			Select sel = new Select(ele);
			List<WebElement> options = sel.getOptions();
			Iterator<WebElement> availableOptionItr = options.iterator();
			Iterator<String> desiredOptionItr = desiredOptions.iterator();
			while(availableOptionItr.hasNext()) {
				availableOption = availableOptionItr.next().getText();
				while(desiredOptionItr.hasNext()) {
					desiredOption = desiredOptionItr.next();
					if(desiredOption.equals(availableOption)) {
						sel.selectByVisibleText(desiredOption);
					}
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void deSelectMultipleOptions(WebElement ele, List<String> desiredOptions) {
		String availableOption = null;
		String desiredOption = null;
		try {
			if(ele == null ) {
				throw new Exception("ElementNotPresentException");
			}
			if(!ele.isEnabled()) {
				throw new Exception("ElementNotAccessibleException");
			}
			Select sel = new Select(ele);
			List<WebElement> options = sel.getOptions();
			Iterator<WebElement> availableOptionItr = options.iterator();
			Iterator<String> desiredOptionItr = desiredOptions.iterator();
			while(availableOptionItr.hasNext()) {
				availableOption = availableOptionItr.next().getText();
				while(desiredOptionItr.hasNext()) {
					desiredOption = desiredOptionItr.next();
					if(availableOption.equals(desiredOption)) {
						sel.selectByVisibleText(availableOption);
						break;
					}
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void selectFromAutosuggesstion(List<WebElement>ele, String desiredOption) {
		try {
			if(ele == null ) {
				throw new Exception("ElementNotPresentException");
			}
			Iterator<WebElement> availableOptionItr = ele.iterator();
			while(availableOptionItr.hasNext()) {
				WebElement availableOption = availableOptionItr.next();
				if(availableOption.getText().equals(desiredOption)) {
					availableOption.click();
					break;
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
		}		
	}
}
