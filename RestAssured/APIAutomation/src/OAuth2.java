import static io.restassured.RestAssured.given;



import java.util.ArrayList;

import java.util.Arrays;

import java.util.List;

import POJO.API;
import POJO.GetCourse;
import io.restassured.parsing.Parser;

import io.restassured.path.json.JsonPath;

import io.restassured.response.Response;

import io.restassured.response.ResponseBody;


public class OAuth2 {



public static void main(String[] args) throws InterruptedException {

// TODO Auto-generated method stub

	//Step 1 : get Authorization code by doing manually in browser
	//https://accounts.google.com/o/oauth2/v2/auth?scope=https://www.googleapis.com/auth/userinfo.email&auth_url=https://accounts.google.com/o/oauth2/v2/auth&client_id=692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com&response_type=code&redirect_uri=https://rahulshettyacademy.com/getCourse.php
	
	String url ="https://rahulshettyacademy.com/getCourse.php?code=4%2F0Adeu5BUD6RkvA0aFF7SHOhZlFFii1MJMIFkACDwVmDQNLrOK7VuSJ_JJ0yvshOp7OYv9Vw&scope=email+https%3A%2F%2Fwww.googleapis.com%2Fauth%2Fuserinfo.email+openid&authuser=0&prompt=none";
	String partialcode=url.split("code=")[1];

	String code=partialcode.split("&scope")[0];

	System.out.println(code);

	String response =given() .urlEncodingEnabled(false)
				.queryParams("code",code)
				.queryParams("client_id", "692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com")
				.queryParams("client_secret", "erZOWM9g3UtwNRj340YYaK_W")
				.queryParams("grant_type", "authorization_code")
				.queryParams("redirect_uri", "https://rahulshettyacademy.com/getCourse.php")

            	.when().log().all()
            	.post("https://www.googleapis.com/oauth2/v4/token").asString();

	System.out.println(response);

	JsonPath jsonPath = new JsonPath(response);

    String accessToken = jsonPath.getString("access_token");

    System.out.println(accessToken);

 String r2 = given().log().all().queryParam("access_token", accessToken)
 			    .when().get("https://rahulshettyacademy.com/getCourse.php").asString();
 	JsonPath jp = new JsonPath(r2);
 	System.out.println(jp.getString("courses.api[1].courseTitle"));
 	System.out.println(jp.getString("courses.api[1].price")); 
			  	
    //PoJo Class De-serialization
    GetCourse gc =  given().queryParam("access_token", accessToken).expect().defaultParser(Parser.JSON).
    when().get("https://rahulshettyacademy.com/getCourse.php").as(GetCourse.class);
    
    System.out.println(gc.getLinkedIn());
    System.out.println(gc.getInstructor());
    List<API> api = gc.getCourses().getApi();
    for(API a:api)
    {
	  if(a.getCourseTitle().equalsIgnoreCase("SoapUI Webservices testing"))
	  {
		  a.getPrice();
	  }
    }

}

}

