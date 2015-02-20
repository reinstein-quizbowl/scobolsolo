package com.scobolsolo.paperwork;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import com.scobolsolo.application.Match;
import com.scobolsolo.application.Packet;
import com.scobolsolo.application.Phase;
import com.scobolsolo.application.Placement;
import com.scobolsolo.application.Room;
import com.scobolsolo.application.Round;

public class ScoresheetOutputter extends PhaseSpecificLaTeXOutputter {
	public ScoresheetOutputter(final File argOutputFile, final Phase argP) {
		super(argOutputFile, argP);
	}
	
	@Override
	public void outputInternal() {
		getWriter().println("\\documentclass[11pt]{scobolsolo}");
		getWriter().println("\\usepackage[top=.5in, bottom=.5in, left=.5in, right=.5in]{geometry}");
		getWriter().println("\\newcommand{\\vstrut}{\\rule{0pt}{0.25in}}");
		getWriter().println("\\setlength{\\tabcolsep}{1pt}");
		getWriter().println();
		getWriter().println("\\begin{document}");
		
		final List<Room> lclRooms = new ArrayList<>(getTournament().getRoomCount());
		getTournament().acquireRoom(lclRooms);
		lclRooms.removeIf(argRoom -> !argRoom.isGameRoom());
		lclRooms.sort(Room.SequenceComparator.getInstance());
		
		// Rooms:
		for (final Room lclRoom : lclRooms) {
			final Match[] lclMatches = lclRoom.createMatchArray();
			Arrays.sort(lclMatches, Match.RoundComparator.getInstance());
			
			// Matches:
			for (final Match lclM : lclMatches) {
				final Round lclRound = lclM.getRound();
				
				getWriter().println("\\begin{center}");
				getWriter().println("\\TournamentTitle{" + escape(getTournament().getName()) + "}");
				getWriter().println();
				getWriter().println("Round: " + escape(lclRound.getShortName()));
				getWriter().println("\\qquad\\qquad");
				getWriter().println("Room: " + escape(lclRoom.getShortName()));
				getWriter().println("\\qquad\\qquad");
				if (lclRound.getRoundGroup().getPhase().isCardSystem()) {
					getWriter().println("Cards: " + escape(lclM.getWinningCard().getShortName()) + " \\textit{\\&} " + escape(lclM.getLosingCard().getShortName()));
				}
				getWriter().println();
				getWriter().println("\\textit{If a replacement question is used, clearly indicate what question was replaced.} \\\\");
				getWriter().println();
				
				getWriter().println("\\begin{tabular}{|C{0.60in}|C{0.60in}|C{0.60in}|C{0.60in}|C{1.5in}|C{0.60in}|C{0.60in}|C{0.60in}|C{0.60in}|}");
				getWriter().println("\\hline");
				getWriter().println("\\multicolumn{4}{|c|}{ } & \\vstrut \\textbf{Name} & \\multicolumn{4}{c|}{ } \\tabularnewline");
				getWriter().println("\\hline");
				getWriter().println("\\multicolumn{4}{|c|}{ } & \\vstrut \\textbf{School} & \\multicolumn{4}{c|}{ } \\tabularnewline");
				getWriter().println("\\hline");
				getWriter().println("\\small Correct & \\small Interrupt & \\small Incorrect & \\small No Try & \\# & \\small Correct & \\small Interrupt & \\small Incorrect & \\small No Try \\tabularnewline");
				getWriter().println("\\hline");
				
				final Packet[] lclPackets = lclRound.createPacketArray();
				final boolean lclMultiplePackets = lclPackets.length > 1;
				if (lclMultiplePackets) {
					Arrays.sort(lclPackets, Packet.StandardComparator.getInstance());
				}
				
				// Packets:
				for (final Packet lclPacket : lclPackets) {
					final Placement[] lclPlacements = lclPacket.createPlacementArray();
					Arrays.sort(lclPlacements, Placement.StandardComparator.getInstance());
					
					boolean lclJustDidTiebreaker = false;
					
					Placements:
					for (final Placement lclPL : lclPlacements) {
						if (lclPL.isTiebreaker()) {
							if (getTournament().isTiebreakerSuddenDeath() && lclJustDidTiebreaker) {
								continue Placements;
							}
							
							getWriter().println("\\vstrut & & & & \\textsc{(tiebreaker)} & & & & \\tabularnewline");
							getWriter().println("\\hline");
							lclJustDidTiebreaker = true;
						} else {
							lclJustDidTiebreaker = false;
							
							if (lclMultiplePackets) {
								getWriter().println("\\vstrut & & & & \\textbf{" + escape(lclPacket.getName()) + "\\#" + lclPL.getSequence() + "} & & & & \\tabularnewline");
							} else {
								getWriter().println("\\vstrut & & & & \\textbf{" + lclPL.getSequence() + "} & & & & \\tabularnewline");
							}
							
							getWriter().println("\\hline");
							
							if (lclPL.isScorecheckAfter()) {
								getWriter().println("\\vstrut & & & & \\textsc{score check} & & & & \\tabularnewline");
								getWriter().println("\\hline");
							}
						}
					}
				}
				
				getWriter().println("\\vstrut & & & & \\textbf{TOTAL} & & & & \\tabularnewline");
				getWriter().println("\\hline");
				
				getWriter().println("\\end{tabular}");
				getWriter().println("\\end{center}");
				getWriter().println();
				getWriter().println("\\newpage");
			}
		}
		
		getWriter().println("\\end{document}");
	}
}
