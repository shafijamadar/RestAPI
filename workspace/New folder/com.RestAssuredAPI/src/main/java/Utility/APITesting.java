package Utility;

import com.jayway.restassured.response.Response;

import Classes.RoundSetup;

public class APITesting {
	
	public String URL;
	Response resp;
	
	public boolean GetAllRoundSetup(){
		{
			boolean getAllRoundTemplates = false;
			try {
				Request request = new Request();
				request.setAPIName("Get All Round Template");
				request.setAPIName("roundTemplates/");
				request.setActionVerb("Get");
				request.setProtocolType("http://");
				request.setSecurityToken(TokenGeneration.getToken());
				request.setURL("southseasgaming.microgaming.com/CasinoTournaments/api/");
				request.setRowStart("0");
				request.setRowCount("30"); 		
				URL = request.getProtocolType() + request.getURL() + request.getAPIName();
				
				System.out.println(URL);
				
				Execute exe = new Execute(request, request.getActionVerb(), URL);
				
				getAllRoundTemplates = true;
				
			}catch(Exception e){
				e.printStackTrace();
			}
		
		return getAllRoundTemplates;
	}
	}
		public Execute GetRoundSetup(RoundSetup roundSetup){
			
					Request request = new Request();
					request.setAPIName("Get Round Template");
					request.setAPIName("roundTemplates/template/1");
					request.setActionVerb("Get");
					request.setProtocolType("http://");
					request.setSecurityToken(TokenGeneration.getToken());
					request.setURL("southseasgaming.microgaming.com/CasinoTournaments/api/");
					 		
					URL = request.getProtocolType() + request.getURL() + request.getAPIName();
					
					System.out.println(URL);
					
					return new Execute(request, request.getActionVerb(), URL);
	}

}
