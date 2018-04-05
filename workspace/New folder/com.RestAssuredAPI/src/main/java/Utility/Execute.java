package Utility;

import static com.jayway.restassured.RestAssured.*;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import com.jayway.jsonpath.*;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class Execute {
	
	Response resp;
	Request request;
	String ActionVerb;
	String URL;
	

	public Execute(Request request, String URL, String ActionVerb) {
		this.request = request;
		this.ActionVerb = ActionVerb;
		this.URL = URL;
	}

	public Response getRespone(){
		
		try {
		if(ActionVerb.equalsIgnoreCase("get")){
			
			resp = given().header("Authorization", request.getSecurityToken()).when().get(URL);
			return resp;
		}else if(ActionVerb.equalsIgnoreCase("GetALL")){
			resp = given().header("Authorization", request.getSecurityToken()).
					when().
					param("rowStart", request.getRowStart()).
					param("rowCount", request.getRowCount()).
					then().get(URL);
			return resp;
		}else if(ActionVerb.equalsIgnoreCase("Post")){
			resp = 	given().header("Authorization", request.getSecurityToken()).body("").
					when().contentType(ContentType.JSON).post(URL);
			return resp;
		}else if(ActionVerb.equalsIgnoreCase("Put")){
			resp = 	given().header("Authorization", request.getSecurityToken()).body("").
					when().contentType(ContentType.JSON).post(URL);
			return resp;
			
		}else if(ActionVerb.equalsIgnoreCase("Delete")){
			
		}		
		}catch(Exception e){
			e.printStackTrace();
		}
		return resp;
	}
	/*
	public String APIName;
	public String Method;
	public String URL;
	public String ProtocolType;
	public String ActionVerb;
	public String SecurityToken;
	
	public String execute(){
		
		
		
		
		return null;
		
		
		
		Request req = new Request();
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add(req.getAPIName());
		list.add(req.getSecurityToken());
		list.add(req.getURL());
		
		return list;
		
		
		
	//	List<String> list = new ArrayList<String>();
		
	//	list.add(req.getAPIName());
		
		Hashtable<String, String> table = new Hashtable<String, String>();
		
		
		APIName = table.put(APIName, req.getAPIName());
		Method = table.put(Method, req.getMethod());
		ProtocolType = table.put(ProtocolType, req.getProtocolType());
		URL = table.put(URL, req.getURL());
		SecurityToken = table.put(SecurityToken, req.getSecurityToken());
		ActionVerb = table.put(ActionVerb, req.getActionVerb());
		
		
		return table;
	
	}
	

	public String URI;
	TokenGeneration Token;
//	Request request;
	

	TokenGeneration tkn = new TokenGeneration();
	
	Request reqt = new Request();
	
	
		
	
	public RequestExecution(Request request, String URI, TokenGeneration tkn){
		request = request;
		this.URI = URI;
		Token = tkn;	
	}
	
	public Request execute(){
		
		if(request.equals("get"))		
			
		return request;
		return request;
		
	}

	private String getRequest() {
		
		given().header("Authorization", tkn.getToken()).
		then().get(request.getURL());
			
		return null;
	}*/
}
