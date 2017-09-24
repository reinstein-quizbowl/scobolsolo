package com.scobolsolo.application;

import com.scobolsolo.persistence.ResponseOpalFactory;
import com.scobolsolo.persistence.ResponseOpal;
import com.scobolsolo.persistence.OpalFactoryFactory;

public class ResponseFactory extends com.opal.AbstractIdentityFactory<Response, ResponseOpal> implements com.opal.FactoryCreator<Response> {

	/** This static variable holds the Singleton instance of the Factory for application
		objects of this type.  It is private, but can be accessed via the getInstance() method.
	*/

	private static final ResponseFactory ourInstance = new ResponseFactory(OpalFactoryFactory.getInstance().getResponseOpalFactory());

	public static ResponseFactory getInstance() { return ourInstance; }

	public ResponseOpalFactory getResponseOpalFactory() { return (ResponseOpalFactory) getOpalFactory(); }

	protected ResponseFactory(com.opal.IdentityOpalFactory<Response, ResponseOpal> argOpalFactory) {
		super(argOpalFactory);
	}

	@Override
	public Class<Response> getUserFacingInterface() {
		return Response.class;
	}

	@com.opal.annotation.RequiresActiveTransaction
	@Override
	public Response create() {
		return getResponseOpalFactory().create().getUserFacing();
	}

	public Response forId(java.lang.Integer argId) {
		ResponseOpal lclResponseOpal = getResponseOpalFactory().forId(argId);
		return (lclResponseOpal == null) ? null : lclResponseOpal.getUserFacing();
	}

	@Override
	public Response[] createArray(int argSize) {
		return new Response[argSize];
	}

	public Response fromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		org.apache.commons.lang3.Validate.notNull(argRequest);
		return fromHttpRequest(argRequest, "response_id");
	}

	public Response fromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argId) {
		org.apache.commons.lang3.Validate.notNull(argRequest);
		String lclIdString = argRequest.getParameter(argId);
		if (org.apache.commons.lang3.StringUtils.isBlank(lclIdString)) {
			return null;
		}
		java.lang.Integer lclId = java.lang.Integer.valueOf(org.apache.commons.lang3.StringUtils.trimToNull(lclIdString));
		return forId(lclId);
	}

	public <T extends java.util.Collection<? super Response>> T acquireFromHttpRequest(T argCollection, javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
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
			java.lang.Integer lclId = java.lang.Integer.valueOf(org.apache.commons.lang3.StringUtils.trimToNull(lclValue));
			Response lclResult = forId(lclId);
			org.apache.commons.lang3.Validate.notNull(lclResult, "'" + lclValue + "' is not a valid Id for any Response");
			argCollection.add(lclResult);
		}
		return argCollection;
	}

	public <T extends java.util.Collection<? super Response>> T acquireFromHttpRequest(T argCollection, javax.servlet.http.HttpServletRequest argRequest) {
		return acquireFromHttpRequest(argCollection, argRequest, "response_id");
	}

	public java.util.Collection<Response> multipleFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
		return acquireFromHttpRequest(new java.util.LinkedList<>(), argRequest, argParameterName); // checks parameters for nullity
	}

	public java.util.Collection<Response> multipleFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		return multipleFromHttpRequest(argRequest, "response_id");
	}

	public Response[] arrayFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
		java.util.LinkedList<Response> lclUs = acquireFromHttpRequest(new java.util.LinkedList<>(), argRequest, argParameterName); // checks parameters for nullity
		return lclUs.toArray(createArray(lclUs.size()));
	}

	public Response[] arrayFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		return arrayFromHttpRequest(argRequest, "response_id");
	}

	@Override
	public Response forUniqueString(String argUniqueString) {
		if (argUniqueString == null) {
			return null;
		}
		ResponseOpal lclOpal = getOpalFactory().forUniqueString(argUniqueString);
		return lclOpal != null ? lclOpal.getUserFacing() : null;
	}
}
