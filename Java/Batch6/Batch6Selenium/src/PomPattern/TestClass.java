package PomPattern;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Study\\Testing Class\\Java\\Batch6\\Batch6Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);			
		driver.get("https://www.facebook.com");
		
		PageClass1 page = new PageClass1();
		//-------------------------------------
		boolean userIdFieldState = page.enterUserId("abc@XYZ.com", driver);
		if(!userIdFieldState) {
			System.out.println("Enter user ID is failed ");
		} else {
			System.out.println("Enter user ID is passed");
		}
		//-------------------------------------
		boolean passwordFieldState = page.enterPassword("lmnopqr", driver);
		if(!passwordFieldState) {
			System.out.println("Enter password is failed ");
		} else {
			System.out.println("Enter password is passed");
		}
		//-------------------------------------
		boolean submitButtonState = page.clickOnSubmitButton(driver);
		if(!submitButtonState) {
			System.out.println("Click Submit button is failed ");
		} else {
			System.out.println("Click Submit button is passed ");
		}
		
		driver.quit();
	}
}
