package com.scobolsolo;

import java.util.Collections;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Validate;

public class Utility {
	private Utility() {
		throw new UnsupportedOperationException();
	}
	
	private static final String FILENAME_SEPARATOR = "-";
	
	public static final String getAdminContact() {
		return "Jonah Greenthal (<a href=\"mailto:jonah@jonahgreenthal.com\">jonah@jonahgreenthal.com</a>)";
	}
	
	public static final String cleanFilename(final String argS) {
		final StringBuilder lclSB = new StringBuilder(argS.length());
		
		boolean lclJustAppendedNonAlphanumeric = false;
		for (final char lclC : argS.toCharArray()) {
			if (Character.isLetterOrDigit(lclC)) {
				lclSB.append(Character.toLowerCase(lclC));
				lclJustAppendedNonAlphanumeric = false;
			} else {
				if (!lclJustAppendedNonAlphanumeric) {
					lclSB.append(FILENAME_SEPARATOR);
					lclJustAppendedNonAlphanumeric = true;
				}
			}
		}
		
		return lclSB.toString();
	}
	
	public static final String nParameters(int argN) {
		Validate.isTrue(argN > 0);
		return StringUtils.join(Collections.nCopies(argN, "?"), ',');
	}
	
	public static String makeList(Object[] argInputs, String argConjunction) {
		Validate.notNull(argInputs);
		int lclLength = argInputs.length;
		
		if (lclLength == 0) {
			return "";
		} else if (lclLength == 1) {
			return argInputs[0].toString();
		} else if (lclLength == 2) {
			return argInputs[0].toString() + ' ' + argConjunction + ' '  + argInputs[1].toString();
		} else {
			StringBuilder lclSB = new StringBuilder();
			
			boolean lclAnyContainsCommas = false;
			for (Object lclO : argInputs) {
				if (String.valueOf(lclO).contains(",")) {
					lclAnyContainsCommas = true;
				}
			}
			
			for (int lclI = 0; lclI < lclLength; ++lclI) {
				lclSB.append(String.valueOf(argInputs[lclI]));
				if (lclI < lclLength - 2) {
					lclSB.append(lclAnyContainsCommas ? "; " : ", ");
				} else if (lclI == lclLength - 2) {
					lclSB.append(lclAnyContainsCommas ? "; " + argConjunction + ' ' : ", " + argConjunction + ' ');
				}
			}
			
			return lclSB.toString();
		}
	}
	
	public static String makeList(Collection<?> argInputs, String argConjunction) {
		Validate.notNull(argInputs);
		
		return makeList(argInputs.toArray(), argConjunction);
	}
	
	public static <T> String makeList(Collection<T> argInputs, Function<T, ?> argStringExtractor, String argConjunction) {
		Validate.notNull(argInputs);
		Validate.notNull(argStringExtractor);
		
		List<String> lclStrings = argInputs.stream().map(argStringExtractor::apply).map(String::valueOf).collect(Collectors.toList());
		
		return makeList(lclStrings.toArray(), argConjunction);
	}
	
	public static <T> String makeList(T[] argInputs, Function<T, ?> argStringExtractor, String argConjunction) {
		return makeList(Arrays.asList(argInputs), argStringExtractor, argConjunction);
	}
	
	public static String makeList(Object[] argInputs) {
		return makeList(argInputs, "and");
	}
	
	public static String makeList(Collection<?> argInputs) {
		return makeList(argInputs, "and");
	}
	
	public static <T> String makeList(Collection<T> argInputs, Function<T, ?> argStringExtractor) {
		return makeList(argInputs, argStringExtractor, "and");
	}
	
	public static <T> String makeList(T[] argInputs, Function<T, ?> argStringExtractor) {
		return makeList(argInputs, argStringExtractor, "and");
	}
}
