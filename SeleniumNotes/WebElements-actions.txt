package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebElementActions {
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
		WebDriver driver = WebElementActions.intialisation("edge");	
		driver.get("https://www.facebook.com/");
		
		//to check if webElement is displayed or not
		WebElement facebookLogo = driver.findElement(By.xpath("//img[@alt='Facebook']"));
		boolean flag1 = facebookLogo.isDisplayed();
		if(flag1) {
			System.out.println("Logo is displayed");
		}else {
			System.out.println("Logo is not displayed");
		}
		
		//to enter string into textbox --> sendKeys("string")
		WebElement userName = driver.findElement(By.xpath("//input[@id='email']"));
		boolean flag2 = userName.isEnabled();
		if(flag2) {
		System.out.println("userName textbox is enabled");
		userName.sendKeys("astasoft2020@gmail.com");
		} else {
			System.out.println("userName textbox is not enabled");
		}
		
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		boolean flag3 = password.isEnabled();
		if(flag3) {
		System.out.println("password textbox is enabled");
		password.sendKeys("Test@12345");
		} else {
			System.out.println("password textbox is not enabled");
		}
		
		// To clear text from textbox --> clear()
		Thread.sleep(3000);
		password.clear();
		
		Thread.sleep(3000);
		password.sendKeys("Test@12345");
		
		// to click on button with @type='submit' --> submit()
//		WebElement loginButton = driver.findElement(By.xpath("//button[@name='login']"));
//		loginButton.submit();
		
		// to check click action on button
		WebElement createNewAccountButton = driver.findElement(By.xpath("//a[contains(@data-testid,'registration')]"));
		if(createNewAccountButton.isEnabled()) {
			createNewAccountButton.click();
		}else {
			System.out.println("createNewAccount button is not enabled");
		}
		Thread.sleep(3000);
		
		//to check if webelement is selected?
		WebElement radioButtonFemale = driver.findElement(By.xpath("//span//label[text()='Female']"));
		if(radioButtonFemale.isEnabled()) {
			if(radioButtonFemale.isSelected()) {
				System.out.println("Female radio button is already selected");
			}else {
				System.out.println("Female radio button is not already selected");
				radioButtonFemale.click();
			}
		}else {
			System.out.println("Female radio button is disabled");
		}
		
		// to get the text associated with located webElement
		WebElement signUpHeading = driver.findElement(By.xpath("//div[@class='mbs _52lq fsl fwb fcb']"));
		String text = signUpHeading.getText();
		System.out.println("The text associated with element signUpHeading is: " + text);
		
		// to check location of webelement on browser
		WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
		Point location = firstName.getLocation();
		int xLoc = location.getX();
		int yLoc= location.getY();
		String loc = location.toString();
		System.out.println("X location of sfirstName textBox: " + xLoc );
		System.out.println("Y location of firstName textBox: " + yLoc );
		System.out.println("X-Y location of firstName textBox: " + loc);
		
		// to check the size or dimension of webelement
		Dimension size = firstName.getSize();
		int height = size.getHeight();
		int width = size.getWidth();
		String sz = size.toString();
		System.out.println("Height of firstName textBox: " + height);
		System.out.println("Width of firstName textBox: " + width);
		System.out.println("width-height of firstName textBox: " + sz);
		
		//to get the tagName of located element
		String tag = firstName.getTagName();
		System.out.println("TagName of firstName textbox is: " + tag);
		
		//to get the attribute value associated with located element
		String attrValue = firstName.getAttribute("data-type");
		System.out.println("Attribute value for data-type attribute of firstName textBox is: "+ attrValue);
		
	
		//***************Quit webDriver **********
		Thread.sleep(5000);
		driver.quit();
	}
}
