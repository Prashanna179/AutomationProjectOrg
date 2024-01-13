package Temenos.ExternalReports;

import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

public class ExtentReportsDemo extends BaseTest{

	
	@Test(testName="Rahulshetty")
	public void test1() throws IOException, InterruptedException
	{ 
        driver.get("https://rahulshettyacademy.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        test.log(Status.PASS,"Rahulshettacademy URL is launched successfully", MediaEntityBuilder.createScreenCaptureFromPath(Utils.getScreenshot("Rahulshettyacademy URL is launched",driver)).build());
        String title = driver.getTitle();
        Assert.assertTrue(title.contains("CPI Testing"));
        test.log(Status.PASS, "Title verification",MediaEntityBuilder.createScreenCaptureFromPath(Utils.getScreenshot("Rahulshettyacademy Title verification",driver)).build());
        driver.findElement(By.xpath("(//a[text()='Courses'])[1]")).click();
        Thread.sleep(3000);
        test.log(Status.PASS, "Courses Page",MediaEntityBuilder.createScreenCaptureFromPath(Utils.getScreenshot("Course Page Landing",driver)).build());
	}
	
	@Test(testName="Amazon")
	public void test2() throws IOException, InterruptedException
	{
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        test.log(Status.PASS,"Amazon URL is launched successfully", MediaEntityBuilder.createScreenCaptureFromPath(Utils.getScreenshot("Amazon URL is launched",driver)).build());
        String title = driver.getTitle();
        Assert.assertTrue(title.contains("Amazon.com"));
        test.log(Status.PASS,"Title verification",MediaEntityBuilder.createScreenCaptureFromPath(Utils.getScreenshot("Amazon Title verification",driver)).build());
        driver.findElement(By.xpath("//a[text()='Your Account']")).click();
        Thread.sleep(3000);
        test.log(Status.PASS,"Your Account",MediaEntityBuilder.createScreenCaptureFromPath(Utils.getScreenshot("Your Account Page Landing",driver)).build());
	}
	
	 
}
