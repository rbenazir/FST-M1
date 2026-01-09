import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

import static org.hamcrest.CoreMatchers.equalTo;

import java.util.HashMap;

import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Activity1 {
  @Test(priority=1)
  public void addNewPet() {
	  Map<String,Object> reqBody=new HashMap<>();
	  reqBody.put("id", 77232);
	  reqBody.put("name", "Rai");
	  reqBody.put("status", "alive");
	  Response response=given().baseUri("https://petstore.swagger.io/v2/pet")
			  .header("Content-Type","application/json")
			  .body(reqBody)
			  .when()
			  .post();
	  response.prettyPrint();
	  response.then().body("id", equalTo(77232));
	  response.then().body("name", equalTo("Rai"));
	  response.then().body("status", equalTo("alive"));
  }
 
  @Test(priority=2)
  public void getPetInfo() {
	  Response response=given().baseUri("https://petstore.swagger.io/v2/pet")
			  .header("Content-Type", "application/json")
			  .when()
			  .pathParam("petId", 77232)
			  .get("/{petId}");
	  response.then().body("id", equalTo(77232));
	  response.then().body("name", equalTo("Rai"));
	  response.then().body("status", equalTo("alive"));
	  response.prettyPrint();
  }
  
  @Test(priority=3)
  public void deletePetInfo() {
	  Response response=given().baseUri("https://petstore.swagger.io/v2/pet")
			  .header("Content-Type","application/json")
			  .when()
			  .pathParam("petId",77232)
			  .delete("/{petId}");
	  response.then().body("code",equalTo(200));
	  response.then().body("message",equalTo("77232"));
  }
}
