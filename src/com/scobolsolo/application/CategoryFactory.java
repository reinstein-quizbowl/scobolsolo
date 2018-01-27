package com.scobolsolo.application;

import com.scobolsolo.persistence.CategoryOpalFactory;
import com.scobolsolo.persistence.CategoryOpal;
import com.scobolsolo.persistence.OpalFactoryFactory;

public class CategoryFactory extends com.opal.AbstractIdentityFactory<Category, CategoryOpal> implements com.opal.FactoryCreator<Category> {

	/** This static variable holds the Singleton instance of the Factory for application
		objects of this type.  It is private, but can be accessed via the getInstance() method.
	*/

	private static final CategoryFactory ourInstance = new CategoryFactory(OpalFactoryFactory.getInstance().getCategoryOpalFactory());

	public static CategoryFactory getInstance() { return ourInstance; }

	public CategoryOpalFactory getCategoryOpalFactory() { return (CategoryOpalFactory) getOpalFactory(); }

	protected CategoryFactory(com.opal.IdentityOpalFactory<Category, CategoryOpal> argOpalFactory) {
		super(argOpalFactory);
	}

	@Override
	public Class<Category> getUserFacingInterface() {
		return Category.class;
	}


	/* These Singleton objects are initialized on system start up to refer to unchanging objects
		from the database.
	*/

	public static final Category ALGEBRA() { return getInstance().forCode("ALGEBRA"); }
	public static final Category ART_ARCHITECTURE() { return getInstance().forCode("ART_ARCHITECTURE"); }
	public static final Category BIOLOGY() { return getInstance().forCode("BIOLOGY"); }
	public static final Category BRITISH_LITERATURE() { return getInstance().forCode("BRITISH_LITERATURE"); }
	public static final Category CHEMISTRY() { return getInstance().forCode("CHEMISTRY"); }
	public static final Category CURRENT_EVENTS() { return getInstance().forCode("CURRENT_EVENTS"); }
	public static final Category EUROPEAN_HISTORY() { return getInstance().forCode("EUROPEAN_HISTORY"); }
	public static final Category EURO_WORLD_LITERATURE() { return getInstance().forCode("EURO_WORLD_LITERATURE"); }
	public static final Category GEOG_EARTHSCI_ASTRO() { return getInstance().forCode("GEOG_EARTHSCI_ASTRO"); }
	public static final Category GEOGRAPHY() { return getInstance().forCode("GEOGRAPHY"); }
	public static final Category GEOMETRY_TRIG() { return getInstance().forCode("GEOMETRY_TRIG"); }
	public static final Category INTERDISCIPLINARY() { return getInstance().forCode("INTERDISCIPLINARY"); }
	public static final Category MATH() { return getInstance().forCode("MATH"); }
	public static final Category MILITARY_HISTORY() { return getInstance().forCode("MILITARY_HISTORY"); }
	public static final Category MISCELLANEOUS() { return getInstance().forCode("MISCELLANEOUS"); }
	public static final Category MUSIC() { return getInstance().forCode("MUSIC"); }
	public static final Category NONFICTION() { return getInstance().forCode("NONFICTION"); }
	public static final Category OTHER_FINE_ARTS() { return getInstance().forCode("OTHER_FINE_ARTS"); }
	public static final Category OTHER_SCIENCE() { return getInstance().forCode("OTHER_SCIENCE"); }
	public static final Category PAINTING() { return getInstance().forCode("PAINTING"); }
	public static final Category PHYSICS() { return getInstance().forCode("PHYSICS"); }
	public static final Category POETRY() { return getInstance().forCode("POETRY"); }
	public static final Category POP_CULTURE() { return getInstance().forCode("POP_CULTURE"); }
	public static final Category RELIGION_MYTHOLOGY() { return getInstance().forCode("RELIGION_MYTHOLOGY"); }
	public static final Category SOCIAL_SCIENCE_PHILOSOPHY() { return getInstance().forCode("SOCIAL_SCIENCE_PHILOSOPHY"); }
	public static final Category TBD() { return getInstance().forCode("TBD"); }
	public static final Category UNKNOWN() { return getInstance().forCode("UNKNOWN"); }
	public static final Category US_HISTORY() { return getInstance().forCode("US_HISTORY"); }
	public static final Category US_LITERATURE() { return getInstance().forCode("US_LITERATURE"); }
	public static final Category VOCABULARY() { return getInstance().forCode("VOCABULARY"); }
	public static final Category WORLD_HISTORY() { return getInstance().forCode("WORLD_HISTORY"); }

	@com.opal.annotation.RequiresActiveTransaction
	@Override
	public Category create() {
		return getCategoryOpalFactory().create().getUserFacing();
	}

	public Category forName(java.lang.String argName) {
		CategoryOpal lclCategoryOpal = getCategoryOpalFactory().forName(argName);
		return (lclCategoryOpal == null) ? null : lclCategoryOpal.getUserFacing();
	}

	public Category forCode(java.lang.String argCode) {
		CategoryOpal lclCategoryOpal = getCategoryOpalFactory().forCode(argCode);
		return (lclCategoryOpal == null) ? null : lclCategoryOpal.getUserFacing();
	}

	public Category forShortName(java.lang.String argShortName) {
		CategoryOpal lclCategoryOpal = getCategoryOpalFactory().forShortName(argShortName);
		return (lclCategoryOpal == null) ? null : lclCategoryOpal.getUserFacing();
	}

	@Override
	public Category[] createArray(int argSize) {
		return new Category[argSize];
	}

	public Category fromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		org.apache.commons.lang3.Validate.notNull(argRequest);
		return fromHttpRequest(argRequest, "category_code");
	}

	public Category fromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argCode) {
		org.apache.commons.lang3.Validate.notNull(argRequest);
		String lclCodeString = argRequest.getParameter(argCode);
		if (org.apache.commons.lang3.StringUtils.isBlank(lclCodeString)) {
			return null;
		}
		java.lang.String lclCode = lclCodeString;
		return forCode(lclCode);
	}

	public <T extends java.util.Collection<? super Category>> T acquireFromHttpRequest(T argCollection, javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
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
			Category lclResult = forCode(lclCode);
			org.apache.commons.lang3.Validate.notNull(lclResult, "'" + lclValue + "' is not a valid Code for any Category");
			argCollection.add(lclResult);
		}
		return argCollection;
	}

	public <T extends java.util.Collection<? super Category>> T acquireFromHttpRequest(T argCollection, javax.servlet.http.HttpServletRequest argRequest) {
		return acquireFromHttpRequest(argCollection, argRequest, "category_code");
	}

	public java.util.Collection<Category> multipleFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
		return acquireFromHttpRequest(new java.util.LinkedList<>(), argRequest, argParameterName); // checks parameters for nullity
	}

	public java.util.Collection<Category> multipleFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		return multipleFromHttpRequest(argRequest, "category_code");
	}

	public Category[] arrayFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
		java.util.LinkedList<Category> lclUs = acquireFromHttpRequest(new java.util.LinkedList<>(), argRequest, argParameterName); // checks parameters for nullity
		return lclUs.toArray(createArray(lclUs.size()));
	}

	public Category[] arrayFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		return arrayFromHttpRequest(argRequest, "category_code");
	}

	@Override
	public Category forUniqueString(String argUniqueString) {
		if (argUniqueString == null) {
			return null;
		}
		CategoryOpal lclOpal = getOpalFactory().forUniqueString(argUniqueString);
		return lclOpal != null ? lclOpal.getUserFacing() : null;
	}
}
