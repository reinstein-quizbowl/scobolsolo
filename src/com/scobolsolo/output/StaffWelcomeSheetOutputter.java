package com.scobolsolo.output;

import java.io.File;
import java.util.Arrays;

import com.scobolsolo.application.Staff;
import com.scobolsolo.application.StaffAssignment;
import com.scobolsolo.application.Tournament;

public class StaffWelcomeSheetOutputter extends TournamentSpecificLaTeXOutputter {
	public StaffWelcomeSheetOutputter(final File argOutputFile, final Tournament argT) {
		super(argOutputFile, argT);
	}
	
	@Override
	public void outputInternal() {
		getWriter().println("\\documentclass[11pt]{scobolsolo}");
		getWriter().println("\\usepackage[top=.5in, bottom=.5in, left=.5in, right=.5in]{geometry}");
		getWriter().println();
		getWriter().println("\\begin{document}");
		
		final Staff[] lclStaffers = getTournament().createStaffArray();
		Arrays.sort(lclStaffers, Staff.SchoolNameThenStaffNameComparator.getInstance());
		
		for (final Staff lclS : lclStaffers) {
			getWriter().println("\\begin{center}");
			getWriter().println("\\TournamentTitle{" + escape(getTournament().getName()) + "}");
			getWriter().println("\\end{center}");
			getWriter().println();
			
			getWriter().println("Welcome, " + escape(lclS.getContact().getName()) + '!');
			getWriter().println();
			
			if (lclS.getStaffAssignmentCount() == 0) {
				if (getTournament().getControlRoom() == null) {
					getWriter().print("You have not yet been given an assignment. Please go to the control room to find out what to do.");
				} else {
					getWriter().print("You have not yet been given an assignment. Please go to " + escape(getTournament().getControlRoom().getName()) + " to find out what to do.");
				}
				getWriter().println();
			} else if (lclS.getStaffAssignmentCount() == 1) {
				StaffAssignment lclSA = lclS.createStaffAssignmentIterator().next();
				if (lclSA.getNote() == null) {
					getWriter().println("You are assigned to " + escape(lclSA.getRoom().getName()) + " (" + escape(lclSA.getRole().getName()) + ") during " + escape(lclSA.getPhase().getName()) + '.');
				} else {
					getWriter().println("You are assigned to " + escape(lclSA.getRoom().getName()) + " (" + escape(lclSA.getRole().getName()) + ") during " + escape(lclSA.getPhase().getName()) + " (" + escape(lclSA.getNote()) + ").");
				}
				getWriter().println();
			} else {
				getWriter().println("You have the following assignments:");
				getWriter().println("\\begin{compactitem}");
				for (StaffAssignment lclSA : lclS.createStaffAssignmentArray()) {
					if (lclSA.getNote() == null) {
						getWriter().println("\\item " + escape(lclSA.getRoom().getName()) + " (" + escape(lclSA.getRole().getName()) + ") during " + escape(lclSA.getPhase().getName()));
					} else {
						getWriter().println("\\item " + escape(lclSA.getRoom().getName()) + " (" + escape(lclSA.getRole().getName()) + ") during " + escape(lclSA.getPhase().getName()) + " (" + escape(lclSA.getNote()) + ")");
					}
				}
				getWriter().println("\\end{compactitem}");
			}
			getWriter().println();
			
			if (getTournament().getStaffMessage() != null) {
				getWriter().println(getTournament().getStaffMessage()); // Not escaped; this is given in LaTeX
				getWriter().println();
			}
			
			if (lclS.getSchoolRegistration() != null) {
				getWriter().println("\\vfill\\hfill\\tiny " + escape(lclS.getSchoolRegistration().getSchool().getName()) + "\\normalsize");
			}
			getWriter().println("\\newpage");
		}
		
		getWriter().println("\\end{document}");
	}
}
