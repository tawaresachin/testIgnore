package seleniumPerticular;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HandlingMultipleWindows extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = intialisation("chrome");
		
		driver.get("https://www.facebook.com");
		
		// to check click action on button
		WebElement createNewAccountButton = driver.findElement(By.xpath("//a[contains(@data-testid,'registration')]"));
		if(createNewAccountButton.isEnabled()) {
			createNewAccountButton.click();
		}else {
			System.out.println("createNewAccount button is not enabled");
		}
		Thread.sleep(3000);
		
		//to click link on page
		driver.findElement(By.linkText("Learn more")).click();
		
		// to change the control of driver from parent page --> child page
		Set<String> allRefSet = driver.getWindowHandles();    //  [ox1, 0y2, 0y4]
		ArrayList<String> allRefList = new ArrayList<String>(allRefSet);
		System.out.println("Number of open windows/tabs: "+ allRefList.size());
		String parentWindow = allRefList.get(0);
		String fisrtChildWindow = allRefList.get(1);
		driver.switchTo().window(fisrtChildWindow);
		
		// to check element in new DOM
		WebElement desiredMenu = driver.findElement(By.xpath("//span[text()='Using Facebook']"));
		if(desiredMenu.isDisplayed()) {
			System.out.println("desired Menu is displayed");
		}else {
			System.out.println("Something is wrong");
		}
		
		//to change control of driver from child page --> parent
		driver.switchTo().window(parentWindow);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("abc");
	}

}
