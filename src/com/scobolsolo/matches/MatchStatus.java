package com.scobolsolo.matches;

public enum MatchStatus {
	NO_DATA("No data", "Coming up"),
	ONE_PLAYER_KNOWN("One incoming player known", "Coming up"),
	READY("Ready for entry", "Coming up"),
	IN_PROGRESS("In progress", "In progress"),
	COMPLETE("Complete", "Complete");
	
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
