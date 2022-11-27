package astasoft.flipkart.TestClasses.TestNGPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample4 {
	@Test
	@Parameters("url")   //Parameter --> argument --> use arg in desired method
	public void testMethod12(String webURL) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(webURL);
		Reporter.log("I am method 12", true);
	}
	
	@Test
	public void testMethod13() {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		System.out.println("I am test method 13");
	}
	
	@Test
	public void testMethod14() {
		System.out.println("I am test method 14");
	}

}
