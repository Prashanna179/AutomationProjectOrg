import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class StaticDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\UserDrive\\Prashan\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		/*Options o = driver.manage();
		Window w = o.window();
		w.maximize();
		*/
		
		driver.manage().window().maximize();
		
		/*dropdown with select tag.*/
		
		//WebElement staticdropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		//Select dropdown1 = new Select(staticdropdown);
		
		//or
		
		/*Select dropdown = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		
		dropdown.selectByIndex(3);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByVisibleText("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByValue("USD");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		//Dynamic Dropdown
		
		driver.findElement(By.id("divpaxinfo")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		Thread.sleep(2000);
		int i =1;
		while(i<=4)
		{
		driver.findElement(By.id("hrefIncAdt")).click();
		i++;
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

		driver.findElement(By.xpath("//a[@value='BLR']")).click();

		Thread.sleep(2000);

		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();

		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		
		Thread.sleep(3000);
		//Autosuggestive dropdown.*/
		
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//a[text()='India']")).click();
		//Thread.sleep(3000);
		//System.out.println(driver.findElement(By.id("autosuggest")).getText());
		
		List<WebElement> options = driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
	//	System.out.println(option);
		for(WebElement option : options)
		{
			
			if(option.getText().equalsIgnoreCase("India"))
					{	
					 option.click();
					 break;
					}
			String s=	option.getText();
			System.out.println(s);
			System.out.println("***");	
			
		}
		
		//CheckBox
		
		Assert.assertFalse(driver.findElement(By.xpath("//*[text()=' Senior Citizen']/..//input")).isSelected());
		driver.findElement(By.xpath("//*[text()=' Senior Citizen']/..//input")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//*[text()=' Senior Citizen']/..//input")).isSelected());
		
		System.out.println(driver.findElements(By.xpath("//*[@id='discount-checkbox']//label")).size());
		
		
		//Calendar
		
		driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//a[contains(@class,'ui-state-highlight')]")).click();
		driver.findElement(By.xpath("//a[@title='Next']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//td[@data-month='3']//a[text()='12']")).click();
		
		
		
		//Attribute Verification.
		
		System.out.println(driver.findElement(By.xpath("(//input[@name='ctl00$mainContent$view_date2']/..//span)[1]")).getAttribute("style"));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.xpath("(//input[@name='ctl00$mainContent$view_date2']/..//span)[1]")).getAttribute("style"));
		if(driver.findElement(By.xpath("(//input[@name='ctl00$mainContent$view_date2']/..//span)[1]")).getAttribute("style").contains("display: block"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertFalse(true);
			//System.out.println("False");
		}
		
		
	}
}
