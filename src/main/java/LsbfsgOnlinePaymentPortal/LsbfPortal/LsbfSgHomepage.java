package LsbfsgOnlinePaymentPortal.LsbfPortal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LsbfSgHomepage {
	WebDriver driver;
	 
	@FindBy(xpath = "(//li[@class='menu-dropdown nav-item-1 '])[3]")
	WebElement Admissions;
	
	@FindBy(xpath = "//a[text()='Fee payment']")
	WebElement FeePayment;
	
	@FindBy(xpath = "//a[@class=\"cta-button applynowone fw-semibold\"]")
	WebElement ApplyNow;
	
	public void hoverAdmission(WebDriver driver)
	{
		Actions action=new Actions(driver);
		action.moveToElement(Admissions).perform();
		FeePayment.click();
	}
	
	public void clickApplyNow()
	{
		ApplyNow.click();
	}
	
	
	public LsbfSgHomepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
