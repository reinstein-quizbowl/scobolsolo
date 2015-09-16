package com.scobolsolo.application;

import com.scobolsolo.persistence.ResponseTypeOpalFactory;
import com.scobolsolo.persistence.ResponseTypeOpal;
import com.scobolsolo.persistence.OpalFactoryFactory;

public class ResponseTypeFactory extends com.opal.AbstractFactory<ResponseType, ResponseTypeOpal> implements com.opal.FactoryCreator<ResponseType>, com.opal.IdentityFactory<ResponseType> {
	/** This static variable holds the Singleton instance of the Factory for application
		objects of this type.  It is private, but can be accessed via the getInstance() method.
	*/

	private static final ResponseTypeFactory ourInstance = new ResponseTypeFactory(OpalFactoryFactory.getInstance().getResponseTypeOpalFactory());

	public static ResponseTypeFactory getInstance() { return ourInstance; }

	public ResponseTypeOpalFactory getResponseTypeOpalFactory() { return (ResponseTypeOpalFactory) getOpalFactory(); }

	protected ResponseTypeFactory(com.opal.OpalFactory<ResponseType, ResponseTypeOpal> argOpalFactory) {
		super(argOpalFactory);
	}

	@Override
	public Class<ResponseType> getUserFacingInterface() {
		return ResponseType.class;
	}


	/* These Singleton objects are initialized on system start up to refer to unchanging objects
		from the database.
	*/

	public static final ResponseType CORRECT() { return getInstance().forCode("CORRECT"); }
	public static final ResponseType INCORRECT_AT_END() { return getInstance().forCode("INCORRECT_AT_END"); }
	public static final ResponseType INTERRUPT() { return getInstance().forCode("INTERRUPT"); }
	public static final ResponseType NO_ATTEMPT() { return getInstance().forCode("NO_ATTEMPT"); }
	public static final ResponseType PHANTOM() { return getInstance().forCode("PHANTOM"); }

	@Override
	public ResponseType create() {
		return getResponseTypeOpalFactory().create().getUserFacing();
	}

	public ResponseType forName(java.lang.String argName) {
		ResponseTypeOpal lclResponseTypeOpal = getResponseTypeOpalFactory().forName(argName);
		return (lclResponseTypeOpal == null) ? null : lclResponseTypeOpal.getUserFacing();
	}

	public ResponseType forCode(java.lang.String argCode) {
		ResponseTypeOpal lclResponseTypeOpal = getResponseTypeOpalFactory().forCode(argCode);
		return (lclResponseTypeOpal == null) ? null : lclResponseTypeOpal.getUserFacing();
	}

	public ResponseType forShortName(java.lang.String argShortName) {
		ResponseTypeOpal lclResponseTypeOpal = getResponseTypeOpalFactory().forShortName(argShortName);
		return (lclResponseTypeOpal == null) ? null : lclResponseTypeOpal.getUserFacing();
	}

	@Override
	public ResponseType[] createArray(int argSize) {
		return new ResponseType[argSize];
	}

	public ResponseType fromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		org.apache.commons.lang3.Validate.notNull(argRequest);
		return fromHttpRequest(argRequest, "response_type_code");
	}

	public ResponseType fromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argCode) {
		org.apache.commons.lang3.Validate.notNull(argRequest);
		String lclCodeString = argRequest.getParameter(argCode);
		if (org.apache.commons.lang3.StringUtils.isBlank(lclCodeString)) {
			return null;
		}
		java.lang.String lclCode = lclCodeString;
		return forCode(lclCode);
	}

	public <T extends java.util.Collection<? super ResponseType>> T acquireFromHttpRequest(T argCollection, javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
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
			ResponseType lclResult = forCode(lclCode);
			org.apache.commons.lang3.Validate.notNull(lclResult, "'" + lclValue + "' is not a valid Code for any ResponseType");
			argCollection.add(lclResult);
		}
		return argCollection;
	}

	public <T extends java.util.Collection<? super ResponseType>> T acquireFromHttpRequest(T argCollection, javax.servlet.http.HttpServletRequest argRequest) {
		return acquireFromHttpRequest(argCollection, argRequest, "response_type_code");
	}

	public java.util.Collection<ResponseType> multipleFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
		return acquireFromHttpRequest(new java.util.LinkedList<>(), argRequest, argParameterName); // checks parameters for nullity
	}

	public java.util.Collection<ResponseType> multipleFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		return multipleFromHttpRequest(argRequest, "response_type_code");
	}

	public ResponseType[] arrayFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
		java.util.LinkedList<ResponseType> lclUs = acquireFromHttpRequest(new java.util.LinkedList<>(), argRequest, argParameterName); // checks parameters for nullity
		return lclUs.toArray(createArray(lclUs.size()));
	}

	public ResponseType[] arrayFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		return arrayFromHttpRequest(argRequest, "response_type_code");
	}

	@Override
	public ResponseType forUniqueString(String argUniqueString) {
		if (argUniqueString == null) {
			return null;
		}
		ResponseTypeOpal lclOpal = getOpalFactory().forUniqueString(argUniqueString);
		return lclOpal != null ? lclOpal.getUserFacing() : null;
	}
}
