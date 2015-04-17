package com.scobolsolo.opalforms.nce;

import com.siliconage.web.NameCodeExtractor;

import com.scobolsolo.application.SchoolRegistration;

public final class SchoolRegistrationNCE extends NameCodeExtractor<SchoolRegistration> {
	private SchoolRegistrationNCE() {
		super();
	}
	
	private static SchoolRegistrationNCE ourInstance = new SchoolRegistrationNCE();
	
	public static SchoolRegistrationNCE getInstance() {
		return ourInstance;
	}
	
	@Override
	public String extractNameInternal(final SchoolRegistration argSR) {
		return argSR.getSchool().getShortName();
	}
	
	@Override
	public String extractCodeInternal(final SchoolRegistration argSR) {
		return argSR.getUniqueString();
	}
}
