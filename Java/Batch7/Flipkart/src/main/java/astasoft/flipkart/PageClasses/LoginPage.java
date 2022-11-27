package astasoft.flipkart.PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import astasoft.flipkart.Objects.LoginPageObjects;
import astasoft.flipkart.Utilities.CustomWaits;

public class LoginPage {
	WebDriver driver;

	@FindBy(xpath=LoginPageObjects.USER_ID) private WebElement userIdField;
	@FindBy(xpath=LoginPageObjects.PASSWWORD) private WebElement passwordField;
	@FindBy(xpath=LoginPageObjects.LOGIN_BUTTON) private WebElement loginButton;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public boolean ifUserIdFieldIsEnabled(){
		return CustomWaits.fluentIsEnabled(driver, userIdField);
	}
	public boolean ifPasswordFieldIsEnabled(){
		return CustomWaits.fluentIsEnabled(driver, passwordField);
	}
	public boolean ifloginButtonIsEnabled(){
		return CustomWaits.fluentIsEnabled(driver, loginButton);
	}

	public void enterUserId(String userID) {
		CustomWaits.fluentSendKey(driver, userIdField, userID);
	}
	public void enterPassowrd(String password) {
		CustomWaits.fluentSendKey(driver, passwordField, password);
	}
	public void clickLoginButton() {
		CustomWaits.fluentSubmit(driver, loginButton);
	}
}
