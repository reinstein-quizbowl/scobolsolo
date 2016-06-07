package com.scobolsolo.application;

import com.scobolsolo.persistence.CategoryUseOpalFactory;
import com.scobolsolo.persistence.CategoryUseOpal;
import com.scobolsolo.persistence.OpalFactoryFactory;

public class CategoryUseFactory extends com.opal.AbstractIdentityFactory<CategoryUse, CategoryUseOpal> implements com.opal.FactoryCreator<CategoryUse> {

	/** This static variable holds the Singleton instance of the Factory for application
		objects of this type.  It is private, but can be accessed via the getInstance() method.
	*/

	private static final CategoryUseFactory ourInstance = new CategoryUseFactory(OpalFactoryFactory.getInstance().getCategoryUseOpalFactory());

	public static CategoryUseFactory getInstance() { return ourInstance; }

	public CategoryUseOpalFactory getCategoryUseOpalFactory() { return (CategoryUseOpalFactory) getOpalFactory(); }

	protected CategoryUseFactory(com.opal.IdentityOpalFactory<CategoryUse, CategoryUseOpal> argOpalFactory) {
		super(argOpalFactory);
	}

	@Override
	public Class<CategoryUse> getUserFacingInterface() {
		return CategoryUse.class;
	}

	@Override
	public CategoryUse create() {
		return getCategoryUseOpalFactory().create().getUserFacing();
	}

	public CategoryUse forCategoryCodeTournamentCode(java.lang.String argCategoryCode, java.lang.String argTournamentCode) {
		CategoryUseOpal lclCategoryUseOpal = getCategoryUseOpalFactory().forCategoryCodeTournamentCode(argCategoryCode, argTournamentCode);
		return (lclCategoryUseOpal == null) ? null : lclCategoryUseOpal.getUserFacing();
	}

	@Override
	public CategoryUse[] createArray(int argSize) {
		return new CategoryUse[argSize];
	}

	public CategoryUse fromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		org.apache.commons.lang3.Validate.notNull(argRequest);
		return fromHttpRequest(argRequest, "category_use_category_code", "category_use_tournament_code");
	}

	public CategoryUse fromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argCategoryCode, String argTournamentCode) {
		org.apache.commons.lang3.Validate.notNull(argRequest);
		String lclCategoryCodeString = argRequest.getParameter(argCategoryCode);
		if (org.apache.commons.lang3.StringUtils.isBlank(lclCategoryCodeString)) {
			return null;
		}
		java.lang.String lclCategoryCode = lclCategoryCodeString;
		String lclTournamentCodeString = argRequest.getParameter(argTournamentCode);
		if (org.apache.commons.lang3.StringUtils.isBlank(lclTournamentCodeString)) {
			return null;
		}
		java.lang.String lclTournamentCode = lclTournamentCodeString;
		return forCategoryCodeTournamentCode(lclCategoryCode, lclTournamentCode);
	}

	public <T extends java.util.Collection<? super CategoryUse>> T acquireFromHttpRequest(T argCollection, javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
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
			CategoryUse lclResult = forUniqueString(lclValue);
			org.apache.commons.lang3.Validate.notNull(lclResult, "'" + lclValue + "' is not a valid unique string for any CategoryUse");
			argCollection.add(lclResult);
		}
		return argCollection;
	}

	public <T extends java.util.Collection<? super CategoryUse>> T acquireFromHttpRequest(T argCollection, javax.servlet.http.HttpServletRequest argRequest) {
		return acquireFromHttpRequest(argCollection, argRequest, "category_use_us");
	}

	public java.util.Collection<CategoryUse> multipleFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
		return acquireFromHttpRequest(new java.util.LinkedList<>(), argRequest, argParameterName); // checks parameters for nullity
	}

	public java.util.Collection<CategoryUse> multipleFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		return multipleFromHttpRequest(argRequest, "category_use_us");
	}

	public CategoryUse[] arrayFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
		java.util.LinkedList<CategoryUse> lclUs = acquireFromHttpRequest(new java.util.LinkedList<>(), argRequest, argParameterName); // checks parameters for nullity
		return lclUs.toArray(createArray(lclUs.size()));
	}

	public CategoryUse[] arrayFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		return arrayFromHttpRequest(argRequest, "category_use_us");
	}

	@Override
	public CategoryUse forUniqueString(String argUniqueString) {
		if (argUniqueString == null) {
			return null;
		}
		CategoryUseOpal lclOpal = getOpalFactory().forUniqueString(argUniqueString);
		return lclOpal != null ? lclOpal.getUserFacing() : null;
	}
}
