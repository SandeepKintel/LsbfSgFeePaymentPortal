package LsbfsgOnlinePaymentPortal.LsbfPortal;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;


@Listeners(ItestListenerPro.class)
public class LaunchLsbfsg extends ItestListenerPro{
	@BeforeMethod
	public void LaunchLsbfSg()
	{
		 driver = new ChromeDriver(); 
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://gus-lsbfsg-wp-develop.go-vip.net/");     
	  
	  /*if(environment.equals("develop"))
	  { 
		 driver.get("https://gus-lsbfsg-wp-develop.go-vip.net/"); 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  }
	  
	  if(environment.equals("stage"))
	  {
		 driver.get("https://gus-lsbfsg-wp-stage.go-vip.net/"); 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  }
	  
	  if(environment.equals("production"))
	  { 
		  driver.get("https://www.lsbf.edu.sg/");  
		  
	  }*/
	  
	}
	
	@AfterMethod
	public void quitLsbfSg() throws InterruptedException
	{
		driver.quit();
	}

}
