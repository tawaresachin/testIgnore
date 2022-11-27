package PomWithPageFactory.PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
  WebDriver driver;
  @FindBy(xpath="")private WebElement ele;
  // find webElements here below
  
  
  
  
  
  public HomePage(WebDriver driver) {
	  PageFactory.initElements(driver, this);
	  this.driver=driver;
  }
  
  //Write methods for actions on webElements here below...

}
