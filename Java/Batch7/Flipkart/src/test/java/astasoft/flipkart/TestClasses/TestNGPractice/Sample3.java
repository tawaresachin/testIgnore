package astasoft.flipkart.TestClasses.TestNGPractice;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Sample3 extends BeforeExecution {
	SoftAssert soft = new SoftAssert();
	//Hard Assert OR Validation 
	@Test
	public void testMethod8() {
		String userNameFieldLabel = "userName";
		String titleActual = "Google";
		boolean logoDisplayed = true;
		//Actual = null
		Assert.assertNull(userNameFieldLabel, "UserNameField has label");
		//Actual = True
		Assert.assertTrue(logoDisplayed, "Logo is not displayed");
		// Actual = Expected
		Assert.assertEquals(titleActual, "Google1", "Title is not matching");
		System.out.println("I am testMethod8");
	}
	
	@Test
	public void testMethod9() {
		String submitButtonLabel = "Sumbit";
		String titleActual = "Google1";
		boolean ifAdditionalTextAppered = false;
		//Actual != null
		Assert.assertNotNull(submitButtonLabel,"Submit button has no label");
		//Actual = False
		Assert.assertFalse(ifAdditionalTextAppered, "Additional text appeared on page");
		//Actual != Expected
		Assert.assertNotEquals(titleActual, "Google1", "Wrong title is displayed");
		System.out.println("I am testMethod9");
	}
	
	@Test
	public void testMethod10() {
		Assert.fail();
		System.out.println("I am testMethod 10");
	}
	
	@Test
	public void testMethod11() {
		String additionalText = "abcd...";
		String actualTitle = "Google";
		boolean logoDisplayed = true;
		// actual = null
		soft.assertNull(additionalText, "Additional text appeared on page");
		//actual = expected
		soft.assertEquals(actualTitle, "Google", "Title is not matching");
		//actual = True
		soft.assertTrue(logoDisplayed, "Logo is not displayed");
		soft.assertAll();
	}
	
	@Test
	public void testMethod12() {
		String submitButtonLabel = null;
		String titleActual = "Google1";
		boolean ifAdditionalTextAppered = true;
		//Actual != null
		soft.assertNotNull(submitButtonLabel,"Submit button has no label");
		//Actual = False
		soft.assertFalse(ifAdditionalTextAppered, "Additional text appeared on page");
		//Actual != Expected
		soft.assertNotEquals(titleActual, "Google1", "Wrong title is displayed");
		soft.assertAll();
		System.out.println("I am testMethod9");
	}
}
