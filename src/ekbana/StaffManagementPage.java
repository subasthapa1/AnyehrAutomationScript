package ekbana;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class StaffManagementPage {
	WebDriver driver;

	By staffDropdown = By.name("filter");
	By searchBox = By.id("search");
	By butn = By.xpath("/html/body/div/div[2]/div[1]/div/div/div/div/div/form/div[3]/button");
	By addStaffBtn = By.xpath("/html/body/div/div[2]/div[1]/div/div/div/div/div/div/p/a");
	By updateBtn = By.xpath("/html/body/div/div[2]/div[1]/div/div/div/div/table/tbody/tr[1]/td[5]/a[1]");
	By locationBtn = By.xpath("/html/body/div/div[2]/div[1]/div/div/div/div/table/tbody/tr[1]/td[5]/a[2]");
	By deleteBtn = By.xpath("/html/body/div/div[2]/div[1]/div/div/div/div/table/tbody/tr[1]/td[5]/a[3]");
	
	public StaffManagementPage(WebDriver driver)
	{
		this.driver = driver;
	}
	public void setRole(String role)
	{
		Select drp= new Select(driver.findElement(staffDropdown));
		drp.selectByVisibleText(role);
	     
	}
	
	public void setStaffName(String staff)
	{
		driver.findElement(searchBox).sendKeys("staff");
	}
	
	public void clickBtn()
	{
		driver.findElement(butn).click();
	}
	public void searchStaff(String index, String userName){
		this.setRole(index);
		this.setStaffName(userName);
		this.clickBtn();
		
	}
	

}
