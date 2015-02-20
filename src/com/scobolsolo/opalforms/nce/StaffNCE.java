package com.scobolsolo.opalforms.nce;

import com.siliconage.web.NameCodeExtractor;

import com.scobolsolo.application.Staff;

public final class StaffNCE extends NameCodeExtractor<Staff> {
	private StaffNCE() {
		super();
	}
	
	private static StaffNCE ourInstance = new StaffNCE();
	
	public static StaffNCE getInstance() {
		return ourInstance;
	}
	
	@Override
	public String extractName(final Staff argS) {
		return argS.getContact().getName();
	}
	
	@Override
	public String extractCode(final Staff argS) {
		return argS.getUniqueString();
	}
}
