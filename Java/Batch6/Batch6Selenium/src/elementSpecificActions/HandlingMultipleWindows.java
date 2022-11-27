package elementSpecificActions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleWindows {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Study\\Testing Class\\Java\\Batch6\\Batch6Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		driver.findElement(By.linkText("Create New Account")).click();		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@id='terms-link']")).click();
		String parentId = driver.getWindowHandle();           //to get id of parent window
		Set<String> allWindows = driver.getWindowHandles();   //to get id of all open windows
		
		//*******************Method1 to switch to child window**************
//		ArrayList<String> idList = new ArrayList<String>(allWindows);		
//		System.out.println(idList.size());
//		driver.switchTo().window(idList.get(1));
		
		//*******************Method2 to switch to child window**************
		Iterator<String> itr = allWindows.iterator();
		while(itr.hasNext()) {
			String id = itr.next();
			if(id != parentId) {
				driver.switchTo().window(id);      // switch to child window
			}
		}		
		WebElement signUp = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 signup_btn _4jy4 _4jy2 selected _51sy']"));
		signUp.click();
		
		driver.switchTo().window(parentId);       //switch back to parent window
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Pritam");
	}
}
