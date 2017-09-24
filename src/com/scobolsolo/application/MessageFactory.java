package com.scobolsolo.application;

import com.scobolsolo.persistence.MessageOpalFactory;
import com.scobolsolo.persistence.MessageOpal;
import com.scobolsolo.persistence.OpalFactoryFactory;

public class MessageFactory extends com.opal.AbstractIdentityFactory<Message, MessageOpal> implements com.opal.FactoryCreator<Message> {

	/** This static variable holds the Singleton instance of the Factory for application
		objects of this type.  It is private, but can be accessed via the getInstance() method.
	*/

	private static final MessageFactory ourInstance = new MessageFactory(OpalFactoryFactory.getInstance().getMessageOpalFactory());

	public static MessageFactory getInstance() { return ourInstance; }

	public MessageOpalFactory getMessageOpalFactory() { return (MessageOpalFactory) getOpalFactory(); }

	protected MessageFactory(com.opal.IdentityOpalFactory<Message, MessageOpal> argOpalFactory) {
		super(argOpalFactory);
	}

	@Override
	public Class<Message> getUserFacingInterface() {
		return Message.class;
	}

	@com.opal.annotation.RequiresActiveTransaction
	@Override
	public Message create() {
		return getMessageOpalFactory().create().getUserFacing();
	}

	public Message forId(java.lang.Integer argId) {
		MessageOpal lclMessageOpal = getMessageOpalFactory().forId(argId);
		return (lclMessageOpal == null) ? null : lclMessageOpal.getUserFacing();
	}

	@Override
	public Message[] createArray(int argSize) {
		return new Message[argSize];
	}

	public Message fromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		org.apache.commons.lang3.Validate.notNull(argRequest);
		return fromHttpRequest(argRequest, "message_id");
	}

	public Message fromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argId) {
		org.apache.commons.lang3.Validate.notNull(argRequest);
		String lclIdString = argRequest.getParameter(argId);
		if (org.apache.commons.lang3.StringUtils.isBlank(lclIdString)) {
			return null;
		}
		java.lang.Integer lclId = java.lang.Integer.valueOf(org.apache.commons.lang3.StringUtils.trimToNull(lclIdString));
		return forId(lclId);
	}

	public <T extends java.util.Collection<? super Message>> T acquireFromHttpRequest(T argCollection, javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
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
			Message lclResult = forId(lclId);
			org.apache.commons.lang3.Validate.notNull(lclResult, "'" + lclValue + "' is not a valid Id for any Message");
			argCollection.add(lclResult);
		}
		return argCollection;
	}

	public <T extends java.util.Collection<? super Message>> T acquireFromHttpRequest(T argCollection, javax.servlet.http.HttpServletRequest argRequest) {
		return acquireFromHttpRequest(argCollection, argRequest, "message_id");
	}

	public java.util.Collection<Message> multipleFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
		return acquireFromHttpRequest(new java.util.LinkedList<>(), argRequest, argParameterName); // checks parameters for nullity
	}

	public java.util.Collection<Message> multipleFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		return multipleFromHttpRequest(argRequest, "message_id");
	}

	public Message[] arrayFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest, String argParameterName) {
		java.util.LinkedList<Message> lclUs = acquireFromHttpRequest(new java.util.LinkedList<>(), argRequest, argParameterName); // checks parameters for nullity
		return lclUs.toArray(createArray(lclUs.size()));
	}

	public Message[] arrayFromHttpRequest(javax.servlet.http.HttpServletRequest argRequest) {
		return arrayFromHttpRequest(argRequest, "message_id");
	}

	@Override
	public Message forUniqueString(String argUniqueString) {
		if (argUniqueString == null) {
			return null;
		}
		MessageOpal lclOpal = getOpalFactory().forUniqueString(argUniqueString);
		return lclOpal != null ? lclOpal.getUserFacing() : null;
	}
}
