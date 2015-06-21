package com.scobolsolo.application;

import java.util.SortedSet;
import java.util.TreeSet;

import org.apache.commons.lang3.Validate;

import com.scobolsolo.persistence.QuestionUserFacing;

/**
 * This interface may be changed at will.
 *
 * <p>This interface and the {@link QuestionFactory} class are the only two automatically generated files for this type that are intended to be referenced in user code. Other automatically generated files package) are intended to be invisible to the user's code and may change (or disappear entirely) when newer versions of the Opal generating code is used.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */

public interface Question extends QuestionUserFacing {
	static final org.apache.log4j.Logger ourLogger = org.apache.log4j.Logger.getLogger(Question.class);
	
	default boolean isUsed() {
		return getPlacementCount() > 0;
	}
	
	default boolean isUnused() {
		return getPlacementCount() == 0;
	}
	
	default SortedSet<Diff> getDiffs() {
		return acquireDiff(new TreeSet<>());
	}
	
	default Diff getLastChange() {
		SortedSet<Diff> lclDiffs = getDiffs();
		if (lclDiffs.isEmpty()) {
			ourLogger.debug("No diffs");
			return null;
		} else {
			ourLogger.debug("Diffs: " + lclDiffs);
			return lclDiffs.last();
		}
	}
	
	default int getNextRevisionNumber() {
		if (isNew()) {
			return 1;
		} else {
			return getDiffCount() + 1; // This assumes that revision numbers have been assigned consecutively. There might be some kind of nasty race condition in here.
		}
	}
}
