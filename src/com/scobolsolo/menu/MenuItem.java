package com.scobolsolo.menu;

import org.apache.commons.lang3.Validate;

import com.scobolsolo.application.Account;

public abstract class MenuItem {
	private final String myName;
	private final String myTitle;
	private final DisplayDeterminer myDisplayDeterminer;
	
	protected MenuItem(final String argName, final String argTitle, final DisplayDeterminer argDD) {
		super();
		
		myName = Validate.notNull(argName);
		myTitle = Validate.notNull(argTitle);
		myDisplayDeterminer = Validate.notNull(argDD);
	}
	
	protected MenuItem(final String argName, final String argTitle) {
		this(argName, argTitle, DisplayDeterminer.Always);
	}
	
	public String getName() {
		return myName;
	}
	
	public String getTitle() {
		return myTitle;
	}
	
	protected DisplayDeterminer getDisplayDeterminer() {
		return myDisplayDeterminer;
	}
	
	public boolean display(final Account argUser) {
		return getDisplayDeterminer().display(argUser);
	}
	
	public abstract boolean isHighlighted(final String argCurrentPageName);
	
	public String output(final Account argUser, final String argCurrentPageName) {
		return output(Menus.getDefaultMenuType(), argUser, argCurrentPageName);
	}
	
	public abstract String output(final MenuType argMT, final Account argUser, final String argCurrentPageName);
}
