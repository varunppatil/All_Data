import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static org.hamcrest.Matchers.*;

import files.Payload;

public class Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Add place in maps ....
		
		//given - queryParameter, header, body
		//when - requestType, resource(Entity)
		
		
		
		//Remove scope part from restassured pom.xml dependency 
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		String response = given().log().all().queryParam("key","qaclick123").header("Content-Type","application/json")
		.body(Payload.addPlace()).
		when().post("maps/api/place/add/json")
		.then()
		.log().all().
		assertThat().statusCode(200).body("scope", equalTo("APP"))
		.header("server","Apache/2.4.52 (Ubuntu)").extract().response().asString();
		
		//Add place - Update place with new address -> Get place to validate if present in response
		
		System.out.println(response);
		//For parsing json
		JsonPath js = new JsonPath(response);
		
		String placeId = js.getString("place_id");
		System.out.println(placeId);
		
		
		
		
		
		
	}

}
