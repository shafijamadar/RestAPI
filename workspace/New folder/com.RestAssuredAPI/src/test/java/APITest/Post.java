package APITest;

import static com.jayway.restassured.RestAssured.given;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import Utility.Execute;
import Utility.Request;

import Utility.TokenGeneration;

public class Post {
	
	TokenGeneration tkn;
	Request req;
	Response resp;
	Execute exe;
	String URL;
	
	@BeforeMethod
	public void setUp(){
		
		tkn = new TokenGeneration();
		
		req = new Request();
		req.setAPIName("roundTemplates/");
		req.setActionVerb("Post");
		req.setProtocolType("http://");
		req.setSecurityToken(tkn.getToken());
		req.setURL("southseasgaming.microgaming.com/CasinoTournaments/api/");
		
		
		URL = req.getProtocolType() + req.getURL() + req.getAPIName();
		
		System.out.println(URL);
	}
	
	@Test
	public void PostTest(){
		
		resp = 	given().header("Authorization", req.getSecurityToken()).body("").
				when().contentType(ContentType.JSON).post(URL);
		
	
		
		System.out.println(resp.asString());
		
	}
}


