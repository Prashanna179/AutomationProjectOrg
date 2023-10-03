package Interview;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class BrokenLinks {

	public static void main(String args[]) throws IOException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nba.com/warriors");
		driver.manage().window().maximize();
		
	    List<WebElement> l = driver.findElements(By.xpath("//a[contains(@href,'https:')]"));
	
		l.stream().map(s->s.getAttribute("href")).filter(s->s.length()>0).forEach(s->{
			try
			{
			URL u = new URL(s);
			HttpURLConnection conn =(HttpURLConnection)u.openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
		    if(conn.getResponseCode()>400)
		    {
			System.out.println(s + "is a broken link");
		    }
			}
			catch(Exception e)
			{
				System.out.println(e + "url");
			}
		});	
		
		
	}
}
