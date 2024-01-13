package Temenos.ExternalReports;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utils extends BaseTest {

	public static String getScreenshot(String stepname,WebDriver driver) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source =	ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File(System.getProperty("user.dir")+"\\Reports\\"+folderPath+"\\Screenshots\\"+stepname+".png"));
		return System.getProperty("user.dir")+"\\Reports\\"+folderPath+"\\Screenshots\\"+ stepname +".png";
	}
}
