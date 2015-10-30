package com.scobolsolo.output;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import org.apache.commons.lang3.StringUtils;

import com.scobolsolo.application.Match;
import com.scobolsolo.application.Packet;
import com.scobolsolo.application.Phase;
import com.scobolsolo.application.Placement;
import com.scobolsolo.application.Room;
import com.scobolsolo.application.Round;
import com.scobolsolo.application.Staff;

public class ScoresheetOutputter extends PhaseSpecificLaTeXOutputter {
	private final boolean myAllRooms;
	
	public ScoresheetOutputter(final File argOutputFile, final Phase argP, final boolean argAllRooms) {
		super(argOutputFile, argP);
		
		myAllRooms = argAllRooms;
	}
	
	@Override
	public void outputInternal() {
		getWriter().println("\\documentclass[11pt]{scobolsolo}");
		getWriter().println("\\usepackage[top=.5in, bottom=.5in, left=.5in, right=.5in]{geometry}");
		getWriter().println("\\newcommand{\\vstrut}{\\rule{0pt}{0.25in}}");
		getWriter().println("\\setlength{\\tabcolsep}{1pt}");
		getWriter().println();
		getWriter().println("\\begin{document}");
		
		final List<Room> lclRooms = getPhase().getGameRooms(); // comes in sorted
		if (!isAllRooms()) {
			lclRooms.removeIf(argRoom -> argRoom.hasAnyAssignedStaffWithComputer(getPhase()));
		}
		
		// Rooms:
		for (final Room lclRoom : lclRooms) {
			final Match[] lclMatches = lclRoom.createMatchArray();
			Arrays.sort(lclMatches);
			
			// Matches:
			for (final Match lclM : lclMatches) {
				final Round lclRound = lclM.getRound();
				
				getWriter().println("\\begin{center}");
				getWriter().println("\\TournamentTitle{" + escape(getTournament().getName()) + "}");
				getWriter().println();
				
				List<String> lclSubheadChunks = new ArrayList<>(4);
				lclSubheadChunks.add("Round: " + escape(lclRound.getShortName()));
				lclSubheadChunks.add("Room: " + escape(lclRoom.getShortName()));
				
				Staff lclLikelyModerator = lclM.determineLikelyModerator();
				if (lclLikelyModerator != null) {
					lclSubheadChunks.add("Moderator: " + escape(lclLikelyModerator.getName()));
				}
				
				if (lclRound.getRoundGroup().getPhase().isCardSystem()) {
					lclSubheadChunks.add("Cards: " + escape(lclM.getWinningCard().getShortName()) + " \\textit{\\&} " + escape(lclM.getLosingCard().getShortName()));
				}
				
				getWriter().println(StringUtils.join(lclSubheadChunks, "\\qquad\\qquad "));
				
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
				
				final Packet lclPacket = lclRound.getPacket();
				boolean lclJustDidTiebreaker = false;
				
				Placements:
				for (final Placement lclPL : lclPacket.getAllPlacements()) {
					if (lclPL.isTiebreaker()) {
						if (getTournament().isTiebreakerSuddenDeath() && lclJustDidTiebreaker) {
							continue Placements;
						}
						
						getWriter().println("\\vstrut & & & & \\textsc{(tiebreaker)} & & & & \\tabularnewline");
						getWriter().println("\\hline");
						lclJustDidTiebreaker = true;
					} else {
						lclJustDidTiebreaker = false;
						
						getWriter().println("\\vstrut & & & & \\textbf{" + lclPL.getNumberString() + "} & & & & \\tabularnewline");
						
						getWriter().println("\\hline");
						
						if (lclPL.isScorecheckAfter()) {
							getWriter().println("\\vstrut & & & & \\textsc{score check} & & & & \\tabularnewline");
							getWriter().println("\\hline");
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
	
	public boolean isAllRooms() {
		return myAllRooms;
	}
}
