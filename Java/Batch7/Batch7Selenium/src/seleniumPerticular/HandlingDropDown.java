package seleniumPerticular;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown extends BaseClass{

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
		
		//To Locate dropdown
		WebElement birthDay = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		WebElement birthMonth = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		WebElement birthYear = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		
		
		
		//select by index
		Select selDay = new Select(birthDay);
		selDay.selectByIndex(24);
		// to extract all options in drodown
		List<WebElement> dayList = selDay.getOptions();
		Iterator<WebElement> dayItr = dayList.iterator();
		while(dayItr.hasNext()) {
			WebElement day = dayItr.next();
			System.out.println("Day: " + day.getText());
		}
		
		//select by value
		Select selMonth = new Select(birthMonth);
		selMonth.selectByValue("2");
		//to check first selected option
		WebElement firstSelected = selMonth.getFirstSelectedOption();
		System.out.println("First selected option is: " + firstSelected.getText());
		
		//select by visible text
		Select selYear = new Select(birthYear);
		selYear.selectByVisibleText("1988");
		//check if multiple options are selected
		boolean multiSelectFlag = selYear.isMultiple();
		System.out.println("Is Year dropdown is muliple selected?: " + multiSelectFlag);
		
		//*****To quit driver*******
		Thread.sleep(5000);
		driver.quit();
	}

}
