package com.scobolsolo.output;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang3.Validate;

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
		getWriter().println();
		getWriter().println("\\begin{document}");
		
		Validate.isTrue(getPhase().isCardSystem());
		
		final List<Round> lclRounds = getPhase().getRounds();
		
		final List<Room> lclRooms = lclRounds.stream()
			.flatMap(Round::streamMatch)
			.map(Match::getRoom)
			.distinct()
			.sorted(new Room.PrimaryStaffNameComparator(getPhase()))
			.collect(Collectors.toList());
		
		final Card[] lclCards = getPhase().createCardArray();
		Arrays.sort(lclCards);
		final Card lclFirstCard = lclCards[0];
		final Card lclLastCard = lclCards[lclCards.length - 1];
		
		for (final Room lclRoom : lclRooms) {
			getWriter().println("\\begin{center}");
			getWriter().println("\\TournamentTitle{" + escape(getTournament().getName()) + "}");
			getWriter().println();
			getWriter().println("\\vspace{12pt}");
			getWriter().println();
			getWriter().println("\\RoomHeader{" + escape(lclRoom.getName()) + "}");
			getWriter().println();
			
			if (lclRoom.getStaffAssignmentSet().isEmpty() == false) {
				final StaffAssignment[] lclSAs = lclRoom.createStaffAssignmentArray();
				Arrays.sort(lclSAs, StaffAssignment.STAFF_COMPARATOR);
				for (final StaffAssignment lclSA : lclSAs) {
					if (lclSA.getPhase() == getPhase()) {
						if (lclSA.getNote() == null) {
							getWriter().println("\\Subtitle{" + escape(lclSA.getStaff().getContact().getName()) + ", " + escape(lclSA.getRole().getName()) + "}");
						} else {
							getWriter().println("\\Subtitle{" + escape(lclSA.getStaff().getContact().getName()) + ", " + escape(lclSA.getRole().getName()) + " (" + escape(lclSA.getNote()) + ")}");
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
				final List<Match> lclMatches = lclRoom.findMatches(lclRound);
				
				if (lclMatches.isEmpty()) {
					getWriter().print("\\RoundNumber{" + escape(lclRound.getShortName()) + "} & ");
					getWriter().print("\\RoundTime{" + escape(lclRound.getStartTime()) + "} & ");
					getWriter().print("\\multicolumn{2}{c}{\\NoMatchForRoom}");
					getWriter().println("\\tabularnewline");
				} else {
					for (final Match lclM : lclMatches) {
						getWriter().print("\\RoundNumber{" + escape(lclRound.getShortName()) + "} & ");
						getWriter().print("\\RoundTime{" + escape(lclRound.getStartTime()) + "} & ");
						
						if (lclM.isDual()) {
							getWriter().print("\\OpponentCard{" + escape(lclM.getWinningCard().getShortName()) + "} & ");
							getWriter().print("\\OpponentCard{" + escape(lclM.getLosingCard().getShortName()) + "}");
						} else {
							getWriter().print(" & ");
						}
						
						getWriter().println("\\tabularnewline");
					}
				}
				
				
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
