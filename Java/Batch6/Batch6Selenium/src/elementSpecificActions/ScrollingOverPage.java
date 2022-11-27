package elementSpecificActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingOverPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Study\\Testing Class\\Java\\Batch6\\Batch6Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.get("https://www.google.com");
		WebElement googleSearch = driver.findElement(By.name("q"));
		googleSearch.sendKeys("Selenium");
		WebElement submitButton = driver.findElement(By.xpath("(//input[@value='Google Search'])[2]"));
		submitButton.submit();
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//**************Scroll by X & Y coordinates	*******************	
		js.executeScript("window.scrollBy(0,500)");    //+ = right/Down, - = left/Up
		//**************Scroll upto webElement	*******************	
		WebElement training = driver.findElement(By.xpath("//div[contains(text(),'Software Training Institutes')]"));
		js.executeScript("arguments[0].scrollIntoView(true);",training);	
	}
}

