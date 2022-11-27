package astasoft.flipkart.TestClasses.TestNGPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sample2 extends BeforeExecution {

	@BeforeClass
	public void instantiateObjects() {
		System.out.println("I am running before all test for this class");
	}
	
	@BeforeMethod
	public void runBeforeTestMethod() {
		System.out.println("I am running before each test method");
	}
	
	@Test(priority=0,invocationCount=3)
	public void testMethod5() {
		System.out.println("This is test method5");
	}
	
	@Test(priority=-1)
	public void testMethod6() {
		System.out.println("This is test method6");
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
