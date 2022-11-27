package general;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SampleClass extends BaseClass{	
	
	String ExpectedResultForMethod1 = "Method1";
	boolean ActualResultForMethod2 = false;
	String ActualResultForMethod3 = null;
	
	@BeforeClass (groups= {"Sanity test", "Regression Test"})
	public void beforeTestClass() {
		System.out.println("I am before Class");
	}	
	@BeforeMethod (groups= {"Sanity test", "Regression Test"})
	public void beforeTestMethod() {
		System.out.println("I am before Method");
	}	

	@Test(enabled=true)
	public void testMethod1() {
		System.out.println("I am test method1");
		Assert.assertNotEquals("Method2", ExpectedResultForMethod1, "Test Case-1 is failed");
		System.out.println("Validation-1");
		Assert.assertFalse(ActualResultForMethod2, "Test Case-2 is failed");
		System.out.println("Validation-2");
		Assert.assertNull(ActualResultForMethod3, "Test Case-3 is failed");
		System.out.println("Validation-3");
		
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertNotEquals("Method2", ExpectedResultForMethod1, "Test Case-4 is failed");
		System.out.println("Validation-4");
		softAssert.assertFalse(ActualResultForMethod2, "Test Case-5 is failed");
		System.out.println("Validation-5");
		softAssert.assertNull(ActualResultForMethod3, "Test Case-6 is failed");
		System.out.println("Validation-6");
		softAssert.assertAll();
		
		Reporter.log("Test Method-1 is passed", true);
	}	
	
	@Test(priority=1, invocationCount=3, groups= {"Regression Test"})
	public void testMethod2() {
		System.out.println("I am test method2");
	
	}	
	@Test(dependsOnMethods= {"testMethod2"}, timeOut=2000, groups= "Regression Test")
	public void testMethod3() throws InterruptedException {
		System.out.println("I am test method3");
		Thread.sleep(3000);
	}		
	@Test (groups= {"Sanity test"})
	public void testMethod4() {
		System.out.println("I am test method4");
	}	
	@Test (groups= {"Regression Test", "Sanity test"})
	public void testMethod5() {
		System.out.println("I am test method5");
		Assert.fail();
	}	
	
	@AfterMethod (groups= {"Sanity test", "Regression Test"})
	public void afterTestMethod() {
		System.out.println("I am after Method");
	}	
}

