package publicAPI;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Tests_Post {
	
	@Test
	public void test_1_post()
	{
//		Map<String,Object> map = new HashMap<String,Object>();
//		map.put("name","Utkarsh");
//		map.put("job","Qualitest");
//		System.out.println(map);
		
//		JSONObject obj = new JSONObject(map);
//		System.out.println(obj);
		
		
		JSONObject request = new JSONObject();
		request.put("name", "Utkarsh");
		request.put("job","Qualitest");
		System.out.println(request);
//		System.out.println(request.toJSONString());
		
		
		given().
		body(request.toJSONString()).
		when().
		post("https://reqres.in/api/users").
		then().
		statusCode(201).log().all();
		
		
		
	}

}
