package com.scobolsolo.menu;

import java.util.Collections;
import java.util.List;

import org.apache.commons.lang3.Validate;

import com.scobolsolo.application.Account;

public class Menu extends MenuItem {
	private final List<MenuItem> myItems;
	private TopLevelMenu myTopLevelInstance = null; // will be lazily initialized
	
	public Menu(final String argName, final String argTitle, final List<MenuItem> argItems, final DisplayDeterminer argDD) {
		super(argName, argTitle, argDD);
		
		myItems = Validate.notEmpty(argItems);
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
			for (final MenuItem lclItem : getItems()) {
				if (lclItem.isHighlighted(argCurrentPageName)) {
					return true;
				}
			}
			
			return false;
		}
	}
	
	@Override
	public String output(final MenuType argMT, final Account argUser, final String argCurrentPageName) {
		Validate.notNull(argMT);
		// argUser and argCurrentPageName may be null
		
		if (display(argUser)) {
			final StringBuilder lclSB = new StringBuilder();
			switch (argMT) {
				case BOOTSTRAP:
					if (this instanceof TopLevelMenu) {
						lclSB.append("<nav class=\"navbar navbar-default navbar-static-top\" role=\"navigation\">\n")
						     .append("	<div class=\"container-fluid\">\n")
						     .append("		<div class=\"navbar-header\">\n")
						     .append("			<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#navbar-collapse\" style=\"width: 30pt;\">\n")
						     .append("				<span class=\"sr-only\">Toggle navigation</span>\n")
						     .append("				<span class=\"icon-bar\"></span>\n")
						     .append("				<span class=\"icon-bar\"></span>\n")
						     .append("				<span class=\"icon-bar\"></span>\n")
						     .append("			</button>\n")
						     .append("		</div>\n")
						     .append("		<div class=\"collapse navbar-collapse\" id=\"navbar-collapse\">\n")
						     .append("			<p class=\"navbar-text\"><b>" + getTitle() + "</b></p>\n")
						     .append("			<ul class=\"nav navbar-nav\">\n");
					} else {
						if (isHighlighted(argCurrentPageName)) {
							lclSB.append("				<li class=\"dropdown active\">");
						} else {
							lclSB.append("				<li class=\"dropdown\">");
						}
						
						lclSB.append("					<a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">" + getTitle() + " <span class=\"caret\"></span></a>\n")
						     .append("<ul class=\"dropdown-menu\" role=\"menu\">\n");
					}
					
					
					for (final MenuItem lclItem : getItems()) {
						lclSB.append(lclItem.output(argMT, argUser, argCurrentPageName))
						     .append('\n');
					}
					
					if (this instanceof TopLevelMenu) {
						lclSB.append("			</ul>\n");
					} else {
						lclSB.append("				</li>\n")
						     .append("			</ul>\n");
					}
					
					if (this instanceof TopLevelMenu && argUser != null) {
						lclSB.append("			<ul class=\"nav navbar-nav navbar-right\">\n")
						     .append("				<li title=\"Logged in as " + argUser.getContact().getName() + "\"><a href=\"/logout.jsp\">Log Out</a></li>\n")
						     .append("			</ul>\n");
					}
					
					if (this instanceof TopLevelMenu) {
						lclSB.append("		</div>\n")
						     .append("	</div>\n")
						     .append("</nav>\n\n");
					}
					
					return lclSB.toString();
				
				case FOUNDATION:
					if (this instanceof TopLevelMenu) {
						lclSB.append("<div class=\"sticky\">\n")
						     .append("	<nav class=\"top-bar\" data-topbar data-options=\"sticky_on: large\" role=\"navigation\">\n")
						     .append("		<ul class=\"title-area\">\n")
						     .append("			<li class=\"name\"><h1><a>" + getTitle() + "</a></h1></li>\n")
						     .append("			<li class=\"toggle-topbar menu-icon\"><a href=\"#\"><span>Menu</span></a></li>\n")
						     .append("		</ul>\n")
						     .append("		<section class=\"top-bar-section\">\n")
						     .append("			<ul class=\"left\">\n");
					} else {
						lclSB.append("				<li class=\"has-dropdown\">")
						     .append("					<a href=\"#\">" + getTitle() + "</a>\n")
						     .append("					<ul class=\"dropdown\">\n");
					}
					
					for (final MenuItem lclItem : getItems()) {
						lclSB.append("				" + lclItem.output(argMT, argUser, argCurrentPageName))
						     .append('\n');
					}
					
					if (this instanceof TopLevelMenu) {
						lclSB.append("				</ul>\n")
						     .append("		</section>\n");
						
						if (argUser != null) {
							lclSB.append("			<section class=\"top-bar-section\">\n")
							     .append("				<ul class=\"right logged-in-container\">\n")
							     .append("					<li><a class=\"account\" title=\"Account settings\" href=\"/account/\"><i class=\"fa fa-gear\"></i></a></li>\n")
							     .append("					<li><a class=\"log-out\" title=\"Log out (currently logged in as " + argUser.getContact().getName() + ")\" href=\"/logout.jsp\"><i class=\"fa fa-sign-out\"></i></a></li>\n")
							     .append("				</ul>\n")
							     .append("			</section>");
						}
						
						lclSB.append("	</nav>\n")
						     .append("</div>");
					} else {
						lclSB.append("				</ul>\n");
					}
					
					return lclSB.toString();
					
				default:
					throw new MenuType.UnknownMenuTypeException(argMT);
			}
		} else {
			return "";
		}
	}
}
