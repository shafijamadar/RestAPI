package APITest;

import static com.jayway.restassured.RestAssured.*;
import com.jayway.jsonpath.*;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import Utility.TokenGeneration;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test01 {

	public String auth;

	Response resp;
	
	@BeforeTest
	public void setUp(){
		TokenGeneration tkn = new TokenGeneration();
		auth = "UserSession "+  tkn.getToken();
		System.out.println(auth); 
		
	
	}
	
	@Test
	public void getRoundSetup(){		

	resp = given().header("Authorisation" , auth).
			when().param("rowStart", "0").param("rowcount", "30").then().
			get("http://southseasgaming.microgaming.com/CasinoTournaments/api/roundTemplates");
	
	//	Assert.assertEquals(resp.getStatusCode() == 200, true);
		System.out.println(resp.statusCode());
		System.out.println(resp.contentType());
		System.out.println(resp.asString());
		

//	String getJson = resp.then().contentType(ContentType.JSON).extract().path("sessionToken");
	
	
	System.out.println("Json Data is " +resp.asString());
	}
}
