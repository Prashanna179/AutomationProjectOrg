package Resources;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Utils {

	public static RequestSpecification requestSpec;
	public RequestSpecification requestSpecification() throws IOException
	{
		if(requestSpec==null)
		{	
		PrintStream log = new PrintStream(new FileOutputStream("logging.txt"));
		RequestSpecBuilder a = new RequestSpecBuilder();
		requestSpec = a.setBaseUri(getGlobalValue("baseUrl")).setContentType(ContentType.JSON).addQueryParam("key","qaclick123")
		.addFilter(RequestLoggingFilter.logRequestTo(log))
		.addFilter(ResponseLoggingFilter.logResponseTo(log)).build();
		
		return requestSpec;
		}
		return requestSpec;
	}
	
	public ResponseSpecification responseSpecification()
	{
		ResponseSpecBuilder b = new ResponseSpecBuilder();
		ResponseSpecification responseSpec = b.expectStatusCode(200).expectContentType(ContentType.JSON).
					  build();
		return responseSpec;
	}
	
	public static String getGlobalValue(String key) throws IOException
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\Resources\\config.properties");
		prop.load(fis);
		return prop.getProperty(key);
	}

	public String getKeyValue(Response response, String key)
	{
		JsonPath js = new JsonPath(response.toString());
		return js.getString(key);
	}
}

