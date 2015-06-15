package com.scobolsolo;

import org.apache.commons.lang3.Validate;

import com.opal.cma.OpalForm;
import com.opal.cma.OpalMainForm;

public class HTMLUtility {
	private HTMLUtility() {
		throw new UnsupportedOperationException();
	}
	
	public static String switchWidget(OpalForm<?> argOF, String argFieldName, String argSize) {
		Validate.notNull(argOF);
		Validate.notEmpty(argFieldName);
		Validate.notEmpty(argSize);
		
		return "<div class=\"switch " + argSize + "\">" + argOF.checkbox(argFieldName) + "<label for=\"" + argOF.id(argFieldName) + "\"></label></div>";
	}
	
	public static String switchWidget(OpalForm<?> argOF, String argFieldName) {
		return switchWidget(argOF, argFieldName, "tiny");
	}
	
	public static String deleteWidget(OpalForm<?> argOF, String argSize) {
		Validate.notNull(argOF);
		Validate.notEmpty(argSize);
		
		return "<div class=\"switch " + argSize + "\">" + argOF.delete() + argOF.label("Delete", "") + "</div>";
	}
	
	public static String deleteWidget(OpalForm<?> argOF) {
		if (argOF instanceof OpalMainForm) {
			throw new IllegalArgumentException("The switch-style delete widget is only available for subforms.");
		}
		
		return deleteWidget(argOF, "tiny");
	}
	
	public static String submitBlock(OpalForm<?> argOF) {
		Validate.notNull(argOF);
		
		return "<div class=\"row\"><div class=\"small-12 columns submit-buttons\">" + argOF.submit() + ' ' + argOF.delete() + ' ' + argOF.cancel() + "</div></div>";
	}
}
