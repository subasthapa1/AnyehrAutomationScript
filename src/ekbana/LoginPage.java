package ekbana;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	By usrName = By.name("username");
	By passwd = By.name("password");
	By btn = By.xpath("//button[@type='submit']");
	
	public LoginPage(WebDriver driver)
	{
		this.driver= driver;
	
	}
	
	public void setUsername(String strUsername)
	{
		driver.findElement(usrName).clear();
		driver.findElement(usrName).sendKeys(strUsername);
	}
	public void setPassword(String strPassword)
	{
		driver.findElement(passwd).clear();
		driver.findElement(passwd).sendKeys(strPassword);
	}
	
	public void clickButton(){
		driver.findElement(btn).click();
		
	}
	
	public void doLogin(String strUsername, String strPassword)
	{
		this.setUsername(strUsername);
		this.setPassword(strPassword);
		this.clickButton();
	}
	

}
