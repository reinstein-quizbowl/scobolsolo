package com.scobolsolo.application;

import java.util.Objects;

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
	default public int compareTo(final Diff that) {
		Validate.notNull(that);
		
		if (this.getQuestion() == that.getQuestion()) {
			return this.getRevisionNumber() - that.getRevisionNumber();
		} else {
			return 0;
		}
	}
	
	default public boolean sameContentAs(final Diff that) {
		Validate.notNull(that);
		
		return this.getQuestion() == that.getQuestion()
			&& Objects.equals(this.getText(), that.getText())
			&& Objects.equals(this.getAnswer(), that.getAnswer())
			&& Objects.equals(this.getNote(), that.getNote())
			&& Objects.equals(this.getRemark(), that.getRemark())
			&& Objects.equals(this.getStatus(), that.getStatus())
			&& Objects.equals(this.getCategory(), that.getCategory());
	}
	
	default public Diff getPrevious() {
		return getQuestion().getRevisionNumber(this.getRevisionNumber() - 1);
	}
	
	default public Diff getNext() {
		return getQuestion().getRevisionNumber(this.getRevisionNumber() + 1);
	}
}
