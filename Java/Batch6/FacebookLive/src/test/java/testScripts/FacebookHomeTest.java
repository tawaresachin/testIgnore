package testScripts;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.FacebookLive.Pages.FacebookHomePage;
import Base.TestBase;

public class FacebookHomeTest extends TestBase {
	FacebookHomePage facebookHomePage;
	@BeforeClass
	public void initTest() {	
		facebookHomePage = new FacebookHomePage(driver);
	}
	
	@BeforeMethod
	public void waitForTest() throws InterruptedException {
		Thread.sleep(2000);
	} 
	
	@Test
	public void validateNavigationToHomePage() {
		
		boolean userNamePresence = facebookHomePage.isUserNamePresentOnHomePage();
		Assert.assertTrue(userNamePresence, "Navigation to home page is failed");
	}
}
