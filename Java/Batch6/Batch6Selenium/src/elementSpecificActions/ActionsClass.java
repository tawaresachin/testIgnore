package elementSpecificActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Study\\Testing Class\\Java\\Batch6\\Batch6Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);		
		driver.get("https://www.facebook.com");		
		WebElement singnUpButton = driver.findElement(By.linkText("Create New Account"));
//		singnUpButton.click();
		Actions action = new Actions(driver);
		//click action
		action.moveToElement(singnUpButton).click().build().perform();		
		WebElement learnMore = driver.findElement(By.xpath("//a[@id='non-users-notice-link']"));
		//right Click action
		action.moveToElement(learnMore).contextClick().build().perform();		
		driver.navigate().to("https://demoqa.com/droppable");
		WebElement sourceDraggable = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement destDroppable = driver.findElement(By.xpath("(//div[@id='droppable'])[1]"));	
		//click & hold, release actions
		action.moveToElement(sourceDraggable).clickAndHold().moveToElement(destDroppable).release().build().perform();
		// drag and drop action
//		action.moveToElement(sourceDraggable).dragAndDrop(sourceDraggable, destDroppable).build().perform();		
		driver.navigate().to("https://demoqa.com/dragabble");
//		driver.manage().window().maximize();
		WebElement dragBox = driver.findElement(By.xpath("//div[@id='dragBox']"));
		//move cursor by X & Y offsets
		action.clickAndHold(dragBox).moveByOffset(50, 50).release().build().perform();		
		driver.navigate().to("https://www.facebook.com");
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		action.moveToElement(email).click().sendKeys("pritam").build().perform();	
		//Keyboard actions - Key Press, Key Release
		action.moveToElement(email).click().keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL)
		.keyDown(Keys.CONTROL).sendKeys("x").keyUp(Keys.CONTROL).build().perform();

	}

}
