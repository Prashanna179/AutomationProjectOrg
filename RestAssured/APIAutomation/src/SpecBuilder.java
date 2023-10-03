import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static org.hamcrest.Matchers.*;

import static io.restassured.RestAssured.*;

import java.util.ArrayList;
import java.util.List;

import POJO.AddPlace;
import POJO.Location;

public class SpecBuilder {

	public static void main(String[] args) {
	
		AddPlace a = new AddPlace();
		a.setAccuracy(50);
		a.setName("Adtiya Bhavan");
		a.setPhone_name("8012718790");
		a.setAddress("Elim Nagar 3rd Cross Street");
		a.setWebsite("google.com");
		a.setLanguage("English");
		
		Location l = new Location();
		l.setLat(30);
		l.setLng(50);
		a.setLocation(l);
		
		List<String> ls = new ArrayList<String>();
		ls.add("shoe park");
		ls.add("shop");
		a.setTypes(ls);
		
		RequestSpecBuilder reqb = new RequestSpecBuilder();
		RequestSpecification reqs = reqb.setBaseUri("https://rahulshettyacademy.com").setContentType(ContentType.JSON).addQueryParam("key","qaclick123")
		.build();
		
		ResponseSpecBuilder resb = new ResponseSpecBuilder();
		ResponseSpecification ress = resb.expectStatusCode(200).expectContentType(ContentType.JSON)
								   .expectBody("status", equalTo("OK")).build();
		
		
		
		
		String output = given().log().all().spec(reqs)
		.body(a)
		.when().post("/maps/api/place/add/json")
		.then().log().all().spec(ress).extract().response().asString();
		
		System.out.println(output);
		
		

	}

}
