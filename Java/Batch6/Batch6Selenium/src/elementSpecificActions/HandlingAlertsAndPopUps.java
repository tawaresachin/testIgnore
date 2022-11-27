package elementSpecificActions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlertsAndPopUps {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Study\\Testing Class\\Java\\Batch6\\Batch6Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		WebElement customerID = driver.findElement(By.name("cusid"));
		WebElement submitButton = driver.findElement(By.name("submit"));		
		customerID.sendKeys("123");
		submitButton.submit();
		
		Alert alert = driver.switchTo().alert();		
		//*********To grab the text from alert***********
		 String alertText = alert.getText();
		 System.out.println(alertText);		 
		 //*********To click on accept button on alert***********
		 alert.accept();		 
		//*********To click on cancel button on alert***********
//		 alert.dismiss();
		 
		 driver.navigate().to("https://demoqa.com/alerts");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		 Alert alert1 = driver.switchTo().alert();		 
		//*********To enter the text into input fields***********
		 alert1.sendKeys("Batch6");
		 Thread.sleep(5000);
		 alert1.accept();
		 Thread.sleep(5000);
		 driver.quit();		 
	}
}
