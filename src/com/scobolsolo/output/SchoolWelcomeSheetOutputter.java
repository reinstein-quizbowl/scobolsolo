package com.scobolsolo.output;

import java.io.File;
import java.util.Iterator;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

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
		getWriter().println();
		getWriter().println("\\begin{document}");
		
		final SchoolRegistration[] lclRegistrations = getTournament().createSchoolRegistrationArray();
		Arrays.sort(lclRegistrations, SchoolRegistration.SchoolNameComparator.getInstance());
		
		for (final SchoolRegistration lclSR : lclRegistrations) {
			if (lclSR.getPlayerSet().isEmpty() == false) {
				getWriter().println("\\begin{center}");
				getWriter().println("\\TournamentTitle{" + escape(getTournament().getName()) + "}");
				getWriter().println("\\end{center}");
				getWriter().println();
				
				getWriter().println("Welcome, " + escape(lclSR.getSchool().getName()) + '!');
				getWriter().println();
				
				final int lclBuzzerCount = lclSR.getBuzzerSet().size();
				
				if (lclBuzzerCount == 0) {
					// nothing
				} else if (lclBuzzerCount == 1) {
					final Buzzer lclB = lclSR.getBuzzerSet().iterator().next();
					getWriter().println("We expect that you have brought one buzzer system. \\\\");
					
					if (lclB.isToBeSetUp()) {
						getWriter().println("Please set it up for two players in " + escape(lclB.getRoom().getName()) + '.');
					} else {
						if (getTournament().getControlRoom() == null) {
							getWriter().println("Please bring it to, but do not set it up in, the control room.");
						} else {
							getWriter().println("Please bring it to, but do not set it up in, " + getTournament().getControlRoom().getName() + '.');
						}
					}
				} else {
					getWriter().println("We expect that you have brought " + lclBuzzerCount + " buzzer systems. \\\\");
					
					final List<Buzzer> lclBuzzers = new ArrayList<>(lclSR.getBuzzerSet());
					lclBuzzers.sort(Buzzer.NameComparator.getInstance());
					final Iterator<Buzzer> lclBI = lclBuzzers.iterator();
					while (lclBI.hasNext()) {
						final Buzzer lclB = lclBI.next();
						if (lclB.hasMeaningfulName()) {
							if (lclB.isToBeSetUp()) {
								getWriter().print("Please set up ``" + escape(lclB.getName()) + "'' in " + escape(lclB.getRoom().getName()) + '.');
							} else {
								if (getTournament().getControlRoom() == null) {
									getWriter().print("Please bring ``" + escape(lclB.getName()) + "'' to, but do not set it up in, the control room.");
								} else {
									getWriter().print("Please bring ``" + escape(lclB.getName()) + "'' to, but do not set it up in, " + escape(getTournament().getControlRoom().getName()) + '.');
								}
							}
						} else {
							if (lclB.isToBeSetUp()) {
								getWriter().print("Please set one up for two players in " + escape(lclB.getRoom().getName()) + '.');
							} else {
								if (getTournament().getControlRoom() == null) {
									getWriter().print("Please bring one to, but do not set it up in, the control room.");
								} else {
									getWriter().print("Please bring one to, but do not set it up in, " + escape(getTournament().getControlRoom().getName()) + '.');
								}
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
		}
		
		getWriter().println("\\end{document}");
	}
}
