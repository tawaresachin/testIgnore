package com.FacebookLive.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.FacebookLive.Objects.PageObjects;
import com.FacebookLive.Util.Locators;

public class FacebookHomePage {

	@FindBy(xpath = PageObjects.userNameXpath) private WebElement userName;
	
	public FacebookHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public boolean isUserNamePresentOnHomePage() {
		return userName.getText().equals("Sachin Taware");
	}

}
