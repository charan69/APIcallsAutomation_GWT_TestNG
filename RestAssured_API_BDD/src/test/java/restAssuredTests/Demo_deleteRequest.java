package restAssuredTests;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import static org.hamcrest.Matchers.*;

public class Demo_deleteRequest {

	@Test
	public void deleteTest() {
		RestAssured.baseURI="https://reqres.in/api/users/2";
		String res =
		given().
		when().delete().
		then().statusCode(204).and()
		.assertThat().statusLine("HTTP/1.1 204 No Content").and()
		.log().all()
		.extract().response().asPrettyString();
		
		System.out.println("Response is " +res);
		
		
	}

}
