package restAssuredTests;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
public class Demo_GetReq_validations {
	
	@Test
	public void validate_getRequests() {
		
		RestAssured.baseURI="https://reqres.in/api/users?page=2";
		String res =
		given()
		.when().get().
		then().statusCode(200).and().extract().asString();
		
		
		System.out.println("Response is " +res);
		//Reading the jsonobject directly 
		JSONObject json = new JSONObject(res);
		int total_pages = json.getInt("total_pages");
		System.out.println("Total pages are "+total_pages);
		
		//Reading a json array from jsonObject
		JSONArray jarry = json.getJSONArray("data");
		String email = jarry.getJSONObject(1).getString("email");
		System.out.println(email);
		
		//Reading a value form nested json object
		
		JSONObject json1 = json.getJSONObject("support");
		String text = json1.getString("text");
		System.out.println(text);
		
		
	}
	

}
