package astasoft.flipkart.TestClasses.TestNGPractice;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample extends BeforeExecution {

	@BeforeClass
	public void instantiateObjects() {
		System.out.println("I am running before all test for this class");
	}
	
	@BeforeMethod
	public void runBeforeTestMethod() {
		System.out.println("I am running before each test method");
	}
	
	@Test(priority=0)
	public void testMethod1() {
		Assert.fail();
		System.out.println("This is test method1");
	}
	
	@Test(priority=1,dependsOnMethods= {"testMethod1"})
	public void testMethod2() {
		System.out.println("This is test method2");
	}
	
	@Test(priority=2)
	public void testMethodX() {
		System.out.println("This is test methodX");
	}
	
	@Test(priority=3, timeOut=2000)
	public void testMethodY() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("This is test methodY");
	}
	
	@Test(groups= {"Sanity","Regression"})
	public void testMethodA() {
		System.out.println("This is test methodA");
	}
	
	@Test(groups= {"Regression"})
	public void testMethodB() {
		System.out.println("This is test methodB");
	}
	
	@Test(groups= {"Sanity","Regression"})
	public void testMethodC() {
		System.out.println("This is test methodC");
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
