package publicAPI;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class Tests_DELETE {

	@Test
	public void test_put() {

		given().delete("https://reqres.in/api/users/2").then().statusCode(204).log().all();

	}

}
