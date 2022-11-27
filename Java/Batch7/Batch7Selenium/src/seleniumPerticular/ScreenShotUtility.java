package seleniumPerticular;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.TakesScreenshot;

public class ScreenShotUtility extends BaseClass {
	
	public static void takeScreenshotOnFailure(WebDriver driver, String screenName) {
		try {
		 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);  //upcasting
		 File dest = new File(Constants.SCREENSHOT_FOLDER + "/" + screenName +".jpeg");
		 FileHandler.copy(src, dest);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void validateLogoIsDisplayed(WebDriver driver) {
		String TC = "TC001_LogoDisplay";
		String xpath_Logo = "//img[@class='fb_logo _8ilh img']";
		boolean flag = SeleniumWaits.elementIsDisplayed(driver, xpath_Logo);
		if(flag) {
			System.out.println("Logo is displayed");
			takeScreenshotOnFailure(driver, TC);
		} else {
			System.out.println("Logo is not displayed");
		}
	}
	
	public static void main(String[] args) {
		String envPath = Constants.ENVIRONMENT_PROPERTIES;
		String browserName = Parameterization.readProperty(envPath, "browser");
		String webUrl = Parameterization.readProperty(envPath, "url"); 
		WebDriver driver = intialisation(browserName);
		driver.get(webUrl);
		validateLogoIsDisplayed(driver);
		
		
		//********quit Browser***********
		driver.quit();
		
	}

}
