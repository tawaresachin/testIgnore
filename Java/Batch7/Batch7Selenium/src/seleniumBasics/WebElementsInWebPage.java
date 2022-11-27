package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebElementsInWebPage{
	
	/* To initialise/instantiate desired browser driver instance*/
	public static WebDriver intialisation(String browser) {
		WebDriver drv = null;
		if(browser.equals("chrome")) {
			//language binding & to locate and initialize browser specific driver
			System.setProperty("webdriver.chrome.driver", "D:\\Study\\Drivers\\Batch7\\chromedriver_win32\\chromedriver.exe");
			//create browser specific driver object
			drv = new ChromeDriver();      // to trigger browser pointed by driver
		}
		if (browser.equals("edge")) {
			System.setProperty("webdriver.edge.driver", "D:\\Study\\Drivers\\Batch7\\edgedriver_win64\\msedgedriver.exe");
			drv = new EdgeDriver();
		}
		if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\Study\\Drivers\\Batch7\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			drv = new EdgeDriver();
		}
		return drv;
	}	

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = WebElementsInWebPage.intialisation("chrome");
		// to open specific URL (address of website)
		driver.get("D:\\Study\\Testing Class\\SeleniumNotes\\WebPage1.html");
		
		//*************************Premitive Locators**************************
		// using locator --> tagname  xxx
		WebElement userName= driver.findElement(By.tagName("input"));
		userName.sendKeys("User1");
		// using locator --> id  yyy
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("xyz");
		//using locator --> className  yyy
		WebElement yesCheckBox = driver.findElement(By.className("_yes"));
		yesCheckBox.click();
		//using locator --> name  yyy
		WebElement maleRadio = driver.findElement(By.name("male"));
		maleRadio.click();
		//using locator --> linkText  yyy
//		WebElement hereLinkText = driver.findElement(By.linkText("here"));
//		hereLinkText.click();
		//using locator --> partialLinkText  yyy
		WebElement hereLinkText = driver.findElement(By.partialLinkText("he"));
		hereLinkText.click();
		driver.navigate().back();
		
		//**********************XML Path (XPATH)*******************************
		//using standard xpath --> //tagName[@attributeName='attributeValue']
		userName = driver.findElement(By.xpath("//input[@id='pass']"));
		userName.clear();
		userName.sendKeys("User2");
		//using xpath --> by index  --> (//tagName[@attribute='attributeValue'])[index]
		password = driver.findElement(By.xpath("(//input[@id='pass'])[2]"));
		password.clear();
		password.sendKeys("lmn");
		//using xpath --> by text method --> //tagName[text()='textValue']
		WebElement cancelButton = driver.findElement(By.xpath("//button[text()='Cancel']"));
		cancelButton.click();
		//using xpath --> by contains method --> //tagName[contains(key,'value')]
		WebElement noCheckbox = driver.findElement(By.xpath("//input[contains(@id,'reject')]"));
		noCheckbox.click();
		//using xapth --> with boolean operation  --> //tagName[@attributeName1='attributeValue1' and @attributeName2='attributeValue2'] 
		password = driver.findElement(By.xpath("//input[@id='pass' and @attr='secret']"));
		password.clear();
		password.sendKeys("pqr");
		
		//***********************CSS Selectors*******************************
		//using CSS selector --> tag[attributeName=attribute value]
		yesCheckBox = driver.findElement(By.cssSelector("input[class=_yes]"));
		yesCheckBox.click();
		//using CSS selector with id shortcut --> tag#id_attributeValue
		noCheckbox = driver.findElement(By.cssSelector("input#reject"));
		noCheckbox.click();
		//using CSS selector with class shortcut --> tag.class_attributeValue
		yesCheckBox = driver.findElement(By.cssSelector("input._yes"));
		yesCheckBox.click();
		//using CSS selectors with substring --> tag[attributeName*=substringOfattributeValue]
		password = driver.findElement(By.cssSelector("input[attr*=sec]"));
		password.clear();
		password.sendKeys("abc");
		//********Close Browser ************//
		Thread.sleep(5000);
		driver.quit();
	}

}
