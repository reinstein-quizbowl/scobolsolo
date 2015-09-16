package com.scobolsolo.paperwork;

import java.io.File;
import java.util.Arrays;

import com.scobolsolo.application.Player;
import com.scobolsolo.application.SchoolRegistration;
import com.scobolsolo.application.Tournament;

public class PlayerWelcomeSheetOutputter extends TournamentSpecificLaTeXOutputter {
	public PlayerWelcomeSheetOutputter(final File argOutputFile, final Tournament argT) {
		super(argOutputFile, argT);
	}
	
	@Override
	public void outputInternal() {
		getWriter().println("\\documentclass[11pt]{scobolsolo}");
		getWriter().println("\\usepackage[top=.5in, bottom=.3in, left=.5in, right=.5in]{geometry}");
		getWriter().println();
		getWriter().println("\\begin{document}");
		
		final SchoolRegistration[] lclRegistrations = getTournament().createSchoolRegistrationArray();
		Arrays.sort(lclRegistrations, SchoolRegistration.SchoolNameComparator.getInstance());
		
		for (final SchoolRegistration lclSR : lclRegistrations) {
			final Player[] lclPlayers = lclSR.createPlayerArray();
			Arrays.sort(lclPlayers);
			
			for (final Player lclP : lclPlayers) {
				getWriter().println("\\begin{center}");
				getWriter().println("\\TournamentTitle{" + escape(getTournament().getName()) + "}");
				getWriter().println("\\end{center}");
				getWriter().println();
				
				if (lclP.getInitialCard() == null) {
					getWriter().println("Welcome, " + escape(lclP.getContact().getName()) + '!');
				} else {
					getWriter().println("Welcome, " + escape(lclP.getContact().getName()) + " (initial card: " + escape(lclP.getInitialCard().getShortName()) + ")!");
				}
				getWriter().println();
				
				if (getTournament().getPlayerMessage() != null) {
					getWriter().println(getTournament().getPlayerMessage()); // Not escaped; this is given in LaTeX
					getWriter().println();
				}
				
				getWriter().println("\\vfill\\hfill\\tiny " + escape(lclSR.getSchool().getName()) + "\\normalsize");
				getWriter().println("\\newpage");
			}
			
		}
		
		getWriter().println("\\end{document}");
	}
}
