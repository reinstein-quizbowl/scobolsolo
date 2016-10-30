package com.scobolsolo;

import java.util.List;
import java.util.ArrayList;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Validate;

import com.opal.TransactionContext;
import com.opal.Unifier;

import com.scobolsolo.application.Contact;
import com.scobolsolo.application.ContactFactory;
import com.scobolsolo.application.Player;
import com.scobolsolo.application.SchoolRegistration;
import com.scobolsolo.application.Staff;
import com.scobolsolo.application.Tournament;

public class UnifyContacts extends Standalone {
	public static void main(final String[] args) throws Exception {
		try {
			Standalone.initialize();
			
			run(args);
		} finally {
			Standalone.shutdown();
		}
	}
	
	public static void run(final String[] args) throws Exception {
		Validate.isTrue(args.length >= 2);
		
		Contact lclGood = null;
		List<Contact> lclBads = new ArrayList<>(args.length - 1);
		
		for (int lclI = 0; lclI < args.length; ++lclI) {
			String lclIdString = StringUtils.trimToNull(args[lclI]);
			if (lclIdString == null) {
				continue;
			}
			
			try {
				int lclId = Integer.parseInt(lclIdString);
				Contact lclC = ContactFactory.getInstance().forId(lclId);
				Validate.notNull(lclC, lclId + " is not a valid id for any Contact");
				
				if (lclI == 0) {
					lclGood = lclC;
				} else {
					lclBads.add(lclC);
				}
			} catch (NumberFormatException lclE) {
				throw new IllegalArgumentException("Couldn't interpret \"" + lclIdString + "\" as an int", lclE);
			}
		}
		
		Validate.notNull(lclGood);
		Validate.notEmpty(lclBads);
		
		for (Contact lclBad : lclBads) {
			try (TransactionContext lclTC = TransactionContext.createAndActivate()) {
				unify(lclGood, lclBad);
				
				lclTC.complete();
			}
		}
	}
	
	private static void unify(Contact argGood, Contact argBad) {
		Validate.notNull(argGood);
		Validate.notNull(argBad);
		Validate.isTrue(TransactionContext.hasActive());
		
		new Unifier<>(argGood, argBad)
			.firstNonNull("SortBy", "EmailAddress", "AdvancePhone", "DayOfPhone", "Address")
			.concatenate("Note", "\n\n")
			.or("Active")
			.mergeChildren("MainSchoolRegistration", SchoolRegistration.class)
			.mergeChildren("Player", Player.class)
			.mergeChildren("Staff", Staff.class)
			.mergeChildren("TournamentDirectorTournament", Tournament.class)
			.complete();
	}
}
