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
	public String output(final MenuType argMT, final Account argUser, @SuppressWarnings("unused") final String argCurrentPageName) {
		Validate.notNull(argMT);
		// argUser and argCurrentPageName may be null.
		
		if (display(argUser)) {
			switch (argMT) {
				case BOOTSTRAP:
				case FOUNDATION: // yep, they're the same
					return "<li class=\"divider\"></li>";
				default:
					throw new MenuType.UnknownMenuTypeException(argMT);
			}
		} else {
			return "";
		}
	}
	
	public static Separator displayIf(final DisplayDeterminer argDD) {
		return new Separator(argDD);
	}
}
