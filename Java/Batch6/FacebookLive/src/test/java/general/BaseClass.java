package general;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	@BeforeSuite (groups= {"Sanity test", "Regression Test"})
	public void beforeSuite() {
		System.out.println("I am before suite");
	}
	
	@BeforeTest (groups= {"Sanity test", "Regression Test"})
	public void beforeTest() {
		System.out.println("I am before whole test");
	}
	
	@AfterTest (groups= {"Sanity test", "Regression Test"})
	public void afterTest() {
		System.out.println("I am after whole test");
	}
	
	@AfterSuite (groups= {"Sanity test", "Regression Test"})
	public void afterSuite() {
		System.out.println("I am after suite");
	}
}


		 		
