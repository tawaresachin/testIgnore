package webelementActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonWebElementActions {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Study\\Testing Class\\Java\\Batch6\\Batch6Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.get("https://www.google.com");
//		WebElement googleImage = driver.findElement(By.className("lnXdpd"));
		WebElement searchBox = driver.findElement(By.name("q"));
		WebElement submitButton = driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@value='Google Search']"));
		WebElement gmailLink = driver.findElement(By.linkText("Gmail"));
		//************************Common WebElement Actions******************
//		if(googleImage.isDisplayed()) {
//			Dimension size = googleImage.getSize();
//			System.out.println("Height of googleImage: "+size.height);
//			System.out.println("Width of googleImage: "+size.width);
//		}
		if(searchBox.isEnabled()) {
			String searchBoxTagname = searchBox.getTagName();
			System.out.println("Tag name of searchbox is: "+searchBoxTagname);
			searchBox.sendKeys("Selenium");
			searchBox.clear();
			searchBox.sendKeys("WebDriver");
		}
		if(submitButton.isEnabled()) {
//			submitButton.click();        //applicable only for type=button
			String roleOfWebElement = submitButton.getAttribute("role");
			System.out.println("The role of Webelement is: "+roleOfWebElement);
			Point positionOfButton = submitButton.getLocation();
			System.out.println("X position of button is: "+ positionOfButton.x);
			System.out.println("Y position of button is: "+ positionOfButton.y);
			submitButton.submit();       //applicable only for type=submit
		}
		driver.navigate().back();
		if(gmailLink.isDisplayed()&& gmailLink.isEnabled()) {
		String linkText = gmailLink.getText();
		System.out.println("Text associated with gmailLink is: "+linkText);
		gmailLink.click();
		}
		driver.navigate().back();
		driver.navigate().to("https://www.facebook.com");
		WebElement createAccount = driver.findElement(By.linkText("Create New Account"));
		if(createAccount.isEnabled()) {
		createAccount.click();
		}
		Thread.sleep(2000);
		WebElement genderMale = driver.findElement(By.xpath("//input[@value='2']"));
		if(!genderMale.isSelected()) {
			genderMale.click();
		}
		Thread.sleep(5000);
		driver.close();
	}
}
