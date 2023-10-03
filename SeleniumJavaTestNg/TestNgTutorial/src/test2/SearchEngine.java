package test2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SearchEngine {

		@Test
		public void google() throws InterruptedException
		{
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.com/");
			Thread.sleep(5000);
			driver.close();
			
		}
		
		@Test
		public void yahoo() throws InterruptedException
		{
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.yahoo.com/");
			Thread.sleep(5000);
			driver.close();
		}
		

}
