package webelementActions;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Locators {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Study\\Testing Class\\Java\\Batch6\\Batch6Selenium\\Drivers\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/Study/Testing%20Class/Selenium/SampleWebpage.html");		
	//**************To locate single Element*********************************
		WebElement ele = driver.findElement(By.tagName("input"));
//		WebElement ele1 = driver.findElement(By.tagName("random"));   //creates NoSuchElementException if element not found
		ele.sendKeys("Pritam");		
		//**************To locate List of Elements*********************************
		List<WebElement> elems = driver.findElements(By.tagName("input"));
//		List<WebElement> elems1 = driver.findElements(By.tagName("random")); //creates no Exception if element not found
		int size = elems.size();
		System.out.println("Number of Elements having tagName input: " + size);
		Thread.sleep(5000);
		elems.get(0).clear();		
		//**************Locator- tagName()*********************************
		List<WebElement> ele2 = driver.findElements(By.tagName("input"));
		ele2.get(0).sendKeys("Sonali");
		ele2.get(1).sendKeys("12345");		
		//**************Locator- id()*********************************
		driver.findElement(By.id("002")).clear();
		//**************Locator- className()*********************************
		WebElement ele4 = driver.findElement(By.className("class1"));
		ele4.clear();
		ele4.sendKeys("Supriya");		
		//**************Locator- name()*********************************
		driver.findElement(By.name("Female")).click();
		//**************Locator- linkText()*********************************
		driver.findElement(By.linkText("Google_Link")).click();
		driver.navigate().back();		
		//**************Locator- partialLinkText()*********************************
		driver.findElement(By.partialLinkText("Google")).click();
		driver.navigate().back();	
		//**************Locator- Xpath()-absolute*********************************
		driver.findElement(By.xpath("/html/body/div[2]/input[4]")).click();
		//**************Locator- Xpath()-relative*********************************
		driver.findElement(By.xpath("//div[2]//input[5]")).click();
		//**************Locator- Xpath()-by attribute*********************************
		driver.findElement(By.xpath("//input[@name='Female']")).click();
		driver.findElement(By.xpath("//input[@id='001']")).sendKeys("Rupali");
		driver.findElement(By.xpath("//input[@class='class2']")).sendKeys("Sirname");
		//**************Locator- Xpath()-by index*********************************
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		//**************Locator- Xpath()-by text*********************************
		driver.findElement(By.xpath("//option[text()='India']")).click();
		//**************Locator- Xpath()-by contains text*********************************
		driver.findElement(By.xpath("//option[contains(text(),'United')]")).click();
		//**************Locator- CSS selectors*********************************
		driver.findElement(By.cssSelector("input[id='001']")).sendKeys("Pritam");
		driver.findElement(By.cssSelector("input[class='class2']")).sendKeys("batch6");
		//**************Locator- CSS selectors (shortcut for id attribute)*****************
		driver.findElement(By.cssSelector("input#bt_01")).sendKeys("Rupali");
		//**************Locator- CSS selectors (shortcut for class attribute)**************
		driver.findElement(By.cssSelector("input.class2")).clear();
		Thread.sleep(5000);		
		driver.quit();
	}
}
