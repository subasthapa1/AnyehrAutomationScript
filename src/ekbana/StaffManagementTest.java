package ekbana;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class StaffManagementTest {
	WebDriver driver;
	LoginPage lgin;
	LoginCase lgcs;
	StaffManagementPage pg;
	
	@BeforeTest
	public void install()
	{
		 driver = new FirefoxDriver();

	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	        driver.get("http://emr.anyehr.com/cms/login");
	        
	}
	
	/*@Test(priority=0)
	public void login()
	{
		
		lgin =new LoginPage(driver);
	        lgin.doLogin("superqa", "superqa@123");
	}
	*/
	 @Test(alwaysRun=true,priority=1)

	    public void setup()
	   {

	        //driver = new FirefoxDriver();
		 LoginPage lgin =new LoginPage(driver);
		
	        lgin.doLogin("superqa", "superqa@123");
	        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	        driver.navigate().to("http://emr.anyehr.com/cms/staff/pages/staffmanagement");
	   }
	 @Test(priority=2)
	 public void searchStaff()
	 {
		 pg =new StaffManagementPage(driver);
		 pg.searchStaff("Administrator", "Subas");
	 }
	
}
