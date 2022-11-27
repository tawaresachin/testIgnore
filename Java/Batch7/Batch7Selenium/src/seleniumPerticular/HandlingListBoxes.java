package seleniumPerticular;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import seleniumBasics.WebElementActions;

public class HandlingListBoxes extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = WebElementActions.intialisation("edge");	
		driver.get("https://codepen.io/rajatsansar/pen/NZJMoW");
		Thread.sleep(2000);
		WebElement listBox = driver.findElement(By.xpath("//select[@id='test']"));
		Select sel = new Select(listBox);
		sel.selectByIndex(1);
//		sel.selectByIndex(2);
		

	}

}
