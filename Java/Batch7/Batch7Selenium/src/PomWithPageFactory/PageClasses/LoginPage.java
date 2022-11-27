package PomWithPageFactory.PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	//WebElement ele = driver.findElement(By.xapth("...."))
	//private --> encapsulation
	@FindBy(xpath="//img[@alt='Facebook']") private WebElement logoOnLoginPage;
	@FindBy(xpath="//input[@id='email']") private WebElement userName;
	@FindBy(xpath="//input[@id='pass']") private WebElement password;
	@FindBy(xpath="//button[@name='login']") private WebElement submitButton;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	//---------------------------------------------
	public boolean ifLoginPageTitleMatches(String expectedTitle) {
		String title = driver.getTitle();
		boolean flag = title.equals(expectedTitle);
		if(!flag) {
			System.out.println("LoginPage Title is not matching with expected value");
		}
		return flag;
	}
	public boolean ifLogoIsDisplayed() {
	  boolean flag = logoOnLoginPage.isDisplayed();
	  if(!flag) {
			System.out.println("Logo on loginPage is not displayed");
		}
	  return flag;
	}
	public boolean ifUserNameFieldIsEnabled() {
		boolean flag = userName.isEnabled();
		return flag;
	}
	public boolean enterUserName(String user) {
		boolean flag = false;
		if(ifUserNameFieldIsEnabled()) {
			userName.sendKeys(user);
			flag = true;
		} else {
			System.out.println("userName field is not enabled");
		}
		return flag;
	}
	public boolean ifPasswordFieldIsEnabled() {
		boolean flag = password.isEnabled();
		return flag;
	}
	public boolean enterPassword(String pass) {
		boolean flag = false;
		if(ifPasswordFieldIsEnabled()) {
			password.sendKeys(pass);
			flag = true;
		} else {
			System.out.println("password field is not enabled");
		}
		return flag;
	}
	
	public boolean ifSubmitButtonIsEnabled() {
		boolean flag = submitButton.isEnabled();
		return flag;
	}
	public boolean clickSubmitButton() {
		boolean flag = false;
		if(ifSubmitButtonIsEnabled()) {
			submitButton.click();
			flag = true;
		} else {
			System.out.println("submit button is not enabled");
		}
		return flag;
	}
}
