package seleniumPerticular;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HandlingAlerts extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = intialisation("edge");
		
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		
		WebElement alertButton1 = driver.findElement(By.xpath("//button[@id='alertButton']"));
		alertButton1.click();
		
		// To handle alert  --> 1) accept 2) dismiss 3)getText 4) sendKeys
		Alert alert = driver.switchTo().alert();
		
		//to get text contents of alert
		String alertText = alert.getText();
		System.out.println("Contents on alert: "+ alertText);
		
		//to give affirmation to alert --> confirm/Yes/Accept  --> accept()
		alert.accept();
		Thread.sleep(2000);
		
		// to give negation to alert --> reject/No/Cancel  --> dismiss()
		WebElement alertButton2 = driver.findElement(By.xpath("//button[@id='confirmButton']"));
		alertButton2.click();
		alert.dismiss();
		
		//to enter text on text field of alert
		WebElement alertButton3 = driver.findElement(By.xpath("//button[@id='promtButton']"));
		alertButton3.click();
		alert.sendKeys("ABCDEF");
		alert.accept();
		
		//to quit browser
		Thread.sleep(5000);
		driver.quit();

	}

}
