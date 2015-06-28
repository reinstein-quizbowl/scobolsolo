package com.scobolsolo;

import java.util.Collections;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Validate;

public class Utility {
	private Utility() {
		throw new UnsupportedOperationException();
	}
	
	public static final String getAdminContact() {
		return "Jonah Greenthal (<a href=\"mailto:jonah@jonahgreenthal.com\">jonah@jonahgreenthal.com</a>)";
	}
	
	public static final String nParameters(int argN) {
		Validate.isTrue(argN > 0);
		return StringUtils.join(Collections.nCopies(argN, "?"), ',');
	}
}
