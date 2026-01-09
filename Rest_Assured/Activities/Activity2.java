import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

import static org.hamcrest.CoreMatchers.equalTo;
	
import java.io.File;
	
import java.io.FileInputStream;
import java.io.FileWriter;
	
import java.io.IOException;
	
import org.testng.annotations.Test;
	
import io.restassured.response.Response;

public class Activity2 {
  @Test(priority=1)
  public void addNewUserFromFile() throws IOException {
	  FileInputStream inputJson=new FileInputStream("src/test/java/userInfo.json");
	  Response response=given().baseUri("https://petstore.swagger.io/v2/user")
			  .header("Content-Type","application/json")
			  .body(inputJson)
			  .when().post();
	  inputJson.close();
	  response.prettyPrint();
	  response.then().body("code", equalTo(200));
	  response.then().body("message", equalTo("7861"));
  }
  
  @Test(priority=2)
  public void getUserInfo() {
	  File outputJson=new File("src/test/java/userGetResponse.json");
	  Response response=given().baseUri("https://petstore.swagger.io/v2/user")
			  .header("Content-Type","application/json")
			  .pathParam("username", "raib")
			  .when()
			  .get("/{username}");
	  String responseBody=response.getBody().asPrettyString();
	  try {
		  outputJson.createNewFile();
		  FileWriter writer=new FileWriter(outputJson.getPath());
		  writer.write(responseBody);
		  writer.close();
	  }
	  catch(IOException exp) {
		  exp.printStackTrace();
	  }
		response.then().body("id", equalTo(7861));
		
		response.then().body("username", equalTo("raib"));
	
		response.then().body("firstName", equalTo("rai"));
	
		response.then().body("lastName", equalTo("khan"));
	
		response.then().body("email", equalTo("raikhan@mail.com"));
	
		response.then().body("password", equalTo("password123"));
	
		response.then().body("phone", equalTo("9812763450"));
  }
  
  @Test(priority=3)
  public void deleteUser() {
	  Response response=given().baseUri("https://petstore.swagger.io/v2/user")
			  .header("Content-Type","application/json")
			  .pathParam("username", "raib")
			  .when().delete("/{username}");
		response.then().body("code", equalTo(200));
		
		response.then().body("message", equalTo("raib"));
  }
}
