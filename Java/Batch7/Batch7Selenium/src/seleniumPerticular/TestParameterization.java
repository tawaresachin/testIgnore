package seleniumPerticular;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestParameterization extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		String browser = Parameterization.readProperty(Constants.ENVIRONMENT_PROPERTIES, "browser");
		String url = Parameterization.readProperty(Constants.ENVIRONMENT_PROPERTIES, "url");
		WebDriver driver = intialisation(browser);
		//open desired url 
		driver.get(url);
		WebElement userName = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		
		for(int i=1; i<4; i++) {
			Object user = Parameterization.readExcel(Constants.TEST_DATA, i, 0);
			Object pass= Parameterization.readExcel(Constants.TEST_DATA, i, 1);
			userName.clear();
			userName.sendKeys((String)user);
			Thread.sleep(2000);
			password.clear();
			password.sendKeys((String)pass);
		}
		
		//********To quit browser
		Thread.sleep(5000);
		driver.quit();
	}
}
