package com.scobolsolo.application;

import org.apache.commons.lang3.StringUtils;

import com.scobolsolo.persistence.BuzzerUserFacing;

/**
 * This interface may be changed at will.
 *
 * <p>This interface and the {@link BuzzerFactory} class are the only two automatically generated files for this type that are intended to be referenced in user code. Other automatically generated files package) are intended to be invisible to the user's code and may change (or disappear entirely) when newer versions of the Opal generating code is used.</p>
 *
 * @author		<a href="mailto:jonah@jonahgreenthal.com">Jonah Greenthal</a>
 */

public interface Buzzer extends BuzzerUserFacing {
	default boolean hasMeaningfulName() {
		if (StringUtils.isBlank(getName())) {
			return false;
		}
		
		if (getName().matches(getSchoolRegistration().getSchool().getName() + " \\d+")) {
			return false;
		} else if (getName().matches(getSchoolRegistration().getSchool().getShortName() + " \\d+")) {
			return false;
		} else if (getName().matches(getSchoolRegistration().getSchool().getVeryShortName() + " \\d+")) {
			return false;
		} else if (getName().matches(getSchoolRegistration().getSchool().getName() + " [A-Z]")) {
			return false;
		} else if (getName().matches(getSchoolRegistration().getSchool().getShortName() + " [A-Z]")) {
			return false;
		} else if (getName().matches(getSchoolRegistration().getSchool().getVeryShortName() + " [A-Z]")) {
			return false;
		} else {
			return true;
		}
	}
	
	default String getNameSafe() {
		if (StringUtils.isBlank(getName())) {
			long lclLowerIdBuzzersThisSchool = getSchoolRegistration().streamBuzzer()
				.filter(it -> it.getId() < this.getId())
				.count();
			
			return getSchoolRegistration().getSchool().getShortName() + ' ' + (lclLowerIdBuzzersThisSchool + 1);
		} else {
			return getName();
		}
	}
	
	default boolean isToBeSetUp() {
		return getRoom() != null && getRoom() != getSchoolRegistration().getTournament().getControlRoom();
	}
}
