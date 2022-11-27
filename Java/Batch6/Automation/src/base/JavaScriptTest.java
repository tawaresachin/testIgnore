package base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Study\\Testing Class\\jars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.get("https://demoqa.com");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//*********************Use of document class***************************
		//-----------------get Title of page----------------------
		String title = js.executeScript("return document.title;").toString();
		System.out.println("Title: " + title);
		//-----------------get domain name of site----------------------
		String domain = js.executeScript("return document.domain;").toString();
		System.out.println("Domain: " + domain);
		//-----------------get URL of page----------------------
		String url = js.executeScript("return document.URL;").toString();
		System.out.println("URL: " + url);
		//---------------Refresh the browser------------
		js.executeScript("history.go(0)");
		//---------------get all text on page associated with elements------------
		String innerText = js.executeScript("return document.documentElement.innerText;").toString();
		System.out.println("Inner Texts: " + title);
		
		//*********************Use arguments[0] to perform operation***************************
		//---------------get WebElement from page------------
//		WebElement ele = (WebElement)js.executeScript("return document.getElementById('xxx');)");
//		WebElement ele1 = (WebElement)js.executeScript("return document.getElementByName('xxx');)");
//		WebElement ele2 = (WebElement)js.executeScript("return document.getElementByClassName('xxx');)");
//		WebElement ele3 = (WebElement)js.executeScript("return document.getElementByTagName('xxx');)");
		WebElement ele = driver.findElement(By.xpath("//*[text()='Elements']"));
		System.out.println(ele);
		//---------------To scroll into view ------------
		js.executeScript("arguments[0].scrollIntoView(true);", ele);
		Thread.sleep(3000);
		//---------------To Highlight selected element ------------
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red');", ele);
		Thread.sleep(3000);
		//---------------To click on WebElement------------
		js.executeScript("arguments[0].click();", ele);
		//---------------To generate alert PopUp------------
//		js.executeScript("alert('Testing JavaScript');");		
		
		//*********************Use of windows class***************************
		
		//---------------To get dimensions of the window------------
		String height = js.executeScript("return window.innerHeight;").toString();
		String width = js.executeScript("return window.innerWidth;").toString();
		System.out.println("Height: " + height + " " + "Width: " + width);
		//---------------To Scroll by certain pixels------------
		js.executeScript("window.scrollBy(0,500);");
		//---------------To navigate to the new URL------------
		js.executeScript("window.location='https://www.google.com';");
		//---------------To navigate to the new URL------------
		js.executeScript("facebook=window.open('https://www.facebook.com');");
			
	}

}
