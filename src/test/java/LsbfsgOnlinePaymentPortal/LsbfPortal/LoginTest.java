package LsbfsgOnlinePaymentPortal.LsbfPortal;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest extends LaunchLsbfsg{
	@Test(dataProvider="dataset",retryAnalyzer=LsbfsgOnlinePaymentPortal.LsbfPortal.IRetryAnalyzerPro.class)
	public void loginTest(String id, String password) throws InterruptedException
	{
		LsbfSgHomepage ls = new LsbfSgHomepage(driver);
		LoginPage lg = new LoginPage(driver);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));	
		ls.clickApplyNow();
		String actual_title=driver.getTitle();
		String expected_title="apply now - LSBF";
		Assert.assertTrue(actual_title.equals(expected_title));	
		lg.enteremail(id);
		lg.enterpassword(password);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", lg.loginbutton);
		wait.until(ExpectedConditions.elementToBeClickable(lg.loginbutton));
		lg.clickLogin();
		WebElement Text = driver.findElement(By.xpath("//h2[@class=\"text-secondary mb-6 text-center\"]"));
		Assert.assertTrue(Text.isDisplayed());
		
	}
	@DataProvider(name="dataset")
	public Object[][] data() throws EncryptedDocumentException, IOException
	{
		FileInputStream f1 = new FileInputStream("C:\\Users\\sandeep.kumar\\eclipse-workspace\\LsbfPortal\\datasheet.xlsx");
		Workbook w1 = WorkbookFactory.create(f1);
		String id = w1.getSheet("creds").getRow(1).getCell(0).getStringCellValue();
		String password = w1.getSheet("creds").getRow(1).getCell(1).getStringCellValue();
		Object[][] obj = new Object[1][2];
		obj[0][0]=id;
		obj[0][1]=password;
		
		return obj;
		
		
	}

}
