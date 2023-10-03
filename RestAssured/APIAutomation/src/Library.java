import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Base.Payload;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;


public class Library {

	@Test(dataProvider = "BooksData")
	public void addBook(String isbn , String aisle)
	{
		String response =  RestAssured.baseURI="http://216.10.245.166";
		given().log().all().header("Content-type","application/json").body(Payload.addBook(isbn,aisle))
		.when().post("/Library/Addbook.php")
		.then().log().all().assertThat().statusCode(200).extract().response().asString();
		
		JsonPath js = new JsonPath(response);
		String s = js.get("ID");
		System.out.println(s);
	}
	
	@DataProvider(name = "BooksData")
	public Object[][] getData()
	{
		Object o[][]= {{"abc5","1235"},{"def5","4565"},{"ghi5","7895"}};
		return o;
	}
	
	
}
