package com.FacebookLive.Util;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	
	public void captureScreenshot(WebDriver driver, String fileName) {
		try {
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("//FacebookLive//Screenshots//" + fileName +".jpg");
		FileHandler.copy(src, dest);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
