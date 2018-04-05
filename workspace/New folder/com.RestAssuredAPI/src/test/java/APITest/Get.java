package APITest;

import static com.jayway.restassured.RestAssured.given;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import Utility.Execute;
import Utility.Request;

import Utility.TokenGeneration;

public class Get{
	
	TokenGeneration tkn;
	Request req;
	Response resp;
	Execute exe;
	String URL;
	
	@BeforeMethod
	public void setUp(){
		
		tkn = new TokenGeneration();
		
		req = new Request();
		req.setAPIName("roundTemplates/template/1");
		req.setActionVerb("Get");
		req.setProtocolType("http://");
		req.setSecurityToken(tkn.getToken());
		req.setURL("southseasgaming.microgaming.com/CasinoTournaments/api/");
		
		URL = req.getProtocolType() + req.getURL() + req.getAPIName();
		
		System.out.println(URL);
	}
	
	@Test
	public void GetTest(){
		
		resp = given().header("Authorization", req.getSecurityToken()).when().get(URL);
	
		System.out.println(resp.asString());
		
	}
}
