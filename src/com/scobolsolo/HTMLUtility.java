package com.scobolsolo;

import org.apache.commons.lang3.Validate;

import com.opal.cma.OpalForm;
import com.opal.cma.OpalMainForm;

public final class HTMLUtility {
	public static final String DEFAULT_TRUE_STRING = com.siliconage.web.HTMLUtility.DEFAULT_TRUE_STRING;
	public static final String DEFAULT_FALSE_STRING = com.siliconage.web.HTMLUtility.DEFAULT_FALSE_STRING;
	
	private HTMLUtility() {
		throw new UnsupportedOperationException();
	}
	
	public static String switchWidget(final OpalForm<?> argOF, final String argFieldName, final String argSize) {
		Validate.notNull(argOF);
		Validate.notEmpty(argFieldName);
		Validate.notEmpty(argSize);
		
		return
			"<div class=\"switch " + argSize + "\">" +
				argOF.checkbox(argFieldName).addCssClass("switch-input") +
				"<label class=\"switch-paddle\" for=\"" + argOF.id(argFieldName) + "\"></label>" +
			"</div>";
	}
	
	public static String switchWidget(final OpalForm<?> argOF, final String argFieldName) {
		return switchWidget(argOF, argFieldName, "tiny");
	}
	
	public static String deleteWidget(final OpalForm<?> argOF, final String argSize) {
		Validate.notNull(argOF);
		Validate.notEmpty(argSize);
		
		if (argOF.alreadyExists()) {
			return
				"<div class=\"switch " + argSize + "\">" +
					argOF.delete().addCssClass("switch-input") +
					"<label class=\"switch-paddle\" for=\"" + argOF.id("Delete") + "\"></label>" +
				"</div>";
		} else {
			return "";
		}
	}
	
	public static String deleteWidget(final OpalForm<?> argOF) {
		if (argOF instanceof OpalMainForm) {
			throw new IllegalArgumentException("The switch-style delete widget is only available for subforms.");
		}
		
		return deleteWidget(argOF, "tiny");
	}
	
	public static String submitBlock(final OpalMainForm<?> argOF) {
		Validate.notNull(argOF);
		
		return "<div class=\"row\"><div class=\"small-12 columns submit-buttons\">" + argOF.submit() + ' ' + argOF.delete() + ' ' + argOF.cancel() + "</div></div>";
	}
}
