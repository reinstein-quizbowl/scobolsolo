package com.scobolsolo.menu;

import org.apache.commons.lang3.Validate;

import com.scobolsolo.application.Account;

public class MenuPage extends MenuItem {
	private final String myUrl;
	
	protected MenuPage(final String argName, final String argTitle, final String argUrl, final DisplayDeterminer argDD) {
		super(argName, argTitle, argDD);
		
		// argUrl may be null
		myUrl = argUrl;
	}
	
	protected MenuPage(final String argName, final String argTitle, final String argUrl) {
		this(argName, argTitle, argUrl, DisplayDeterminer.Always);
	}
	
	public String getUrl() {
		return myUrl;
	}
	
	@Override
	public boolean isHighlighted(final String argCurrentPageName) {
		if (argCurrentPageName == null) {
			return false;
		}
		
		return getName().equalsIgnoreCase(argCurrentPageName);
	}
	
	@Override
	public String output(final MenuType argMT, final Account argUser, final String argCurrentPageName) {
		Validate.notNull(argMT);
		// argUser and argCurrentPageName may be null
		
		if (display(argUser)) {
			switch (argMT) {
				case BOOTSTRAP:
				case FOUNDATION: // yep, they're the same
					final String lclUrl = getUrl() == null ? "#" : getUrl();
					
					if (isHighlighted(argCurrentPageName)) {
						return "<li class=\"active\"><a href=\"" + lclUrl + "\">" + getTitle() + "</a></li>";
					} else {
						return "<li><a href=\"" + lclUrl + "\">" + getTitle() + "</a></li>";
					}
				default:
					throw new MenuType.UnknownMenuTypeException(argMT);
			}
		} else {
			return "";
		}
	}
}
