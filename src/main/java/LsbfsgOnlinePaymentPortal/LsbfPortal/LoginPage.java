package LsbfsgOnlinePaymentPortal.LsbfPortal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
	@FindBy(xpath="//input[@id='email']")
	WebElement emailfield;

	@FindBy(xpath="//input[@id='password']")
	WebElement Password;
	
	@FindBy(xpath="/html/body/div/main/div/div/div/div[2]/div/div[1]/div[1]/form/p[1]/input[1]")
	WebElement loginbutton;
	
	public void enteremail(String id)
	{
		emailfield.sendKeys(id);
	}
	
	public void enterpassword(String password)
	{
		Password.sendKeys(password);
	}
	
	public void clickLogin()
	{
		loginbutton.click();
	}
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
