package com.scobolsolo.matches;

public enum MatchStatus {
	READY("Ready for entry", "Coming up"),
	ONE_PLAYER_KNOWN("One incoming player known", "Coming up"),
	NO_DATA("No data", "Coming up"),
	COMPLETE("Complete", "Complete"),
	IN_PROGRESS("In progress", "In progress");
	
	private final String myName;
	private final String myPublicFacingName;
	
	private MatchStatus(final String argName, final String argPublicFacingName) {
		myName = argName;
		myPublicFacingName = argPublicFacingName;
	}
	
	@Override
	public String toString() {
		return myName;
	}
	
	public String getPublicFacingName() {
		return myPublicFacingName;
	}
	
	public boolean mayEnterData() {
		return this == READY || this == COMPLETE || this == IN_PROGRESS;
	}
	
	public boolean hasResults() {
		return this == COMPLETE;
	}
	
	public boolean areAllPlayersKnown() {
		return this == READY || this == COMPLETE || this == IN_PROGRESS;
	}
}
