package com.scobolsolo.menu;

import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.scobolsolo.application.Account;

public class TopLevelMenu extends Menu {
	/* package */ TopLevelMenu(final String argName, final String argTitle, final List<MenuItem> argItems, final DisplayDeterminer argDD) {
		super(argName, argTitle, argItems, argDD);
	}
	
	/* package */ TopLevelMenu(final String argName, final String argTitle, final List<MenuItem> argItems) {
		super(argName, argTitle, argItems);
	}
	
	/* package */ TopLevelMenu(final Menu argM) {
		super(argM.getName(), argM.getTitle(), argM.getItems(), argM.getDisplayDeterminer());
	}
	
	public String output(final HttpServletRequest argRequest, final String argCurrentPageName) {
		return output(Menus.getDefaultMenuType(), argRequest, argCurrentPageName);
	}
	
	public String output(final MenuType argMT, final HttpServletRequest argRequest, final String argCurrentPageName) {
		return output(argMT, Account.determineCurrent(argRequest), argCurrentPageName);
	}
}
