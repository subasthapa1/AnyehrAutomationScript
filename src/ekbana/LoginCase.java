package ekbana;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginCase {
	WebDriver driver;
	LoginPage page;
	
	 @BeforeTest(alwaysRun=true)

	    public void setup(){

	        driver = new FirefoxDriver();

	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	        driver.get("http://emr.anyehr.com/cms/login");

	    }	
	   
  @Test(priority=1)
  public void loginUsingValidUser() {
	  page = new LoginPage(driver);
	  page.doLogin("superqa", "superqa@123");
  }
  @Test(priority=0)
  public void loginUsingInvalidUser() {
	  page = new LoginPage(driver);
	  page.doLogin("superqas", "superqa@1234");
  }
  @Test(priority=2)
  public void loginUsingBlankUser() {
	  page = new LoginPage(driver);
	  page.doLogin("superqas", "superqa@1234");
  }
}
