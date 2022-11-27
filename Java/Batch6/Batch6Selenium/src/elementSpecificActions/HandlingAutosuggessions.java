package elementSpecificActions;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAutosuggessions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Study\\Testing Class\\Java\\Batch6\\Batch6Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		WebElement googleSearch = driver.findElement(By.name("q"));
		googleSearch.sendKeys("Selenium");		
		Thread.sleep(1000);
		
		List<WebElement> autosuggesion = driver.findElements(By.xpath("//ul[@class='G43f7e']//li"));
		System.out.println(autosuggesion.size());
		Iterator<WebElement> itr = autosuggesion.iterator();
		
		while(itr.hasNext()) {
			WebElement ele = itr.next();
			System.out.println(ele.getText());
			if(ele.getText().equals("selenium webdriver")) {
				ele.click();
				break;
			}
		}
		driver.quit();
	}
}

