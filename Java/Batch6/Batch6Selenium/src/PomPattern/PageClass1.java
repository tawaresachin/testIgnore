package PomPattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageClass1 {
	
	public boolean enterUserId(String user, WebDriver driver) {
		WebElement userId = driver.findElement(By.cssSelector("input#email"));
		boolean isFieldEnabled = userId.isEnabled();
		if(isFieldEnabled) {
			userId.sendKeys(user);
		}
		return isFieldEnabled;
	}
	
	public boolean enterPassword(String password, WebDriver driver) {
		WebElement passField = driver.findElement(By.cssSelector("input#pass"));
		boolean isFieldEnabled = passField.isEnabled();
		if(isFieldEnabled) {
			passField.sendKeys(password);
		}
		return isFieldEnabled;
	}
	
	public boolean clickOnSubmitButton(WebDriver driver) {
		WebElement submitButton = driver.findElement(By.xpath("//button[@name='login']"));
		WebElement homePageLogo = driver.findElement(By.xpath(""));
		boolean isButtonEnabled = submitButton.isEnabled();
		if(isButtonEnabled) {
			submitButton.submit();
		}
		return isButtonEnabled;
	}	
}

