package PomWithPageFactory.TestClasses;

import org.openqa.selenium.WebDriver;

import PomWithPageFactory.PageClasses.HomePage;

public class HomePageTest {
	WebDriver driver;
	HomePage home;
	
	public void initialisation() {
		LoginPageTest loginTest = new LoginPageTest();
		driver = loginTest.onHomePage();
		home = new HomePage(driver);
	}
	
	//Write Test methods here...
	
	
	
	
	public void tearDown() {
		driver.quit();
	}
	
	public static void main(String[] args) {
		HomePageTest homeTest = new HomePageTest();
		homeTest.initialisation();
		//1. Verify HomePage is opened
		//2. VerifyAccountName is displayed
		//3. VerifyRandomPostName 
		//4. ....
		homeTest.tearDown();
	}

}
