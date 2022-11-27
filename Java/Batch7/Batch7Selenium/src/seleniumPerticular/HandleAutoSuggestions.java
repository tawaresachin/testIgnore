package seleniumPerticular;

import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HandleAutoSuggestions extends BaseClass {	
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = intialisation("chrome");		
		driver.get("https://www.google.com");
		
		//to locate search box
		WebElement searchBox = driver.findElement(By.name("q"));
		if(searchBox.isEnabled()) {
			searchBox.sendKeys("selenium");
		} else {
			System.out.println("Searchbox is not enabled");
		}
		Thread.sleep(2000);
		
		// to extract elements of auto-suggestion
		List<WebElement> elements = driver.findElements(By.xpath("//ul[@class='G43f7e']//li"));
		int noOfElements = elements.size();
		System.out.println("Number of elements in autosuggestion are: " + noOfElements );
		
		//to perform action on specific element
		Iterator<WebElement> itr = elements.iterator();
		while(itr.hasNext()) {
			WebElement ele = itr.next();			
			String eleName = ele.getText();    // to get text associated with element
			System.out.println(eleName);
			if(eleName.equals("selenium webdriver")) {
				ele.click();
				break;
			}
		}
		//*********To quit driver*************
		Thread.sleep(5000);
		driver.quit();

	}

}
