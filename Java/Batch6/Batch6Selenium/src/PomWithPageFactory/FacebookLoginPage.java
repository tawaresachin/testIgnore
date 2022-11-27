package PomWithPageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLoginPage {
	@FindBy(css = "input#email") private WebElement userId;
	@FindBy(css = "input#pass") private WebElement passField;
	@FindBy(xpath = "//button[@name='login']") private WebElement submitButton;
	
	public FacebookLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}	
	
	public boolean enterUserId(String user, WebDriver driver) {
		boolean isFieldEnabled = userId.isEnabled();
		if(isFieldEnabled) {
			userId.sendKeys(user);
		}
		return isFieldEnabled;
	}
	
	public boolean enterPassword(String password, WebDriver driver) {
		boolean isFieldEnabled = passField.isEnabled();
		if(isFieldEnabled) {
			passField.sendKeys(password);
		}
		return isFieldEnabled;
	}
	
	public boolean clickOnSubmitButton(WebDriver driver) {
		boolean isButtonEnabled = submitButton.isEnabled();
		if(isButtonEnabled) {
			submitButton.submit();
		}
		return isButtonEnabled;
	}	

}

