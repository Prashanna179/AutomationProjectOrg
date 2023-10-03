package Resources;

import java.util.ArrayList;
import java.util.List;

import POJO.AddPlace;
import POJO.Location;

public class TestData {

	public AddPlace addPlacePayload(String name , String language , String address)
	{
		AddPlace a = new AddPlace();
		a.setAccuracy(50);
		a.setName(name);
		a.setPhone_name("8012718790");
		a.setAddress(address);
		a.setWebsite("google.com");
		a.setLanguage(language);
		
		Location l = new Location();
		l.setLat(30);
		l.setLng(50);
		a.setLocation(l);
		
		List<String> ls = new ArrayList<String>();
		ls.add("shoe park");
		ls.add("shop");
		a.setTypes(ls);
		
		return a;
	}
}
