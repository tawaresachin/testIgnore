package astasoft.flipkart.TestClasses.TestNGPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Sample1 extends BeforeExecution {

	@BeforeClass
	public void instantiateObjects() {
		System.out.println("I am running before all test for this class");
	}
	
	@BeforeMethod
	public void runBeforeTestMethod() {
		System.out.println("I am running before each test method");
	}
	
	@Test(priority='a',enabled=false)
	public void testMethod3() {
		System.out.println("This is test method3");
	}
	
	@Ignore
	@Test (priority='b')
	public void testMethod4() {
		System.out.println("This is test method4");
	}
	
	@AfterMethod
	public void runAfterTestMethod() {
		System.out.println("I am running after each test method");
	}
	
	@AfterClass
	public void closeAllObjects() {
		System.out.println("I am running after all tests of this class");
	}
}
