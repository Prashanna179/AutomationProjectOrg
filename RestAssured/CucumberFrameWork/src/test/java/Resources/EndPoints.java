package Resources;

public enum EndPoints {

	//Enum is a special class has a collection of constants or methods.
	addPlaceAPI("/maps/api/place/add/json"),
	getPlaceAPI("/maps/api/place/update/json"),
	deletePlaceAPI("/maps/api/place/delete/json");
	private String resource;
	
	EndPoints(String resource)
	{
		this.resource=resource;
	}
	
	public String getResource()
	{
		return resource;
	}
	
}
