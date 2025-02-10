package LsbfsgOnlinePaymentPortal.LsbfPortal;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NavigateFeePaymentTest extends LaunchLsbfsg{
	
	@Test(retryAnalyzer=LsbfsgOnlinePaymentPortal.LsbfPortal.IRetryAnalyzerPro.class)
	public void NavigateFeePayment()
	{
		LsbfSgHomepage ls=new LsbfSgHomepage(driver);
		ls.hoverAdmission(driver);
		String actual_title = driver.getTitle();
		String expected_title="online fee payment - LSBF";
		Assert.assertTrue(actual_title.equals(expected_title));
	}

}
