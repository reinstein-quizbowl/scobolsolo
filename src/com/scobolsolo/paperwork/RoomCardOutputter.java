package com.scobolsolo.paperwork;

import java.io.File;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.Validate;

import com.google.common.collect.RowSortedTable;
import com.google.common.collect.TreeBasedTable;

import com.scobolsolo.application.Card;
import com.scobolsolo.application.Match;
import com.scobolsolo.application.Phase;
import com.scobolsolo.application.Room;
import com.scobolsolo.application.Round;
import com.scobolsolo.application.StaffAssignment;

public class RoomCardOutputter extends PhaseSpecificLaTeXOutputter {
	public RoomCardOutputter(final File argOutputFile, final Phase argP) {
		super(argOutputFile, argP);
	}
	
	@Override
	public void outputInternal() {
		getWriter().println("\\documentclass[11pt]{scobolsolo}");
		getWriter().println("\\usepackage[top=.5in, bottom=.5in, left=.5in, right=.5in]{geometry}");
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
		
		final Card[] lclCards = getPhase().createCardArray();
		Arrays.sort(lclCards, Card.SequenceComparator.getInstance());
		final Card lclFirstCard = lclCards[0];
		final Card lclLastCard = lclCards[lclCards.length - 1];
		
		for (final Room lclRoom : lclTable.rowKeySet()) {
			getWriter().println("\\begin{center}");
			getWriter().println("\\TournamentTitle{" + escape(getTournament().getName()) + "}");
			getWriter().println();
			getWriter().println("\\vspace{12pt}");
			getWriter().println();
			getWriter().println("\\RoomHeader{" + escape(lclRoom.getName()) + "}");
			getWriter().println();
			
			if (lclRoom.getStaffAssignmentCount() > 0) {
				StaffAssignment[] lclSAs = lclRoom.createStaffAssignmentArray();
				Arrays.sort(lclSAs, StaffAssignment.StaffNameComparator.getInstance());
				for (StaffAssignment lclSA : lclSAs) {
					if (lclSA.getPhase() == getPhase()) {
						if (lclSA.getNote() == null) {
							getWriter().println("\\Subtitle{" + escape(lclSA.getStaff().getContact().getName()) + ", " + escape(lclSA.getStaffRole().getName()) + "}");
						} else {
							getWriter().println("\\Subtitle{" + escape(lclSA.getStaff().getContact().getName()) + ", " + escape(lclSA.getStaffRole().getName()) + " (" + escape(lclSA.getNote()) + ")}");
						}
						getWriter().println();
					}
				}
			}
			
			getWriter().println("\\vspace{12pt}");
			getWriter().println();
			getWriter().println("\\CardTradingInstructionsForRoom{" + escape(lclFirstCard.getShortName()) + "}{" + escape(lclLastCard.getShortName()) + "}");
			getWriter().println();
			getWriter().println("\\vspace{12pt}");
			
			getWriter().println("\\rowcolors*{2}{gray}{white}");
			getWriter().println("\\begin{tabular}{C{3cm}C{3cm}C{3cm}C{3cm}}");
			getWriter().println("\\rowcolor[gray]{0} \\ColumnHeader{Round} & \\ColumnHeader{Time} & \\ColumnHeader{Winning Card} & \\ColumnHeader{Losing Card} \\tabularnewline");
			
			for (final Round lclRound : lclRounds) {
				final Match lclM = lclTable.get(lclRoom, lclRound); // may be null, indicating a bye
				
				getWriter().print("\\RoundNumber{" + escape(lclRound.getShortName()) + "} & ");
				getWriter().print("\\RoundTime{" + escape(lclRound.getStartTime()) + "} & ");
				
				if (lclM == null) {
					getWriter().print("\\multicolumn{2}{c}{\\NoMatchForRoom}");
				} else {
					if (lclM.isDual()) {
						getWriter().print("\\OpponentCard{" + escape(lclM.getWinningCard().getShortName()) + "} & ");
						getWriter().print("\\OpponentCard{" + escape(lclM.getLosingCard().getShortName()) + "}");
					} else {
						getWriter().print(" & ");
					}
				}
				
				getWriter().println("\\tabularnewline");
				
				if (lclRound.isLunchAfter()) {
					getWriter().println("\\RoomLunchLine");
				}
			}
			
			getWriter().println("\\end{tabular}");
			
			getWriter().println("\\end{center}");
			getWriter().println();
			getWriter().println("\\newpage");
		}
		
		getWriter().println("\\end{document}");
	}
}
