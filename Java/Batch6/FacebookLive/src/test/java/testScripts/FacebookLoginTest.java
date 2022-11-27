package testScripts;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.FacebookLive.Pages.FacebookHomePage;
import com.FacebookLive.Pages.FacebookLoginPage;
import com.FacebookLive.Util.FileOperations;
import Base.TestBase;

public class FacebookLoginTest extends TestBase {
	FacebookLoginPage facebookLoginPage;	
	FacebookHomePage facebookHomePage;
	private static String userId;
	private static String password;
	
	@BeforeClass
	public void initTest() {		
		driver.get(new FileOperations().readProperty(environmentPath,"url"));	
		driver.manage().window().maximize();
		facebookLoginPage = new FacebookLoginPage(driver);
		userId = new FileOperations().readProperty(environmentPath,"user");
		password = new FileOperations().readProperty(environmentPath,"password");
	}	
	
	@BeforeMethod
	public void waitForTest() throws InterruptedException {
		Thread.sleep(2000);
	}
	
	@Test
	public void enterUserIdTest() {
		boolean userIdFieldState = facebookLoginPage.isUserIdFieldAccessible();
		Assert.assertTrue(userIdFieldState, "UserId field is not accessible");
		facebookLoginPage.enterUserId(userId, userIdFieldState);		
	}	
	
	@Test
	public void enterPasswordTest() {
		boolean passwordFieldState = facebookLoginPage.isPasswordFieldAccessible();
		Assert.assertTrue(passwordFieldState, "Password field is not accessible");
		facebookLoginPage.enterPassword(password, passwordFieldState);
	}	
	
	@Test(dependsOnMethods = {"enterUserIdTest", "enterPasswordTest"})
	public void clickOnSubmitButtonTest() {
		boolean submitButtonState = facebookLoginPage.isSubmitButtonAccessible();
		Assert.assertTrue(submitButtonState,"Submit button is not accessible" );
		facebookLoginPage.clickOnSubmitButton(submitButtonState);
	}	
}
