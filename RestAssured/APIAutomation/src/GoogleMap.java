import io.restassured.RestAssured;
import io.restassured.filter.session.SessionFilter;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.testng.Assert;

import	Base.Payload;
import Base.ReusableMethods;

public class GoogleMap {

	public static void main(String[] args) throws IOException {
		
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		
		/*********Add Place**************/

		
		 String key = "qaclick123";
	     String responseBody = 

		 given().log().all().queryParam("key",key).header("Content-type","application/json").body(Payload.AddPlace())
		 
		.when().post("maps/api/place/add/json")
		
		.then().log().all().assertThat().statusCode(200).body("scope",equalTo("APP"))
		.header("Server", "Apache/2.4.52 (Ubuntu)").extract().response().asString();
		
		JsonPath js = ReusableMethods.rawtoJson(responseBody);
		String placeID = js.get("place_id");
		
		/**********Update Place************/
		
		given().log().all().queryParam("key","qaclick123").body(Payload.UpdatePlace(placeID))
		
		.when().put("maps/api/place/update/json")
		
		.then().log().all().assertThat().statusCode(200).body("msg", equalTo("Address successfully updated"));
	
		/*********Get Place*********/
		
		 String newplace = "Chennai";
		
		 String responseBody1 = given().log().all().queryParam("key","qaclick123").queryParam("place_id", placeID)
		
		.when().get("maps/api/place/get/json")
		
		.then().log().all().assertThat().statusCode(200).extract().response().asString();
	
		JsonPath js1 = ReusableMethods.rawtoJson(responseBody1);
		String actualAddress = js1.getString("address");
		
		System.out.println(actualAddress);
	
		Assert.assertEquals(actualAddress, newplace);
		
		/**********Add Place - Json payload drive from external file*******/
		
		//Json file converted to Bytes -> Bytes converted to String
		
	     String responseBody2 = 
	    		 	
		 given().log().all().queryParam("key","qaclick123").body(new String(Files.readAllBytes(Paths.get("C:\\UserDrive\\Prashan\\RestAssured\\Payload\\AddPlace.json"))))
		 
		.when().post("maps/api/place/add/json")
		
		.then().log().all().assertThat().statusCode(200).body("scope",equalTo("APP"))
		.header("Server", "Apache/2.4.52 (Ubuntu)").extract().response().asString();
		
		JsonPath js2 = ReusableMethods.rawtoJson(responseBody2);
		String placeID2 = js2.get("place_id");
		System.out.println(placeID2);
		
		/*To get Session ID 
		SessionFilter session = new SessionFilter();
		given().filter(session)
		
		To send attachment
		given().header("Content-Type","multipart/form-data").multiPart("File",new File("demo.txt"))
		
		To handle https certificate
		given().relaxedHTTPSValidation();
		
		//Path Parameter
		//given().pathparam("key","value")
		//when().delete("       /{key}");*/
		
		
		 
	}
	
	
	

}
