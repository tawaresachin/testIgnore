package seleniumPerticular;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HandlingKeyboardMouseActions extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = intialisation("edge");
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		WebElement SearchBox = driver.findElement(By.xpath("//input[@name='q']"));
		WebElement searchButton = driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@class='gNO89b']"));
		
		//Actions class --> to control keyboard & mouse actions (driver controlled)
		Actions act = new Actions(driver);
		act.moveToElement(SearchBox).click().sendKeys("Selenium").build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ESCAPE).build().perform();
		Thread.sleep(2000);
		act.moveToElement(searchButton).click().build().perform();
		
		// Actions on DemoQA website
		driver.navigate().to("https://demoqa.com/droppable");
		WebElement draggable = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement droppable = driver.findElement(By.xpath("//div[@id='droppable']"));
		// Methods- ClickAndHold & Release
//		act.moveToElement(draggable)
//			.clickAndHold()
//			.moveToElement(droppable)
//			.release()
//			.build().perform();
		
		//Method- dragAndDrop
		act.dragAndDrop(draggable, droppable).build().perform();
		
		//Method - contextClick  (RightClick)
		act.moveToElement(droppable).contextClick().build().perform();
		
		//Method- doubleClick
		WebElement heading = driver.findElement(By.xpath("//div[@class='main-header']"));
		act.moveToElement(heading).doubleClick().build().perform();
		
		//
		driver.navigate().to("https://demoqa.com/automation-practice-form");
		WebElement firstNameText = driver.findElement(By.xpath("//input[@id='firstName']"));
		WebElement lastNameText = driver.findElement(By.xpath("//input[@id='lastName']"));
		act.moveToElement(firstNameText).click().sendKeys("abcdef").build().perform();
		//copy text
		act.moveToElement(firstNameText).click()
		.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL)
		.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL)
		.build().perform();
		//paste text
		act.moveToElement(lastNameText).click()
		.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL)
		.build().perform();
		Thread.sleep(2000);
		
		//Method- moveByOffset(X,Y)
		driver.navigate().to("https://demoqa.com/dragabble");
		WebElement box = driver.findElement(By.xpath("//div[@id='dragBox']"));
		act.moveToElement(box).clickAndHold().moveByOffset(200, 80).release().build().perform();
		

		//**********Quit browser**********
		Thread.sleep(5000);
		driver.quit();


	}

}
