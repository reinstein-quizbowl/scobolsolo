package com.scobolsolo.paperwork;

import java.io.File;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang3.Validate;

import com.google.common.collect.RowSortedTable;
import com.google.common.collect.TreeBasedTable;

import com.scobolsolo.application.Match;
import com.scobolsolo.application.Phase;
import com.scobolsolo.application.Room;
import com.scobolsolo.application.Round;

public class MasterByRoomOutputter extends PhaseSpecificLaTeXOutputter {
	public MasterByRoomOutputter(final File argOutputFile, final Phase argP) {
		super(argOutputFile, argP);
	}
	
	@Override
	public void outputInternal() {
		getWriter().println("\\documentclass[10pt]{scobolsolo}");
		getWriter().println("\\usepackage[landscape, top=.5in, bottom=.3in, left=.4in, right=.4in]{geometry}");
		getWriter().println("\\setlength\\RegularSize{9pt}");
		getWriter().println("\\setlength\\RegularLH{12pt}");
		getWriter().println("\\setlength\\tabcolsep{1pt}");
		getWriter().println();
		getWriter().println("\\begin{document}");
		
		Validate.isTrue(getPhase().isCardSystem());
		final List<Round> lclRounds = getPhase().getRounds();
		
		final RowSortedTable<Room, Round, Match> lclTable = TreeBasedTable.create(Room.SequenceComparator.getInstance(), Round.StandardComparator.getInstance());
		for (Round lclRound : lclRounds) {
			for (Match lclM : lclRound.createMatchArray()) {
				lclTable.put(lclM.getRoom(), lclRound, lclM);
			}
		}
		
		getWriter().println("\\begin{center}");
		getWriter().println("\\TournamentTitle{" + escape(getTournament().getName()) + "}");
		getWriter().println();
		getWriter().println("\\vspace{12pt}");
		
		getWriter().println("\\rowcolors*{2}{gray}{white}");
		getWriter().print("\\begin{longtable}{|C{1.2cm}|");
		for (@SuppressWarnings("unused") final Round lclR : lclRounds) {
			getWriter().print("C{0.8cm}C{0.8cm}|");
		}
		getWriter().println("}");
		getWriter().println("\\hline");
		
		getWriter().print("\\rowcolor[gray]{0}  \\ColumnHeader{Room} & ");
		Iterator<Round> lclRI = lclRounds.iterator();
		while (lclRI.hasNext()) {
			final Round lclR = lclRI.next();
			getWriter().print("\\multicolumn{2}{c|}{\\ColumnHeader{" + lclR.getName() + "}}");
			
			if (lclRI.hasNext()) {
				getWriter().print(" & ");
			}
		}
		getWriter().println(" \\tabularnewline");
		
		getWriter().print("\\rowcolor[gray]{0} & ");
		lclRI = lclRounds.iterator();
		while (lclRI.hasNext()) {
			@SuppressWarnings("unused") final Round lclR = lclRI.next();
			getWriter().print(" \\SmallColumnHeader{W} & \\SmallColumnHeader{L}");
			
			if (lclRI.hasNext()) {
				getWriter().print(" & ");
			}
		}
		getWriter().println(" \\tabularnewline");
		getWriter().println("\\hline");
		getWriter().println("\\endhead");
		getWriter().println("\\hline");
		getWriter().println("\\endfoot");
		
		for (final Room lclRoom : lclTable.rowKeySet()) {
			getWriter().print(lclRoom.getShortName() + " & ");
			
			lclRI = lclRounds.iterator();
			while (lclRI.hasNext()) {
				final Round lclRound = lclRI.next();
				
				final Match lclM = lclTable.get(lclRoom, lclRound); // may be null, indicating a bye
				if (lclM == null) {
					getWriter().print(" - & - ");
				} else {
					getWriter().print(escape(lclM.getWinningCard().getShortName()) + " & " + escape(lclM.getLosingCard().getShortName()));
				}
				
				if (lclRI.hasNext()) {
					getWriter().print(" & ");
				}
			}
			
			getWriter().println("\\tabularnewline");
		}
		
		getWriter().println("\\end{longtable}");
		getWriter().println("\\end{center}");
		getWriter().println("\\end{document}");
	}
}
