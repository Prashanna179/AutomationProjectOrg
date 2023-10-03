import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

import java.util.ArrayList;
import java.util.List;

import POJO.AddPlace;
import POJO.Location;

public class Serialization {

	public static void main(String[] args) {
		
		RestAssured.baseURI = "https://rahulshettyacademy.com";
	
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
		
		ArrayList<String> ls = new ArrayList<String>();
		ls.add("shoe park");
		ls.add("shop");
		a.setTypes(ls);
		
		given().log().all().queryParam("key", "qaclick123").header("Content-type","application/json")
		.body(a)
		.when().post("/maps/api/place/add/json")
		.then().log().all().assertThat().statusCode(200);
		
		

	}

}
