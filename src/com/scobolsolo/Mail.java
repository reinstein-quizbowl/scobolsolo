package com.scobolsolo;

import java.io.IOException;
import java.util.Arrays;
import javax.activation.DataSource;
import javax.mail.util.ByteArrayDataSource;

import org.apache.commons.lang3.Validate;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.SimpleEmail;
import org.apache.commons.mail.MultiPartEmail;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailException;
import org.apache.commons.validator.routines.EmailValidator;

public final class Mail {
	private Mail() {
		throw new UnsupportedOperationException();
	}
	
	// private static final org.apache.log4j.Logger ourLogger = org.apache.log4j.Logger.getLogger(Mail.class.getName());
	
	private static final String mySmtpServer = Validate.notNull(ScobolSoloConfiguration.getInstance().getString("SMTP_SERVER"));
	private static final int mySmtpPort = ScobolSoloConfiguration.getInstance().getInt("SMTP_PORT");
	private static final boolean mySmtpSsl = ScobolSoloConfiguration.getInstance().getBoolean("SMTP_SSL");
	private static final String mySmtpUsername = Validate.notNull(ScobolSoloConfiguration.getInstance().getString("SMTP_USERNAME"));
	private static final String mySmtpPassword = Validate.notNull(ScobolSoloConfiguration.getInstance().getString("SMTP_PASSWORD"));
	private static final String myBounceAddress = Validate.notNull(ScobolSoloConfiguration.getInstance().getString("SMTP_BOUNCE_ADDRESS"));
	
	public static SimpleEmail createEmail() {
		return setUpSending(new SimpleEmail());
	}
	
	public static SimpleEmail createEmailTo(final Iterable<String> argTos) throws EmailException {
		Validate.notNull(argTos);
		
		final SimpleEmail lclE = createEmail();
		
		for (final String lclTo : argTos) {
			lclE.addTo(lclTo);
		}
		
		return lclE;
	}
	
	public static SimpleEmail createEmailTo(final String... argTos) throws EmailException {
		Validate.notEmpty(argTos);
		
		return createEmailTo(Arrays.asList(argTos));
	}
	
	public static MultiPartEmail createAttachableEmail() {
		return setUpSending(new MultiPartEmail());
	}
	
	public static DataSource toDataSource(final String argData, final String argMimeType) throws IOException {
		Validate.notEmpty(argData);
		Validate.notEmpty(argMimeType);
		
		return new ByteArrayDataSource(argData, argMimeType);
	}
	
	private static <T extends Email> T setUpSending(final T argEmail) {
		Validate.notNull(argEmail);
		
		argEmail.setHostName(mySmtpServer);
		argEmail.setSmtpPort(mySmtpPort);
		argEmail.setAuthenticator(new DefaultAuthenticator(mySmtpUsername, mySmtpPassword));
		argEmail.setSSLOnConnect(mySmtpSsl);
		argEmail.setBounceAddress(myBounceAddress);
		
		return argEmail;
	}
	
	/**
		Check whether an email address is valid. Does nothing if it is; throws an {@link java.lang.IllegalArgumentException} if it is not.
		@param argEmail The email address to check
		@param argAllowNulls <code>true</code> if <code>argEmail</code> should pass validation if it is <code>null</code>; <code>false</code> if <code>argEmail</code> being <code>null</code> should cause it to fail validation
		@return the input email address, if it is valid
		@throws IllegalArgumentException If the email address fails validation (subject to the <code>null</code> check described above)
		@author jonah
	*/
	public static String validateEmail(final String argEmail, final boolean argAllowNulls) {
		if (argEmail == null) {
			if (argAllowNulls) {
				return null;
			} else {
				throw new IllegalArgumentException("Null email addresses are not acceptable");
			}
		}
		
		if (EmailValidator.getInstance().isValid(argEmail) == false) {
			throw new IllegalArgumentException("'" + argEmail + "' is not a valid email address");
		}
		
		return argEmail;
	}
	
	/**
		Check whether an email address is valid. Does nothing if it is; throws an {@link java.lang.IllegalArgumentException} if it is not.
		@param argEmail The email address to check
		@return the input email address, if it is valid
		@throws IllegalArgumentException If the email address fails validation (subject to the <code>null</code> check described above) or is <code>null</code>
		@author jonah
	*/
	public static String validateEmail(final String argEmail) {
		validateEmail(argEmail, false);
		
		return argEmail;
	}
}
