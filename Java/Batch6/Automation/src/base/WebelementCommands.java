package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebelementCommands {

	public static void main(String[] args) {
		String driverType = "webdriver.chrome.driver";
		String driverPath = "D:\\Study\\Testing Class\\jars\\chromedriver_win32\\chromedriver.exe";
		System.setProperty(driverType, driverPath);
		WebDriver driver = new ChromeDriver();
		//-------------------------------------------
		driver.get("https://www.flipkart.com");
		//-------------------------------------------
//		WebElement userId = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		WebElement userId = driver.findElement(By.className("_2IX_2-"));
//		WebElement password = driver.findElement(By.className("_2IX_2- _3mctLh VJZDxU"));
		userId.sendKeys("sachin.2551988@gmail.com");
	}
}
