package com.scobolsolo.application;

import com.opal.*;
import com.scobolsolo.persistence.AccountOpalFactory;
import com.scobolsolo.persistence.AccountOpal;
import com.scobolsolo.persistence.OpalFactoryFactory;

public class AccountFactory extends com.opal.AbstractFactory<Account, AccountOpal> implements com.opal.FactoryCreator<Account>, com.opal.IdentityFactory<Account> {
	/** This static variable holds the Singleton instance of the Factory for application
		objects of this type.  It is private, but can be accessed via the getInstance() method.
	*/

	private static final AccountFactory ourInstance = new AccountFactory(OpalFactoryFactory.getInstance().getAccountOpalFactory());

	public static AccountFactory getInstance() { return ourInstance; }

	public AccountOpalFactory getAccountOpalFactory() { return (AccountOpalFactory) getOpalFactory(); }

	protected AccountFactory(OpalFactory<Account, AccountOpal> argOpalFactory) {
		super(argOpalFactory);
	}

	@Override
	public Class<Account> getUserFacingInterface() {
		return Account.class;
	}

	@Override
	public Account create() {
		return getAccountOpalFactory().create().getUserFacing();
	}

	public Account forId(java.lang.Integer argId) {
		AccountOpal lclAccountOpal = getAccountOpalFactory().forId(argId);
		return (lclAccountOpal == null) ? null : lclAccountOpal.getUserFacing();
	}

	public Account forUsername(java.lang.String argUsername) {
		AccountOpal lclAccountOpal = getAccountOpalFactory().forUsername(argUsername);
		return (lclAccountOpal == null) ? null : lclAccountOpal.getUserFacing();
	}

	@Override
	public Account[] createArray(int argSize) {
		return new Account[argSize];
	}

	public Account fromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		org.apache.commons.lang3.Validate.notNull(argRequest);
		return fromHttpRequest(argRequest, "account_id");
	}

	public Account fromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argId) {
		org.apache.commons.lang3.Validate.notNull(argRequest);
		String lclIdString = argRequest.getParameter(argId);
		if (lclIdString == null || lclIdString.equals("")) {
			return null;
		}
		java.lang.Integer lclId = java.lang.Integer.valueOf(lclIdString);
		return forId(lclId);
	}

	public <T extends java.util.Collection<? super Account>> T acquireFromHttpRequest(T argCollection, javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
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
			java.lang.Integer lclId = java.lang.Integer.valueOf(lclValue);
			Account lclResult = forId(lclId);
			org.apache.commons.lang3.Validate.notNull(lclResult, "'" + lclValue + "' is not a valid Id for any Account");
			argCollection.add(lclResult);
		}
		return argCollection;
	}

	public <T extends java.util.Collection<? super Account>> T acquireFromHttpRequest(T argCollection, javax.servlet.http.HttpServletRequest argRequest) {
		return acquireFromHttpRequest(argCollection, argRequest, "account_id");
	}

	public java.util.Collection<Account> multipleFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
		return acquireFromHttpRequest(new java.util.LinkedList<>(), argRequest, argParameterName); // checks parameters for nullity
	}

	public java.util.Collection<Account> multipleFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		return multipleFromHttpRequest(argRequest, "account_id");
	}

	public Account[] arrayFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
		java.util.LinkedList<Account> lclUs = acquireFromHttpRequest(new java.util.LinkedList<>(), argRequest, argParameterName); // checks parameters for nullity
		return lclUs.toArray(createArray(lclUs.size()));
	}

	public Account[] arrayFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		return arrayFromHttpRequest(argRequest, "account_id");
	}

	@Override
	public Account forUniqueString(String argUniqueString) {
		if (argUniqueString == null) {
			return null;
		}
		AccountOpal lclOpal = getOpalFactory().forUniqueString(argUniqueString);
		return lclOpal != null ? lclOpal.getUserFacing() : null;
	}
}
