package seleniumPerticular;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HandlingElementsUsingJavaScript extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = intialisation("chrome");
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("selenium");
		searchBox.sendKeys(Keys.ENTER);
		
		//Scroll current page --> window --> x,y -->+ = right, down, - = left, up
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600)");
		
		//to Scroll at bottom of the page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		//find element using document class
		WebElement toolsBox = (WebElement)js.executeScript("return document.getElementById('hdtb-tls');");
		toolsBox.click();
		
		//Scroll into element view 
		WebElement lastSearchResult = driver.findElement(By.xpath("//h3[contains(text(),'Selenium with Python')]"));
		js.executeScript("arguments[0].scrollIntoView(true);", lastSearchResult);
		

		
		
		
		//*****quit browser
		Thread.sleep(5000);
		driver.quit();
	}

}
