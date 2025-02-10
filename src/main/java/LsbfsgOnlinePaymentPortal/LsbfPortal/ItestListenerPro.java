package LsbfsgOnlinePaymentPortal.LsbfPortal;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ItestListenerPro implements ITestListener{
	
	static WebDriver driver;
	@Override
	public void onTestSuccess(ITestResult result) {
		ITestListener.super.onTestSuccess(result);
		Reporter.log("Test Case is Passed");
		Date d1 = new Date();
		Date d2 = new Date(d1.getTime());
		String time = d2.toString();
		String day = time.substring(0, 4);
		String monthday = time.substring(4, 11);
		String time2 = time.substring(11, 19);
		String updatedTime = time2.replace(':', '_');
		String exact_time= day.concat(monthday).concat(updatedTime);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\sandeep.kumar\\eclipse-workspace\\LsbfPortal\\Screenshots\\passed\\passedss "+exact_time+" .png");
		try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onTestFailure(ITestResult result) {
		ITestListener.super.onTestFailure(result);
		Reporter.log("Test Case is Failed");
		Date d1 = new Date();
		Date d2 = new Date(d1.getTime());
		String time = d2.toString();
		String day = time.substring(0, 4);
		String monthday = time.substring(4, 11);
		String time2 = time.substring(11, 19);
		String updatedTime = time2.replace(':', '_');
		String exact_time= day.concat(monthday).concat(updatedTime);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\sandeep.kumar\\eclipse-workspace\\LsbfPortal\\Screenshots\\failed\\failedss "+exact_time+" .png");
		try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	

}
