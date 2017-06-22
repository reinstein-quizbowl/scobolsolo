package com.scobolsolo.menu;

import org.apache.commons.lang3.Validate;

import com.scobolsolo.application.Account;

public class Separator extends MenuItem {
	private static final Separator ourInstance = new Separator(DisplayDeterminer.Always);
	
	public static Separator getInstance() {
		return ourInstance;
	}
	
	protected Separator(final DisplayDeterminer argDD) {
		super("separator", "", argDD);
	}
	
	@Override
	public boolean isHighlighted(final String argCurrentPageName) {
		return false;
		// This suggests that we could introduce a new class, HighlightableMenuItem, that extends MenuItem and is extended by MenuPage and Menu. Doesn't seem worthwhile right now, though.
	}
	
	@Override
	protected String outputInitial(final Account argUser, final String argCurrentPageName) {
		return "";
	}
	
	@Override
	protected String outputInternal(final Account argUser, final String argCurrentPageName) {
		return "<li class=\"divider\"></li>";
	}
	
	@Override
	protected String outputFinal(final Account argUser, final String argCurrentPageName) {
		return "";
	}
	
	public static Separator displayIf(final DisplayDeterminer argDD) {
		return new Separator(argDD);
	}
}
