package ownAPI;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class OwnAPI {
//	@Test
	public void test_get()
	{
		baseURI="http://localhost:3000/";
		given().
			param("name","Automation"). // http://localhost:3000/subjects?name=Automation
				get("/subjects").
		then().
			statusCode(200).
		log().all();
		
	}
	
//	@Test
	public void test_post()
	{
		JSONObject request = new JSONObject();
		request.put("firstName","Utkarsh");
		request.put("lastName", "Gupta");
		request.put("subjectId", 1);
		
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
	
//	@Test
	public void test_patch()
	{
		JSONObject request = new JSONObject();
		request.put("lastName", "Shepherd");
		
		
		baseURI="http://localhost:3000/";
		
		given().
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
			header("Content-Type","application/json").
			body(request.toJSONString()).
		when().
			patch("/users/4").
		then().
			statusCode(200).
			log().all();
			

	}
	
//	@Test
	public void test_put()
	{
		JSONObject request = new JSONObject();
		
		request.put("firstName","Mary");
		request.put("lastName", "Jane");
		request.put("subjectId", 2);
		
		
		
		baseURI="http://localhost:3000/";
		
		given().
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
			header("Content-Type","application/json").
			body(request.toJSONString()).
		when().
			put("/users/4").
		then().
			statusCode(200).
			log().all();
			

	}
	
	@Test
	public void test_delete()
	{
		baseURI="http://localhost:3000/";
		when().delete("/users/5").then().statusCode(200);
	}
	
}
