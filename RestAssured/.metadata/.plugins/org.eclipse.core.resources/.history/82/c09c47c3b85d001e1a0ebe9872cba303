package stepDefinitions;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import static org.hamcrest.Matchers.*;
import POJO.AddPlace;
import POJO.Location;
import Resources.EndPoints;
import Resources.TestData;
import Resources.Utils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class StepDefinition extends Utils{

	RequestSpecification rs;
	Response response;
	TestData data = new TestData();
	
	@Given("Add Place Payload with {string} {string} {string}")
	public void add_place_payload_with(String name, String language, String address) throws IOException {
		
		 rs = given().log().all().spec(requestSpecification())
		.body(data.addPlacePayload(name,language,address));
	}
	@When("user calls {string} with {string} http request")
	public void user_calls_with_http_request(String endpoint, String httpmethod) {
	    
		
		EndPoints e = EndPoints.valueOf(endpoint);
		
		if(httpmethod.equalsIgnoreCase("POST"))
		response = rs.when().post(e.getResource());
		else if(httpmethod.equalsIgnoreCase("GET"))
		response = rs.when().get(e.getResource());
		//.then().log().all().spec(responseSpecification()).extract().response();
	}
	@Then("the API call got success with status code {int}")
	public void the_api_call_got_success_with_status_code(Integer int1) {
	   
		response = response.then().log().all().spec(responseSpecification()).extract().response();
		assertEquals(response.getStatusCode(),200);
	  
	}
	@Then("{string} in response body is {string}")
	public void in_response_body_is(String Key, String Value) {
		
	 assertEquals(getKeyValue(response,Key),Value);
		
	}
	
	@Then("verify {string} with placeID using {string}")
	public void verify_with_place_id_using(String name, String httpmethod) throws IOException {
	    
		String place_id = getKeyValue(response,"place_id");
		given().spec(requestSpecification()).queryParam("place_id", place_id);
		
	}
	
	
}
