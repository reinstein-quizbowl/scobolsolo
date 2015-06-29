package com.scobolsolo.application;

import java.util.SortedSet;
import java.util.TreeSet;
import java.util.function.Predicate;

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
			return null;
		} else {
			return lclDiffs.last();
		}
	}
	
	default int getNextRevisionNumber() {
		return 1 + streamDiff().mapToInt(Diff::getRevisionNumber).max().orElse(0);
	}
	
	
	public static class StatusFilter implements Predicate<QuestionStatus> { // This is a static class because we want it to be able to exist without an instance of Question, for use in an OpalForm that is creating a new Question
		private final Account myUser;
		private final QuestionStatus myStartingStatus;
		
		public StatusFilter(Account argUser, Question argQ) {
			myUser = Validate.notNull(argUser);
			
			if (argQ == null) { // a new Question
				myStartingStatus = null;
			} else {
				myStartingStatus = argQ.getStatus();
			}
		}
		
		public Account getUser() {
			return myUser;
		}
		
		public QuestionStatus getStartingStatus() {
			return myStartingStatus;
		}
		
		@Override
		public boolean test(QuestionStatus argNewStatus) {
			Validate.notNull(argNewStatus);
			
			if (getUser().isAdministrator()) {
				return true;
			} else if (!getUser().isWriter()) {
				return false;
			} else {
				if (getStartingStatus() == null) {
					if (argNewStatus == QuestionStatusFactory.ANSWER_CHOSEN()) {
						return true;
					} else if (argNewStatus == QuestionStatusFactory.DRAFTED()) {
						return true;
					} else if (argNewStatus == QuestionStatusFactory.READY_FOR_REVIEW()) {
						return true;
					} else if (argNewStatus == QuestionStatusFactory.APPROVED()) {
						return false;
					} else {
						throw new IllegalArgumentException("Unknown target status " + argNewStatus.getCode());
					}
				} else if (getStartingStatus() == QuestionStatusFactory.ANSWER_CHOSEN()) {
					if (argNewStatus == QuestionStatusFactory.ANSWER_CHOSEN()) {
						return true;
					} else if (argNewStatus == QuestionStatusFactory.DRAFTED()) {
						return true;
					} else if (argNewStatus == QuestionStatusFactory.READY_FOR_REVIEW()) {
						return true;
					} else if (argNewStatus == QuestionStatusFactory.APPROVED()) {
						return false;
					} else {
						throw new IllegalArgumentException("Unknown target status " + argNewStatus.getCode());
					}
				} else if (getStartingStatus() == QuestionStatusFactory.DRAFTED()) {
					if (argNewStatus == QuestionStatusFactory.ANSWER_CHOSEN()) {
						return true;
					} else if (argNewStatus == QuestionStatusFactory.DRAFTED()) {
						return true;
					} else if (argNewStatus == QuestionStatusFactory.READY_FOR_REVIEW()) {
						return true;
					} else if (argNewStatus == QuestionStatusFactory.APPROVED()) {
						return false;
					} else {
						throw new IllegalArgumentException("Unknown target status " + argNewStatus.getCode());
					}
				} else if (getStartingStatus() == QuestionStatusFactory.READY_FOR_REVIEW()) {
					if (argNewStatus == QuestionStatusFactory.ANSWER_CHOSEN()) {
						return true;
					} else if (argNewStatus == QuestionStatusFactory.DRAFTED()) {
						return true;
					} else if (argNewStatus == QuestionStatusFactory.READY_FOR_REVIEW()) {
						return true;
					} else if (argNewStatus == QuestionStatusFactory.APPROVED()) {
						return true;
					} else {
						throw new IllegalArgumentException("Unknown target status " + argNewStatus.getCode());
					}
				} else if (getStartingStatus() == QuestionStatusFactory.APPROVED()) {
					return false;
				} else {
					throw new IllegalArgumentException("Unknown starting status " + getStartingStatus().getCode());
				}
			}
		}
	}
}
