import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static org.hamcrest.Matchers.*;

import org.testng.Assert;

import files.Payload;
import files.ReUsableMethods;

public class Basics {

	public static void main(String[] args) {	
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
		.header("server",equalTo("Apache/2.4.52 (Ubuntu)")).extract().response().asString();
		//Add place - Update place with new address -> Get place to validate if present in response		
		System.out.println(response);
		//For parsing json
		JsonPath js = new JsonPath(response);	
		String placeId = js.getString("place_id");
		System.out.println(placeId);
		System.out.println("-----------------------------------------------------------");
		
		String address = "Address Check";
		given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
		.body("{\r\n"
				+ "    \"place_id\": \""+placeId+"\",\r\n"
				+ "    \"address\": \"new address\",\r\n"
				+ "    \"key\": \"qaclick123\"\r\n"
				+ "}").
		when().log().all().put("maps/api/place/update/json")
		.then().assertThat().statusCode(200).body("msg", equalTo("Address successfully updated"));
		
		given().queryParam("key", "qaclick123").header("Content-Type", "application/json")
		.body("{\r\n"
				+ "    \"place_id\": \""+placeId+"\",\r\n"
				+ "    \"address\": \""+address+"\",\r\n"
				+ "    \"key\": \"qaclick123\"\r\n"
				+ "}").
		when().log().all().put("maps/api/place/update/json")
		.then().assertThat().statusCode(200).body("msg", equalTo("Address successfully updated"));
		
		System.out.println("-------------------------------------------------------------------");
		
		String getPlaceResponse = given().log().all().queryParam("key", "qaclick123")
		.queryParam("place_id", placeId)
		.when().get("maps/api/place/get/json")
		.then().assertThat().statusCode(200).extract().response().asString();
		
		
		//JsonPath js1 = new JsonPath(getPlaceResponse);
		JsonPath js1 = ReUsableMethods.rawToJson(getPlaceResponse);
		String responseAddress = js1.getString("address");
		
		if(responseAddress.equals(address)) {
			Assert.assertEquals(responseAddress, address, "Both are equal");
			System.out.println("Address is matching");
		}
		
		
		
	}

}
