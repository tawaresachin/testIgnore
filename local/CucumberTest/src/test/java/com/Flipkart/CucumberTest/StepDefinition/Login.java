package com.Flipkart.CucumberTest.StepDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;

public class Login 
{
	static WebDriver driver;
	@Before
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "src\\test\\java\\com\\Flipkart\\CucumberTest\\resources\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);	
		driver.manage().window().maximize();
	}
	
	@Given("^User enters Flipkart\\.com website url$")
	public void user_enters_Flipkart_com_website_url() throws InterruptedException 
	{
		driver.get("https://www.flipkart.com");
		Thread.sleep(3000);
	}

	@And("^user opens the website login page$")
	public void user_opens_the_website_login_page() throws InterruptedException
	{
		System.out.println("Successfully opened Login Page");
		Thread.sleep(3000);
	}

	@And("^user enters valid \"(.*)\"$")
	public void user_enters_valid_username(String username)
	{
		WebElement userid= driver.findElement(By.xpath("//input[@type='text' and @class='_2IX_2- VJZDxU']"));
		userid.sendKeys(username);

	}

	@And("^user enters valid \"(.*)\" field$")
	public void user_enters_valid_password_field(String password) throws InterruptedException
	{
		WebElement pass=driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys(password);
		Thread.sleep(3000);
	}

	@When("^user click on login button$")
	public void user_click_on_login_button() throws InterruptedException
	{
		WebElement submit=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL' and @type='submit']"));
		submit.click();
		Thread.sleep(3000);
	}

	@Then("^user should be successfully taken to HomePage$")
	public void user_should_be_successfully_taken_to_HomePage()
	{
		List<WebElement> options=driver.findElements(By.xpath("//div[@class='xtXmba']"));
		int size=options.size();
		if(size==9)
		{
			System.out.println("Login Successful & landed on Home Page");
		}
	}
	
	@After
	public void TearDown()
	{
		driver.manage().deleteAllCookies();
		driver.quit();
		driver=null;
	}


}
