import org.testng.Assert;

import Base.Payload;
import Base.ReusableMethods;
import io.restassured.path.json.JsonPath;

public class ComplexJsonParse {

	public static void main(String args[])
	{
	JsonPath js = 	ReusableMethods.rawtoJson(Payload.Course());
	
	//Get Courses Count
	int courseCount = js.getInt("courses.size()");
	System.out.println(courseCount);
	
	//Print the PurchaseAmount
	
	int purchaseAmount = js.getInt("dashboard.purchaseAmount");
	System.out.println(purchaseAmount);
	
	//Print Title of first course
	
	String firstCourse = js.getString("courses[0].title");
	System.out.println(firstCourse);
	
	//Print All course titles and prices.
	
	for(int i=0;i<courseCount;i++)
	{
		System.out.println(js.getString("courses["+i+"].title")); 
		System.out.println(js.getInt("courses["+i+"].price"));	
	}
	
	//print no of copies present in Cypress
	
	for(int i=0;i<courseCount;i++)
	{
		if(js.getString("courses["+i+"].title").equalsIgnoreCase("Cypress"))
		{
			System.out.println(js.getInt("courses["+i+"].copies")); 
			break;
		}
	}	
	
	//verify if sum of all course prices matches with Purchase Amount
	int sum =0;
	for(int i=0;i<courseCount;i++)
	{
		sum = sum + (js.getInt("courses["+i+"].price") * js.getInt("courses["+i+"].copies")) ;
	}	
	
	System.out.println(sum);
	
	Assert.assertEquals(purchaseAmount, sum);
	}
	
	
}
