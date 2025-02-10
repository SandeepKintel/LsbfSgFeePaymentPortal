package LsbfsgOnlinePaymentPortal.LsbfPortal;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class IRetryAnalyzerPro implements IRetryAnalyzer {

	@Override
	public boolean retry(ITestResult result) {
		
		int currentcount = 0;
		int retrycount = 2;
		if(currentcount<retrycount)
		{
			currentcount++;
			return true;
		}
		return false;
	}

}
