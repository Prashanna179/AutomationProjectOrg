package Base;

public class Payload {

	public static String AddPlace()
	{
		return "{\r\n"
				+ "  \"location\": {\r\n"
				+ "    \"lat\": -38.383494,\r\n"
				+ "    \"lng\": 33.427362\r\n"
				+ "  },\r\n"
				+ "  \"accuracy\": 50,\r\n"
				+ "  \"name\": \"Frontline house\",\r\n"
				+ "  \"phone_number\": \"(+91) 983 893 3937\",\r\n"
				+ "  \"address\": \"29, side layout, cohen 09\",\r\n"
				+ "  \"types\": [\r\n"
				+ "    \"shoe park\",\r\n"
				+ "    \"shop\"\r\n"
				+ "  ],\r\n"
				+ "  \"website\": \"http://google.com\",\r\n"
				+ "  \"language\": \"French-IN\"\r\n"
				+ "}";
	}
	
	public static String UpdatePlace(String placeID)
	{
		return "{\r\n"
				+ "\"place_id\":\""+placeID+"\",\r\n"
				+ "\"address\":\"Chennai\",\r\n"
				+ "\"key\":\"qaclick123\"\r\n"
				+ "}";
	}
	
	public static String Course()
	{
		return "{\r\n"
				+ "  \"dashboard\":\r\n"
				+ "  {\r\n"
				+ "    \"purchaseAmount\":910,\r\n"
				+ "    \"website\":\"rahulshetty\"\r\n"
				+ "  },\r\n"
				+ "  \"courses\":[\r\n"
				+ "    {\r\n"
				+ "      \"title\":\"Selenium\",\r\n"
				+ "      \"price\":40,\r\n"
				+ "      \"copies\":6\r\n"
				+ "    },\r\n"
				+ "    {\r\n"
				+ "      \"title\":\"Cypress\",\r\n"
				+ "      \"price\":50,\r\n"
				+ "      \"copies\":3\r\n"
				+ "    },\r\n"
				+ "    {\r\n"
				+ "      \"title\":\"Azure\",\r\n"
				+ "      \"price\":80,\r\n"
				+ "      \"copies\":2\r\n"
				+ "    }\r\n"
				+ "  ]\r\n"
				+ "}";
		
		
	}
	
	public static String addBook(String isbn, String aisle)
	{
		return "{\r\n"
				+ "    \"name\":\"Wealth\",\r\n"
				+ "    \"isbn\":\""+isbn+"\",\r\n"
				+ "    \"aisle\":\""+aisle+"\",\r\n"
				+ "    \"author\":\"Prashanna\" \r\n"
				+ "}";
	}
	
}

