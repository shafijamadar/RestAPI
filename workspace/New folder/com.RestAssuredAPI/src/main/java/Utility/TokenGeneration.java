package Utility;

import static com.jayway.restassured.RestAssured.given;
import com.jayway.restassured.http.ContentType;

public class TokenGeneration {

	public static String getToken(){

		String token = given().
				param("loginname", "mohammeds@ssg.com").param("password","test").
				when().
				post("http://southseasgaming.microgaming.com/Framework/api/Security/Login").
				then().
				contentType(ContentType.JSON).extract().path("sessionToken");

		token = "UserSession "+  token; 
		return token;
	}
}
