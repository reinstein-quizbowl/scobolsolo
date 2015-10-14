package com.scobolsolo.output;

import java.io.File;
import java.util.Iterator;
import java.util.Arrays;

import com.scobolsolo.application.Buzzer;
import com.scobolsolo.application.SchoolRegistration;
import com.scobolsolo.application.Tournament;

public class SchoolWelcomeSheetOutputter extends TournamentSpecificLaTeXOutputter {
	public SchoolWelcomeSheetOutputter(final File argOutputFile, final Tournament argT) {
		super(argOutputFile, argT);
	}
	
	@Override
	public void outputInternal() {
		getWriter().println("\\documentclass[11pt]{scobolsolo}");
		getWriter().println("\\usepackage[top=.5in, bottom=.5in, left=.5in, right=.5in]{geometry}");
		getWriter().println();
		getWriter().println("\\begin{document}");
		
		final SchoolRegistration[] lclRegistrations = getTournament().createSchoolRegistrationArray();
		Arrays.sort(lclRegistrations, SchoolRegistration.SchoolNameComparator.getInstance());
		
		for (final SchoolRegistration lclSR : lclRegistrations) {
			getWriter().println("\\begin{center}");
			getWriter().println("\\TournamentTitle{" + escape(getTournament().getName()) + "}");
			getWriter().println("\\end{center}");
			getWriter().println();
			
			getWriter().println("Welcome, " + escape(lclSR.getSchool().getName()) + '!');
			getWriter().println();
			
			final int lclBuzzerCount = lclSR.getBuzzerCount();
			
			if (lclBuzzerCount == 0) {
				// nothing
			} else if (lclBuzzerCount == 1) {
				Buzzer lclB = lclSR.createBuzzerArray()[0];
				getWriter().println("We expect that you have brought one buzzer system. \\\\");
				
				if (lclB.getRoom() == null) {
					if (getTournament().getControlRoom() == null) {
						getWriter().println("Please bring it to, but do not set it up in, the control room.");
					} else {
						getWriter().println("Please bring it to, but do not set it up in, " + getTournament().getControlRoom().getName() + '.');
					}
				} else {
					getWriter().println("Please set it up for two players in " + escape(lclSR.createBuzzerIterator().next().getRoom().getName()) + '.');
				}
			} else {
				getWriter().println("We expect that you have brought " + lclBuzzerCount + " buzzer systems. \\\\");
				
				final Iterator<Buzzer> lclBI = lclSR.createBuzzerIterator();
				while (lclBI.hasNext()) {
					final Buzzer lclB = lclBI.next();
					if (lclB.hasMeaningfulName()) {
						if (lclB.getRoom() == null) {
							if (getTournament().getControlRoom() == null) {
								getWriter().print("Please bring ``" + escape(lclB.getName()) + "'' to, but do not set it up in, the control room.");
							} else {
								getWriter().print("Please bring ``" + escape(lclB.getName()) + "'' to, but do not set it up in, " + escape(getTournament().getControlRoom().getName()) + '.');
							}
						} else {
							getWriter().print("Please set up ``" + escape(lclB.getName()) + "'' in " + escape(lclB.getRoom().getName()) + '.');
						}
					} else {
						if (lclB.getRoom() == null) {
							if (getTournament().getControlRoom() == null) {
								getWriter().print("Please bring one to, but do not set it up in, the control room.");
							} else {
								getWriter().print("Please bring one to, but do not set it up in, " + escape(getTournament().getControlRoom().getName()) + '.');
							}
						} else {
							getWriter().print("Please set one up for two players in " + escape(lclB.getRoom().getName()) + '.');
						}
					}
					
					if (lclBI.hasNext()) {
						getWriter().println(" \\\\");
					} else {
						getWriter().println();
					}
				}
			}
			getWriter().println();
			
			if (getTournament().getSchoolMessage() != null) {
				getWriter().println(getTournament().getSchoolMessage()); // Not escaped; this is given in LaTeX
				getWriter().println();
			}
			
			getWriter().println("\\newpage");
		}
		
		getWriter().println("\\end{document}");
	}
}
