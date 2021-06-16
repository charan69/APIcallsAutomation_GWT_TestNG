package restAssuredTests;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;


public class Demo_getRequest {

	@Test(priority = 0,invocationCount = 5)
	public void getWeatherDetails()
	{
		RestAssured.baseURI="https://demoqa.com/utilities/weather/city/Hyderabad";
		
		String Res=
	given().auth().basic("df","demo").
	when().
	get().
	then()
	.statusCode(200).and()
	.statusLine("HTTP/1.1 200 OK")
	.assertThat().body("City",equalTo("Hyderabad"))
	.body("City", equalTo("Hyderabad"))
	.extract().asPrettyString();
		JSONObject json = new JSONObject(Res);
		String temp =json.get("Temperature").toString();
		System.out.println(temp);
		
		System.out.println("Response is " +Res);
	
	}
}
