import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\UserDrive\\Prashan\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		/*driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption1")).click();
		Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
		Thread.sleep(3000);
		driver.findElement(By.id("checkBoxOption1")).click();
		Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());
		
		
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox' and contains(@name,'checkBoxOption')]")).size());*/
	
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.name("name")).sendKeys("Prashanna");
		driver.findElement(By.name("email")).sendKeys("prashannarg@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Prashan");
		driver.findElement(By.id("exampleCheck1")).click();
		
		//Select dropdown = new Select(driver.findElement(By.id("exampleFormControlSelect1")));
		//dropdown.selectByVisibleText("Male");
		
		driver.findElement(By.id("exampleFormControlSelect1")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[text()='Female']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("inlineRadio2")).click();
		driver.findElement(By.name("bday")).sendKeys("02/24/2023");
		
		driver.findElement(By.xpath("//*[@value='Submit']")).click();
		
		System.out.println(driver.findElement(By.xpath("//*[@class='alert alert-success alert-dismissible']")).getText());
		
		Assert.assertEquals(driver.findElement(By.xpath("//*[@class='alert alert-success alert-dismissible']//strong")).getText(),"Success!");
		
		}
	}
