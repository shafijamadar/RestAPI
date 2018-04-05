package Classes;

import java.util.ArrayList;
import java.util.List;

public class RoundSetup {

	private String RoundSetupName;
	private String gameTypeID; 
	private String allowAddOns;
	private String allowRebuys;
	private Round[] roundinfo;
	
	private List<Round> rounds;
	
	public String getRoundSetupName() {
		return RoundSetupName;
	}
	
	public void setRoundSetupName(String roundSetupName) {
		RoundSetupName = roundSetupName;
	}
	
	public List<Round> getRounds() {
		return rounds;
	}
	
	public void setRounds(List<Round> rounds) {
		this.rounds = rounds;
	}
	
	public String getGameTypeID() {
		return gameTypeID;
	}
	
	public void setGameTypeID(String gameTypeID) {
		this.gameTypeID = gameTypeID;
	}
	
	public String getAllowAddOns() {
		return allowAddOns;
	}
	
	public void setAllowAddOns(String allowAddOns) {
		this.allowAddOns = allowAddOns;
	}
	
	public String getAllowRebuys() {
		return allowRebuys;
	}
	
	public void setAllowRebuys(String allowRebuys) {
		this.allowRebuys = allowRebuys;
	}
	
	public Round[] getRoundinfo() {
		return roundinfo;
	}
	
	public void setRoundinfo(Round[] roundinfo) {
		this.roundinfo = roundinfo;
	}	
}