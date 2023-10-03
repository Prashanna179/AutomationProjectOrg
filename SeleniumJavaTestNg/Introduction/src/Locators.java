import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class Locators {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		

	System.setProperty("webdriver.chrome.driver", "C:\\UserDrive\\Prashan\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	//implict wait 
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	driver.get("https://rahulshettyacademy.com/locatorspractice/");
	/*driver.findElement(By.id("inputUsername")).sendKeys("Prashanna");
	driver.findElement(By.name("inputPassword")).sendKeys("Dhivyan");
	//driver.findElement(By.className("submit signInBtn")).click();
	driver.findElement(By.xpath("//*[text()='Sign In']")).click();
	String c=driver.findElement(By.cssSelector("p[class='error']")).getText();
	System.out.println(c);
	driver.findElement(By.linkText("Forgot your password?")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("letchu");
	driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("letchu@gmail.com");
	driver.findElement(By.xpath("(//form/input)[3]")).sendKeys("8012718790");
	//driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
//	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[text()='Reset Login']")).click();
	System.out.println(driver.findElement(By.cssSelector("p.infoMsg")).getText());
	driver.findElement(By.xpath("//*[text()='Go to Login']")).click();*/
	Thread.sleep(1000);
	String d = "Letchu";
	String password=getPassword(driver);
	System.out.println(password);
	driver.findElement(By.xpath("//*[text()='Go to Login']")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("inputUsername")).sendKeys(d);
	driver.findElement(By.name("inputPassword")).sendKeys(password);
	driver.findElement(By.name("chkboxTwo")).click();
	driver.findElement(By.xpath("//button[text()='Sign In']")).click();
	Thread.sleep(1000);
	
		String s = driver.findElement(By.xpath("//*[text()='You are successfully logged in.']")).getText();
		Assert.assertEquals(driver.findElement(By.xpath("//*[text()='You are successfully logged in.']")).getText(),"You are successfully logged in.");
	System.out.println(s);
	Assert.assertEquals(driver.findElement(By.tagName("h2")).getText(), "Hello "+d+",");
	/*if(s=="You are successfully logged in.");
	{
		System.out.println("True");
	}*/
	driver.close();

	}
	
	
	public static String getPassword(WebDriver driver) throws InterruptedException

	{

	//driver.get("https://rahulshettyacademy.com/locatorspractice/");
	driver.findElement(By.linkText("Forgot your password?")).click();
	Thread.sleep(1000);
	driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
	String passwordText =driver.findElement(By.cssSelector("form p")).getText();

	//Please use temporary password 'rahulshettyacademy' to Login.

	String[] passwordArray = passwordText.split("'");
	
	//0th index - Please use temporary password

	//1st index - rahulshettyacademy' to Login.

	// String[] passwordArray2 = passwordArray[1].split("'");

	// passwordArray2[0]

	String password = passwordArray[1].split("'")[0];

	// String[] passwordArray2 = passwordArray[1].split("'");

	// passwordArray2[0]
	
	//0th index - rahulshettyacademy

	//1st index - to Login.
	return password;

	


	
	}
}
