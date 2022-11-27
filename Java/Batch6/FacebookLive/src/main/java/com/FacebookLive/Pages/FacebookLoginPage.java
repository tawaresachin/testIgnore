package com.FacebookLive.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.FacebookLive.Objects.PageObjects;

public class FacebookLoginPage {
	@FindBy(css = PageObjects.userIdCssPath) private WebElement userId;
	@FindBy(css = PageObjects.passwordCssPath) private WebElement passField;
	@FindBy(xpath = PageObjects.submitButtonXpath) private WebElement submitButton;
	
	public FacebookLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public boolean isUserIdFieldAccessible() {
		return userId.isEnabled();
	}
	
	public void enterUserId(String user, boolean status) {
		
		if(status) {
			userId.sendKeys(user);
		}
	}
	
	public boolean isPasswordFieldAccessible() {
		return passField.isEnabled();
	}
	
	public void enterPassword(String password, boolean status) {
		if(status) {
			passField.sendKeys(password);
		}
	}
	public boolean isSubmitButtonAccessible() {
		return submitButton.isEnabled();
	}
	
	public void clickOnSubmitButton(boolean status) {
		if(status) {
			submitButton.submit();
		}
	}	

}
