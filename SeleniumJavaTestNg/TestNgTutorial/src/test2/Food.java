package test2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Food {

	@Test
	public void dunzo() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.dunzo.com/bangalore");
		Thread.sleep(5000);
		driver.close();
	}
	
	@Test
	public void zomato() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.zomato.com/india");
		Thread.sleep(5000);
		driver.close();
	}

	
}
