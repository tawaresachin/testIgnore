package elementSpecificActions;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Study\\Testing Class\\Java\\Batch6\\Batch6Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Pritam");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Dengale");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("pritam.dengale@gmail.com");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("test@123");
		
		WebElement birthday = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		WebElement birhMonth = driver.findElement(By.name("birthday_month"));
		WebElement birthYear = driver.findElement(By.name("birthday_year"));
		//**************To select specific option from dropdown*******************
		Select sel = new Select(birthday);
		sel.selectByIndex(24);
		Select sel1 = new Select(birhMonth);
		sel1.selectByValue("4");
		Select sel2 = new Select(birthYear);
		sel2.selectByVisibleText("2004");
		//**************To get all options from dropdown*******************
		List<WebElement> options = sel1.getOptions();
		Iterator<WebElement> itr = options.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next().getText());
		}
		//**************To get first selected option from dropdown*******************
		WebElement firstSelected = sel.getFirstSelectedOption();
		System.out.println(firstSelected.getText());
		
		//**************To check if multiple options are selected*******************
		boolean selectMultiple = sel.isMultiple();
		System.out.println(selectMultiple);
		
		//**************To check if particular/all option are deselected*******************
//		sel.deselectByIndex(24);
//		sel1.deselectByValue("4");
//		sel2.deselectByVisibleText("2004");
//		sel1.deselectAll();		
		
		driver.quit();
}
}