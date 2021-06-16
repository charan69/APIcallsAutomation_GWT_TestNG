package restAssuredTests;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;

public class Demo_PostRequest {

	public static Map<String, String> map = new HashMap<String,String>();
	@BeforeClass
	public void postData() {
		map.put("first_name", RestUtils.getRandomFirstName());
		map.put("last_name", RestUtils.getRandomLastName());
		//map.put("UserName", RestUtils.getRandomUserName());
		map.put("avatar", RestUtils.getRandomPassword());
		map.put("email", RestUtils.getRandomEmail());
		
		RestAssured.baseURI="https://reqres.in/api";
		RestAssured.basePath="/users";
		
	}
	
	@Test
	public void testPostData() {
		
		given().contentType("application/json").body(map).
		when().post().
		then().statusCode(201);
	}

}
