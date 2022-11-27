package astasoft.flipkart.Utilities;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import astasoft.flipkart.Constants.ConfigPaths;

public class Screenshot {

	public static void takeScreenshotOnFailure(WebDriver driver, String screenName) {
		try {
		 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);  //upcasting
		 File dest = new File(ConfigPaths.SREENSHOT_FOLDER + "/" + screenName +".jpeg");
		 FileHandler.copy(src, dest);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
