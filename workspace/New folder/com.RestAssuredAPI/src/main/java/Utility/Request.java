package Utility;

public class Request {
	
	private String APIName;
	private String Method;
	private String URL;
	private String ProtocolType;
	private String ActionVerb;
	private String SecurityToken;
	private String rowStart;
	private String rowCount;
	
	public String getAPIName() {
		return APIName;
	}
	public void setAPIName(String aPIName) {
		APIName = aPIName;
	}
	public String getMethod() {
		return Method;
	}
	public void setMethod(String method) {
		Method = method;
	}
	public String getURL() {
		return URL;
	}
	public void setURL(String uRL) {
		URL = uRL;
	}
	public String getProtocolType() {
		return ProtocolType;
	}
	public void setProtocolType(String protocolType) {
		ProtocolType = protocolType;
	}
	public String getActionVerb() {
		return ActionVerb;
	}
	public void setActionVerb(String actionVerb) {
		ActionVerb = actionVerb;
	}
	public String getSecurityToken() {
		return SecurityToken;
	}
	public void setSecurityToken(String securityToken) {
		SecurityToken = securityToken;
	}
	
	public String getRowStart(){
		return rowStart;
	}
	public void setRowStart(String rowStart) {
		this.rowStart=rowStart;
	}
	
	public String getRowCount(){
		return rowCount;
	}
	public void setRowCount(String rowCount){
		this.rowCount = rowCount;
	}
}
