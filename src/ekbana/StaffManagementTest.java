package ekbana;




import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class StaffManagementTest {
	WebDriver driver;
	LoginPage lgin;
	LoginCase lgcs;
	StaffManagementPage pg;
	//WebDriverWait wait = new WebDriverWait(driver,20);
	
	@BeforeTest
	public void install()
	{
		 driver = new FirefoxDriver();

	       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

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
	// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[2]/div[1]/div/div/div/div/div/div/div/div[1]/div/div/form/div[5]/button")));

	     //  driver.navigate().to("http://emr.anyehr.com/cms/staff/pages/staffmanagement");
	   }
	 @Test(priority=2)
	 public void searchStaff()
	 {
		 pg =new StaffManagementPage(driver);
		 pg.searchStaff("Administrator", "Subas");
	 }
	
}
