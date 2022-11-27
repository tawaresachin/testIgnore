package astasoft.flipkart.TestClasses.TestNGPractice;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BeforeExecution {
	/* BS     --> Once for suite
	 * 	BT    --> Once for each test class
	 * 	 BC   --> once for current test class
	 *    BM  --> before each @Test
	 *     @Test
	 *    AM  --> after each @Test
	 *   AC   --> once for current test class
	 *  AT    --> once for each test class
	 * AS     --> once for suite
	 * 
	 */
	
	
	//suite = testClass1 + testClass2 + tetsClass3 +.....

@BeforeSuite
 public void runBeforeWholeSuite() {
	 System.out.println("I am running before the start of suite execution");
 }

 @BeforeTest
 public void runBeforeEachTestClass() {
	 System.out.println("I am running before each test class in a suite");
 }
	
 @AfterTest
 public void runAfterEachTestClass() {
	 System.out.println("I am running after each test class in as suite");
 }
 
 @AfterSuite
 public void runAfterWholeSuite() {
	 System.out.println("I am running after the end of suite execution");
 }
}
