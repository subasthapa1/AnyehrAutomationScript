package testCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import ekbana.LoginPage;

public class LoginTestCases {
  @Test
  public void verifyValidLogin() {
	  WebDriver driver = new FirefoxDriver();
	  driver.get("http://emr.anyehr.com/cms/login");
	  LoginPage login= new LoginPage(driver);
	  login.doLogin("superqa", "superqa@123");
	  driver.quit();
	  
  }
}
