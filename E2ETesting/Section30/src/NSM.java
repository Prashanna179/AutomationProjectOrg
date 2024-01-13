import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NSM {
	public static void main(String[] args) throws InterruptedException, IOException
	{
		WebDriverManager.chromedriver().setup();
		String downloadPath=System.getProperty("user.dir")+"//download";
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		//chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("download.default_directory", downloadPath);
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.setExperimentalOption("prefs",chromePrefs);
		chromeOptions.addArguments("--start-maximized");
        chromeOptions.addArguments("--disable-extensions");
        chromeOptions.addArguments("--ignore-certificate-errors");
        chromeOptions.addArguments("--ignore-ssl-errors=yes");
        chromeOptions.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(chromeOptions);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.navigate().to("https://data.fca.org.uk/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@id='nsmLibrary']")).click();
		driver.findElement(By.xpath("//button[text()='Yes, I agree']")).click();

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//input[@value='Accept']")));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Accept']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id='issuerLEI']")).sendKeys("213800DU1LGY3R2S2X42");
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//input[@value='Export as CSV']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@value='OK'])[2]")).click();
		Thread.sleep(3000);
		
		//Runtime.getRuntime().exec("C:\\UserDrive\\Prashan\\E2ETesting\\Section30\\DownloadFile.exe");
//		try
//		{
//		Runtime.getRuntime().exec("C:\\Program Files\\AutoITExec\\DownloadFile.exe");
//		Thread.sleep(3000);
//		}
//		catch(Exception e)
//		{
//			System.out.println(e.getMessage());
//		}
//		
		
	}
}