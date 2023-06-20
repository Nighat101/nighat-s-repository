package projects.partfive.regresin;

import static io.restassured.RestAssured.*;
import java.io.File;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class APITest {

	public static void main(String[] args) throws Exception{
		Response in	= get("https://reqres.in/api/users?page=2");
	    in.prettyPrint();
	    
	    Thread.sleep(3000);
	    System.out.println("\n\n\n\n\n\n");
	    
	    File input = new File("C:\\Users\\Nighat Alam\\git\\Nighat-s-repository\\bootcampprojects\\src\\main\\java\\projects\\partfive\\regresin\\post.json");
	    Response out = given().contentType(ContentType.JSON).body(input).post("https://reqres.in/api/users");
	    out.prettyPrint();
	}

}
