package seleniumPerticular;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HandlingIframes extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = intialisation("chrome");
		 
		 driver.get("https://demoqa.com/frames");
		 Thread.sleep(5000);
		 
		// main page(default content) --> independent frame/s (parentFrame) --> dependent frame/s (childFrame)
		 
		 // to switch to iframe  --> 1) by index 2) by id or name 3) by iframe as web-element
		 //switch to frame by index
		 driver.switchTo().frame(4);
		 WebElement samplePageHeading1 = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
		 String heading1 = samplePageHeading1.getText();
		 if(heading1 != null) {
			 System.out.println("Heading of page1 is: " + heading1);
		 } else {
			 System.out.println("No heading found....!");
		 }
		 
		 //switch from any frame to main page
		 driver.switchTo().defaultContent();
		 
		 //switch to frame by name or id
		 driver.switchTo().frame("frame2");
		 WebElement samplePageHeading2 = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
		 String heading2 = samplePageHeading2.getText();
		 if(heading2 != null) {
			 System.out.println("Heading of page2 is: " + heading2);
		 } else {
			 System.out.println("No heading found....!");
		 }
		 driver.switchTo().defaultContent();
		 
		//Handling nested frame
		 driver.navigate().to("https://demoqa.com/nestedframes");
		 
		 //switch to frame by iframe web-element
		 WebElement parentFrameEle = driver.findElement(By.xpath("//iframe[@id='frame1']"));
		 driver.switchTo().frame(parentFrameEle);
		 WebElement frame1Body = driver.findElement(By.xpath("//body"));
		 String frame1Text = frame1Body.getText();
		 System.out.println("Text in parent frame body is: "+ frame1Text);
		 
		 // switch to child frame 
		 WebElement childFrameEle = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
		 driver.switchTo().frame(childFrameEle);
		 WebElement frame2Paragraph = driver.findElement(By.xpath("//body//p"));
		 String frame2Text = frame2Paragraph.getText();
		 System.out.println("Text in child frame body is: "+ frame2Text);
		 
		 // switch to main page (default content)
		 driver.switchTo().defaultContent();
		 WebElement mainPageHead = driver.findElement(By.xpath("//div[@class='main-header']"));
		 String mainHeader = mainPageHead.getText();
		 System.out.println("Header of main page is: "+ mainHeader);
		 
		 // to quite browser
		 Thread.sleep(5000);
		 driver.quit();
	}
}
