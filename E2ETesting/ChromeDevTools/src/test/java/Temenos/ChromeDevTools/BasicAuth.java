package Temenos.ChromeDevTools;

	import org.openqa.selenium.HasAuthentication;
	import org.openqa.selenium.UsernameAndPassword;
	import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.net.URI;
	import java.util.function.Predicate;

	public class BasicAuth {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			
			ChromeDriver driver = new ChromeDriver();
			//predicate, consumer
			Predicate<URI> uriPredicate =uri ->  uri.getHost().contains("httpbin.org");
			
			((HasAuthentication)driver).register(uriPredicate,UsernameAndPassword.of("foo", "bar"));
			driver.get("http://httpbin.org/basic-auth/foo/bar");
			//driver.get("http://foo:bar@httpbin.org/basic-auth/foo/bar");
			
			
			   
			
		}

	}


