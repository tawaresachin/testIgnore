package SeleniumUtilities;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotUtil {
	
	public static void captureScreenshot(WebDriver driver) throws IOException {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\Study\\Testing Class\\Java\\Batch6\\Batch6Selenium\\src\\SeleniumUtilities\\Screenshot\\failed.jpg");
		FileHandler.copy(src, dest);
//		FileUtils.copyFile(src, dest);
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\Study\\Testing Class\\Java\\Batch6\\Batch6Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);			
		driver.get("https://www.facebook.com");
		
		WebElement emailID = driver.findElement(By.cssSelector("input#email"));
		WebElement password = driver.findElement(By.cssSelector("input#pass"));
		WebElement submitButton = driver.findElement(By.xpath("//button[@name='login']"));
		
		emailID.sendKeys("abc@xyz.com");
		password.sendKeys("lmnopqr");
		submitButton.submit();
		Thread.sleep(5000);
		
		WebElement errorMessage = driver.findElement(By.xpath("//div[@class='_9ay7']"));
		if(errorMessage.isDisplayed()) {
			captureScreenshot(driver);
		}
	}
}

