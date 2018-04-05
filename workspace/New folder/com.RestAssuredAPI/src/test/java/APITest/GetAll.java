package APITest;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static com.jayway.restassured.RestAssured.*;

import java.util.Hashtable;

import com.jayway.jsonpath.*;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import Utility.Execute;
import Utility.Request;

import Utility.TokenGeneration;

public class GetAll {

	
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
		req.setActionVerb("Get");
		req.setProtocolType("http://");
		req.setSecurityToken(tkn.getToken());
		req.setURL("southseasgaming.microgaming.com/CasinoTournaments/api/");
		req.setRowStart("0");
		req.setRowCount("30"); 		
		URL = req.getProtocolType() + req.getURL() + req.getAPIName();
		
		System.out.println(URL);
	}
	
	@Test
	public void getAll(){
			
		resp = given().header("Authorization", req.getSecurityToken()).
				when().
				param("rowStart", req.getRowStart()).
				param("rowCount", req.getRowCount()).
				then().get(URL);
			
		System.out.println("Responce data is " +resp.asString());
				
	}
}