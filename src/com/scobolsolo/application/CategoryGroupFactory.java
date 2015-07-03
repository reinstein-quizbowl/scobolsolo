package com.scobolsolo.application;

import com.opal.*;
import com.scobolsolo.persistence.CategoryGroupOpalFactory;
import com.scobolsolo.persistence.CategoryGroupOpal;
import com.scobolsolo.persistence.OpalFactoryFactory;

public class CategoryGroupFactory extends com.opal.AbstractFactory<CategoryGroup, CategoryGroupOpal> implements com.opal.FactoryCreator<CategoryGroup>, com.opal.IdentityFactory<CategoryGroup> {
	/** This static variable holds the Singleton instance of the Factory for application
		objects of this type.  It is private, but can be accessed via the getInstance() method.
	*/

	private static final CategoryGroupFactory ourInstance = new CategoryGroupFactory(OpalFactoryFactory.getInstance().getCategoryGroupOpalFactory());

	public static CategoryGroupFactory getInstance() { return ourInstance; }

	public CategoryGroupOpalFactory getCategoryGroupOpalFactory() { return (CategoryGroupOpalFactory) getOpalFactory(); }

	protected CategoryGroupFactory(OpalFactory<CategoryGroup, CategoryGroupOpal> argOpalFactory) {
		super(argOpalFactory);
	}

	@Override
	public Class<CategoryGroup> getUserFacingInterface() {
		return CategoryGroup.class;
	}


	/* These Singleton objects are initialized on system start up to refer to unchanging objects
		from the database.
	*/

	public static final CategoryGroup FINE_ARTS() { return getInstance().forCode("FINE_ARTS"); }
	public static final CategoryGroup HISTORY() { return getInstance().forCode("HISTORY"); }
	public static final CategoryGroup LITERATURE() { return getInstance().forCode("LITERATURE"); }
	public static final CategoryGroup OTHER() { return getInstance().forCode("OTHER"); }
	public static final CategoryGroup SCIENCE() { return getInstance().forCode("SCIENCE"); }

	@Override
	public CategoryGroup create() {
		return getCategoryGroupOpalFactory().create().getUserFacing();
	}

	public CategoryGroup forName(java.lang.String argName) {
		CategoryGroupOpal lclCategoryGroupOpal = getCategoryGroupOpalFactory().forName(argName);
		return (lclCategoryGroupOpal == null) ? null : lclCategoryGroupOpal.getUserFacing();
	}

	public CategoryGroup forCode(java.lang.String argCode) {
		CategoryGroupOpal lclCategoryGroupOpal = getCategoryGroupOpalFactory().forCode(argCode);
		return (lclCategoryGroupOpal == null) ? null : lclCategoryGroupOpal.getUserFacing();
	}

	public CategoryGroup forShortName(java.lang.String argShortName) {
		CategoryGroupOpal lclCategoryGroupOpal = getCategoryGroupOpalFactory().forShortName(argShortName);
		return (lclCategoryGroupOpal == null) ? null : lclCategoryGroupOpal.getUserFacing();
	}

	@Override
	public CategoryGroup[] createArray(int argSize) {
		return new CategoryGroup[argSize];
	}

	public CategoryGroup fromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		org.apache.commons.lang3.Validate.notNull(argRequest);
		return fromHttpRequest(argRequest, "category_group_code");
	}

	public CategoryGroup fromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argCode) {
		org.apache.commons.lang3.Validate.notNull(argRequest);
		String lclCodeString = argRequest.getParameter(argCode);
		if (org.apache.commons.lang3.StringUtils.isBlank(lclCodeString)) {
			return null;
		}
		java.lang.String lclCode = lclCodeString;
		return forCode(lclCode);
	}

	public <T extends java.util.Collection<? super CategoryGroup>> T acquireFromHttpRequest(T argCollection, javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
		org.apache.commons.lang3.Validate.notNull(argCollection);
		org.apache.commons.lang3.Validate.notNull(argRequest);
		org.apache.commons.lang3.Validate.notEmpty(argParameterName);
		String[] lclValues = argRequest.getParameterValues(argParameterName);
		if (lclValues == null || lclValues.length == 0) {
			return argCollection;
		}
		for (String lclValueUntrimmed : lclValues) {
			String lclValue = org.apache.commons.lang3.StringUtils.trimToNull(lclValueUntrimmed);
			if (lclValue == null) {
				continue;
			}
			java.lang.String lclCode = lclValue;
			CategoryGroup lclResult = forCode(lclCode);
			org.apache.commons.lang3.Validate.notNull(lclResult, "'" + lclValue + "' is not a valid Code for any CategoryGroup");
			argCollection.add(lclResult);
		}
		return argCollection;
	}

	public <T extends java.util.Collection<? super CategoryGroup>> T acquireFromHttpRequest(T argCollection, javax.servlet.http.HttpServletRequest argRequest) {
		return acquireFromHttpRequest(argCollection, argRequest, "category_group_code");
	}

	public java.util.Collection<CategoryGroup> multipleFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
		return acquireFromHttpRequest(new java.util.LinkedList<>(), argRequest, argParameterName); // checks parameters for nullity
	}

	public java.util.Collection<CategoryGroup> multipleFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		return multipleFromHttpRequest(argRequest, "category_group_code");
	}

	public CategoryGroup[] arrayFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
		java.util.LinkedList<CategoryGroup> lclUs = acquireFromHttpRequest(new java.util.LinkedList<>(), argRequest, argParameterName); // checks parameters for nullity
		return lclUs.toArray(createArray(lclUs.size()));
	}

	public CategoryGroup[] arrayFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		return arrayFromHttpRequest(argRequest, "category_group_code");
	}

	@Override
	public CategoryGroup forUniqueString(String argUniqueString) {
		if (argUniqueString == null) {
			return null;
		}
		CategoryGroupOpal lclOpal = getOpalFactory().forUniqueString(argUniqueString);
		return lclOpal != null ? lclOpal.getUserFacing() : null;
	}
}
