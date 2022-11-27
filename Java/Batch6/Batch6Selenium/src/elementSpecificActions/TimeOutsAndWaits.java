package elementSpecificActions;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TimeOutsAndWaits {	
	public static void waitForElementLocated(WebDriver driver, String xpath) {
		FluentWait wait = new FluentWait(driver);
		wait.withTimeout(Duration.ofMillis(5000));
		wait.pollingEvery(Duration.ofMillis(10));
		wait.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
	}	
	public static void waitForVisibility(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofMillis(2000),Duration.ofMillis(10));
		wait.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Study\\Testing Class\\Java\\Batch6\\Batch6Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().setScriptTimeout(5, TimeUnit.SECONDS);	
//		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);		
		//**************Using Implicitly wait***************************
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");		
		driver.findElement(By.linkText("Create New Account")).click();		
		//**************Using Fluent Wait********************************
		String firstNameXpath = "//input[@name='firstname']";
		waitForElementLocated(driver,firstNameXpath);
		driver.findElement(By.xpath(firstNameXpath)).sendKeys("XYZ");			
		//**************Using WebDriver Wait******************************
		WebElement lastName = driver.findElement(By.xpath("//input[@name='lastname']"));
		waitForVisibility(driver, lastName);
		lastName.sendKeys("LMN");		
		Thread.sleep(5000);
		driver.quit();
	}
}

