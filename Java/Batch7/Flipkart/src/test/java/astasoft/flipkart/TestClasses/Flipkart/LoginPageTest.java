package astasoft.flipkart.TestClasses.Flipkart;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import astasoft.flipkart.Base.BaseClass;
import astasoft.flipkart.Constants.ConfigPaths;
import astasoft.flipkart.PageClasses.HomePage;
import astasoft.flipkart.PageClasses.LoginPage;
import astasoft.flipkart.Utilities.ReadParam;
import astasoft.flipkart.Utilities.Screenshot;

public class LoginPageTest extends BaseClass{
	LoginPage login;
	String TC = null;
	
	@BeforeClass
	public void loginPageInstance() {
		login = new LoginPage(driver);
	}

	@Test
	public void verifyUserIdField() {
		TC = "001";
		Assert.assertTrue(login.ifUserIdFieldIsEnabled(),"User Id field is not enabled");
		String userID = ReadParam.readExcel(ConfigPaths.CREDENTIALS_PATH, 0, 1).toString();
		login.enterUserId(userID);
		Reporter.log("PASS - UserID is Entered", true);
	}
	@Test
	public void verifyPasswordField() {
		TC = "002";
		Assert.assertTrue(login.ifPasswordFieldIsEnabled(),"Password field is not enabled");
		String password = ReadParam.readExcel(ConfigPaths.CREDENTIALS_PATH, 1, 1).toString();
		login.enterPassowrd(password);
		Assert.fail();
		Reporter.log("PASS - Password is Entered", true);
	}
	
	@Test (dependsOnMethods= {"verifyUserIdField","verifyPasswordField"})
	public void verifyLoginButtonIsWorking() {
		TC = "003";
		Assert.assertTrue(login.ifloginButtonIsEnabled(), "Login buttom is not enabled");
		login.clickLoginButton();
	}
	
	@AfterMethod
	public void captureTestResult(ITestResult result) {
		if(result.getStatus()==ITestResult.FAILURE) {
			Reporter.log("FAILED - " + TC, true);
			Screenshot.takeScreenshotOnFailure(driver, TC);
		}
	}
	
	@AfterClass
	public void navigateToHomePage() {
		HomePage homePage = new HomePage(driver);
	}

}
