package elementSpecificActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingIframes {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Study\\Testing Class\\Java\\Batch6\\Batch6Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/frames");
		
//		driver.switchTo().frame("frame1");      //switching to frame by id or name
//		driver.switchTo().frame(0);            // switching to frame by index
		WebElement iframe = driver.findElement(By.xpath("//iframe[@id='frame1']"));
		driver.switchTo().frame(iframe);      //switching to frame by WebElement
		
		String bodyText = driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText();
		System.out.println(bodyText);
		
		driver.switchTo().defaultContent();		// switching from any iframe to default host page		
		String defaultText = driver.findElement(By.xpath("//div[@class='main-header']")).getText();
		System.out.println(defaultText);
		
		//**************************Nested iframes*****************************
		driver.navigate().to("https://demoqa.com/nestedframes");
		WebElement parentFrame = driver.findElement(By.xpath("//iframe[@id='frame1']"));
		driver.switchTo().frame(parentFrame);  // Switching to parent frame
		
		WebElement childFrame = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
		driver.switchTo().frame(childFrame);   // Switching to child frame
		String childContent = driver.findElement(By.xpath("//body//p")).getText();
		System.out.println(childContent);
		
		driver.switchTo().parentFrame();
		String parentContent = driver.findElement(By.tagName("body")).getText();
		System.out.println(parentContent);       // Switching back to parent frame
		
		driver.switchTo().defaultContent();       //Switching back to default contents of host page
		String defaultText1 = driver.findElement(By.xpath("//div[@class='main-header']")).getText();
		System.out.println(defaultText1);
		driver.quit();
	}
}



