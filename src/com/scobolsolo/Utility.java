package com.scobolsolo;

import java.util.Collections;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Validate;

public final class Utility {
	private static final String FILENAME_SEPARATOR = "-";
	
	private Utility() {
		throw new UnsupportedOperationException();
	}
	
	public static String getAdminContact() {
		return "Jonah Greenthal (<a href=\"mailto:jonah@jonahgreenthal.com\">jonah@jonahgreenthal.com</a>)";
	}
	
	public static String cleanFilename(final String argS) {
		final StringBuilder lclSB = new StringBuilder(argS.length());
		
		boolean lclJustAppendedNonAlphanumeric = false;
		for (final char lclC : argS.toCharArray()) {
			if (lclC == '.' || Character.isLetterOrDigit(lclC)) {
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
	
	public static String nParameters(final int argN) {
		Validate.isTrue(argN > 0);
		return StringUtils.join(Collections.nCopies(argN, "?"), ',');
	}
	
	public static String makeList(final Object[] argInputs, final String argConjunction) {
		Validate.notNull(argInputs);
		final int lclLength = argInputs.length;
		
		if (lclLength == 0) {
			return "";
		} else if (lclLength == 1) {
			return argInputs[0].toString();
		} else if (lclLength == 2) {
			return argInputs[0].toString() + ' ' + argConjunction + ' '  + argInputs[1].toString();
		} else {
			final StringBuilder lclSB = new StringBuilder();
			
			boolean lclAnyContainsCommas = false;
			for (final Object lclO : argInputs) {
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
	
	public static String makeList(final Collection<?> argInputs, final String argConjunction) {
		Validate.notNull(argInputs);
		
		return makeList(argInputs.toArray(), argConjunction);
	}
	
	public static <T> String makeList(final Collection<T> argInputs, final Function<T, ?> argStringExtractor, final String argConjunction) {
		Validate.notNull(argInputs);
		Validate.notNull(argStringExtractor);
		
		final List<String> lclStrings = argInputs.stream().map(argStringExtractor::apply).map(String::valueOf).collect(Collectors.toList());
		
		return makeList(lclStrings.toArray(), argConjunction);
	}
	
	public static <T> String makeList(final T[] argInputs, final Function<T, ?> argStringExtractor, final String argConjunction) {
		return makeList(Arrays.asList(argInputs), argStringExtractor, argConjunction);
	}
	
	public static String makeList(final Object... argInputs) {
		return makeList(argInputs, "and");
	}
	
	public static String makeList(final Collection<?> argInputs) {
		return makeList(argInputs, "and");
	}
	
	public static <T> String makeList(final Collection<T> argInputs, final Function<T, ?> argStringExtractor) {
		return makeList(argInputs, argStringExtractor, "and");
	}
	
	public static <T> String makeList(final T[] argInputs, final Function<T, ?> argStringExtractor) {
		return makeList(argInputs, argStringExtractor, "and");
	}
	
	public static String makeOrdinal(int argValue) {
		int lclAbs = argValue >= 0 ? argValue : -1 * argValue;
		int lclRemainder = lclAbs % 10;
		
		String lclSuffix;
		if (lclAbs == 11 || lclAbs == 12 || lclAbs == 13) {
			lclSuffix = "th";
		} else if (lclRemainder == 1) {
			lclSuffix = "st";
		} else if (lclRemainder == 2) {
			lclSuffix = "nd";
		} else if (lclRemainder == 3) {
			lclSuffix = "rd";
		} else {
			lclSuffix = "th";
		}
		
		return argValue + lclSuffix;
	}
}
