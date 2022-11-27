package com.FacebookLive.Util;

import java.net.URL;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

public class BrowserActions {
	
	public void openUrl(WebDriver driver, String url) {
		try {
			driver.get(url);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public String getPageTitle(WebDriver driver) {
		String title = null;
		try {			
			if(driver.getTitle().equals(null)) {
				throw new Exception("TitleNotFoundException");
			}
			title = driver.getTitle();			
		} catch(Exception e) {
			e.printStackTrace();
		}
		return title;
	}
	
	public String getPageSource(WebDriver driver) {
		String pageSource = null;
		try {			
			if(driver.getPageSource().equals(null)) {
				throw new Exception("PageNotFoundException");
			}
			pageSource = driver.getPageSource();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		return pageSource;
	}

	public void refreshPage(WebDriver driver) {
		
		try {
			driver.navigate().refresh();
		} catch(Exception e) {
			e.printStackTrace();
		}		
	}
	
	public void navigateToUrl(WebDriver driver, Object url) {
		try {
			if(url.getClass().equals(String.class)) {
				driver.navigate().to((String)url);
			}
			if(url.getClass().equals(URL.class)) {
				driver.navigate().to((URL)url);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}	
	}
	
	public void navigateToPreviousPage(WebDriver driver) {
		try {
			driver.navigate().back();
		} catch(Exception e) {
			e.printStackTrace();
		}		
	}
	
	public void navigateToNextPage(WebDriver driver) {
		try {
			driver.navigate().forward();
		} catch(Exception e) {
			e.printStackTrace();
		}		
	}
	
	public void closeCurrentWindow(WebDriver driver) {
		try {			
			if(driver.getWindowHandle().equals(null)) {
				throw new Exception("OpenWindowNotFoundInBrowserException");
			}
			driver.close();
		} catch(Exception e) {
			e.printStackTrace();
		}	
	}
	
	public void closeAllOpenWindows(WebDriver driver) {
		try {			
			if(driver.getWindowHandle().equals(null) || driver.getWindowHandles().isEmpty()) {
				throw new Exception("OpenWindowsNotFoundInBrowserException");
			}
			driver.quit();;
		} catch(Exception e) {
			e.printStackTrace();
		}	
	}
	
	public void maximizeWindow(WebDriver driver) {
		try {
			if(driver == null) {
				throw new Exception("NullDriverException");
			}
			driver.manage().window().maximize();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void minimizeWindow(WebDriver driver) {
		try {
			if(driver == null) {
				throw new Exception("NullDriverException");
			}
			driver.manage().window().minimize();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void setWindowSize(WebDriver driver, int widthX, int heightY ) {
		try {
			if(driver == null) {
				throw new Exception("NullDriverException");
			}
			Dimension dimension = new Dimension(widthX, heightY);
			driver.manage().window().setSize(dimension);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
