package com.scobolsolo.matches;

public enum MatchStatus {
	NO_DATA("No data", "Coming up", 25, false, false),
	ONE_PLAYER_KNOWN("One incoming player known", "Coming up", 50, false, false),
	READY("Ready for entry", "Coming up", 100, true, false),
	IN_PROGRESS("In progress", "In progress", -50, true, false),
	COMPLETE("Complete", "Complete", 0, true, true);
	
	private final String myName;
	private final String myPublicFacingName;
	private final int myPriority;
	private final boolean myMayEnterData;
	private final boolean myHasResults;
	
	private MatchStatus(final String argName, final String argPublicFacingName, final int argPriority, final boolean argMayEnterData, final boolean argHasResults) {
		myName = argName;
		myPublicFacingName = argPublicFacingName;
		myPriority = argPriority;
		myMayEnterData = argMayEnterData;
		myHasResults = argHasResults;
	}
	
	@Override
	public String toString() {
		return myName;
	}
	
	public String getPublicFacingName() {
		return myPublicFacingName;
	}
	
	public int getPriority() {
		return myPriority;
	}
	
	public boolean mayEnterData() {
		return myMayEnterData;
	}
	
	public boolean hasResults() {
		return myHasResults;
	}
}
