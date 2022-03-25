package DataDrivenTesting;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class DataDrivenExamples1 extends DataForTests {
	
//	@Test(dataProvider = "DataForPost")
	public void test_post(String firstName , String lastName, int subjectId )
	{
		JSONObject request = new JSONObject();
		request.put("firstName",firstName);
		request.put("lastName", lastName);
		request.put("subjectId", subjectId);
		
		baseURI="http://localhost:3000/";
		
		given().
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
			header("Content-Type","application/json").
			body(request.toJSONString()).
		when().
			post("/users").
		then().
			statusCode(201).
			log().all();
		}
	
//	@Test(dataProvider = "DataForDelete")
	public void test_delete(int userid)
	{
		baseURI="http://localhost:3000/";
		when().delete("/users/"+userid).then().statusCode(200);
	}
	
	@Parameters({"userid"})
	@Test
	public void test_delete2(int userid)
	{
		System.out.println("The value of user id is "+ userid );
		
		baseURI="http://localhost:3000/";
		
		when().delete("/users/"+userid).then().statusCode(200);
	}
	
	
	
	

}
