package com.scobolsolo.menu;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang3.Validate;

import com.scobolsolo.application.Account;

public class Menu extends MenuItem {
	private final String myUrl;
	private final List<MenuItem> myItems;
	private TopLevelMenu myTopLevelInstance = null; // will be lazily initialized
	
	public Menu(final String argName, final String argUrl, final String argTitle, final List<MenuItem> argItems, final DisplayDeterminer argDD) {
		super(argName, argTitle, argDD);
		
		myUrl = argUrl; // may be null
		myItems = Validate.notEmpty(argItems);
	}
	
	public Menu(final String argName, final String argTitle, final List<MenuItem> argItems, final DisplayDeterminer argDD) {
		this(argName, null, argTitle, argItems, argDD);
	}
	
	public Menu(final String argName, final String argUrl, final String argTitle, final List<MenuItem> argItems) {
		this(argName, argUrl, argTitle, argItems, DisplayDeterminer.Always);
	}
	
	public Menu(final String argName, final String argTitle, final List<MenuItem> argItems) {
		this(argName, argTitle, argItems, DisplayDeterminer.Always);
	}
	
	// For renaming a Menu, basically
	public Menu(final String argName, final String argTitle, final Menu argBase) {
		this(argName, argTitle, argBase.getItems(), argBase.getDisplayDeterminer());
	}
	
	// For renaming a Menu, basically
	public Menu(final String argName, final String argTitle, final Menu argBase, final DisplayDeterminer argDD) {
		this(argName, argTitle, argBase.getItems(), argDD);
	}
	
	public boolean hasUrl() {
		return myUrl != null;
	}
	
	public String getUrl() {
		return myUrl;
	}
	
	public List<MenuItem> getItems() {
		return Collections.unmodifiableList(myItems);
	}
	
	public TopLevelMenu asTopLevel() {
		if (myTopLevelInstance == null) {
			myTopLevelInstance = new TopLevelMenu(this);
		}
		
		return myTopLevelInstance;
	}
	
	// A Menu is highlighted if it specifically is active, or any of its items is active
	@Override
	public boolean isHighlighted(final String argCurrentPageName) {
		if (argCurrentPageName == null) {
			return false;
		}
		
		if (getName().equalsIgnoreCase(argCurrentPageName)) {
			return true;
		} else {
			return getItems().stream().anyMatch(argI -> argI.isHighlighted(argCurrentPageName));
		}
	}
	
	@Override
	protected String outputInitial(final Account argUser, final String argCurrentPageName) {
		return
			"					<li class=\"has-submenu\">\n" +
			"						<a href=\"#\">" + getTitle() + "</a>\n" +
			"							<ul class=\"submenu menu vertical\">\n";
	}
	
	@Override
	protected String outputInternal(final Account argUser, final String argCurrentPageName) {
		return getItems().stream()
			.map(argMI -> "\t\t\t\t\t\t\t\t" + argMI.output(argUser, argCurrentPageName))
			.collect(Collectors.joining("\n"));
	}
	
	@Override
	protected String outputFinal(final Account argUser, final String argCurrentPageName) {
		return
			"			</ul>\n" + // menu vertical
			"		</li>\n";
	}
}
