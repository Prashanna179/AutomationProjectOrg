package Temenos.ExternalReports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest extends Listener{

	WebDriver driver;
	
	@BeforeMethod
	public WebDriver initializeDriver()
	{
		 WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
	     return driver;
	}
	@AfterMethod
	public void closeWindow()
	{
		driver.close();
	}
}
