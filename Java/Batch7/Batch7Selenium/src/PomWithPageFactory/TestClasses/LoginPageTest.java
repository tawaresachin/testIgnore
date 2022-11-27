package PomWithPageFactory.TestClasses;

import org.openqa.selenium.WebDriver;

import PomWithPageFactory.PageClasses.LoginPage;
import seleniumPerticular.BaseClass;
import seleniumPerticular.Constants;
import seleniumPerticular.Parameterization;

public class LoginPageTest extends BaseClass{
	LoginPage login; 
	WebDriver driver;
	public void getLoginPageObject() {
		String envPath = Constants.ENVIRONMENT_PROPERTIES;
		String browserName = Parameterization.readProperty(envPath, "browser");
		String url = Parameterization.readProperty(envPath, "url");
		driver = intialisation(browserName);
		driver.get(url);
	    login = new LoginPage(driver);
	}
	
	public void validateIfGivenUrlIsOpened() {
		boolean flag = login.ifLoginPageTitleMatches("Facebook – log in or sign u");
		if(flag) {
			System.out.println("Test1_validateIfGivenUrlIsOpened Passed");
		} else {
			System.out.println("Test1_validateIfGivenUrlIsOpened Failed");
		}
	}
	
	public void validateIfLogoIsDisplayedOnLoginPage() {
		boolean flag = login.ifLogoIsDisplayed();
		if(flag) {
			System.out.println("Test2_validateIfLogoIsDisplayedOnLoginPage Passed");
		} else {
			System.out.println("Test2_validateIfLogoIsDisplayedOnLoginPage Failed");
		}
	}
	
	public void validateUserNameField() {
		boolean flag = login.enterUserName("abcd");
		if(flag) {
			System.out.println("Test3_validateUserNameField Passed");
		}else {
			System.out.println("Test3_validateUserNameField Failed");
		}
	}
	
	public void validatePasswordField() {
		boolean flag = login.enterPassword("defg");
		if(flag) {
			System.out.println("Test4_validatePasswordField Passed");
		}else {
			System.out.println("Test4_validatePasswordField Failed");
		}
	}
	public void validateSubmitButton() {
		boolean flag = login.clickSubmitButton();
		if(flag) {
			System.out.println("Test5_validateSubmitButton Passed");
		}else {
			System.out.println("Test5_validateSubmitButton Failed");
		}
	}
	
	public WebDriver onHomePage() {
		return driver;
	}
	
	public static void main(String[] args) {
		LoginPageTest loginTest = new LoginPageTest();
		loginTest.getLoginPageObject();
		loginTest.validateIfGivenUrlIsOpened();
		loginTest.validateIfLogoIsDisplayedOnLoginPage();
		loginTest.validateUserNameField();
		loginTest.validatePasswordField();
		loginTest.validateSubmitButton();
		loginTest.onHomePage();
	}
}
