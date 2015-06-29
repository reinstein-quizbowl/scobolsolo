package com.scobolsolo.application;

import org.apache.commons.lang3.Validate;

import com.scobolsolo.persistence.DiffUserFacing;

/**
 * This interface may be changed at will.
 *
 * <p>This interface and the {@link DiffFactory} class are the only two automatically generated files for this type that are intended to be referenced in user code. Other automatically generated files package) are intended to be invisible to the user's code and may change (or disappear entirely) when newer versions of the Opal generating code is used.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */

public interface Diff extends DiffUserFacing, Comparable<Diff> {
	@Override
	default public int compareTo(Diff argD) {
		Validate.notNull(argD);
		
		if (argD.getQuestion() == getQuestion()) {
			return getTimestamp().compareTo(argD.getTimestamp());
		} else {
			return 0;
		}
	}
}