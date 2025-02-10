package LsbfsgOnlinePaymentPortal.LsbfPortal;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ApplyNowTest extends LaunchLsbfsg{
	@Test(retryAnalyzer=LsbfsgOnlinePaymentPortal.LsbfPortal.IRetryAnalyzerPro.class)
	public void aaplyNowTest()
	{
		LsbfSgHomepage ls = new LsbfSgHomepage(driver);
		ls.clickApplyNow();
		String actual_title=driver.getTitle();
		String expected_title="apply now - LSBF";
		Assert.assertTrue(actual_title.equals(expected_title));	
		
		
	}

}
