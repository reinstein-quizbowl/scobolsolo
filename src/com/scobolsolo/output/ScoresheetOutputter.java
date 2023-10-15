package com.scobolsolo.output;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Validate;

import com.scobolsolo.application.Match;
import com.scobolsolo.application.Packet;
import com.scobolsolo.application.Phase;
import com.scobolsolo.application.Placement;
import com.scobolsolo.application.Room;
import com.scobolsolo.application.Round;
import com.scobolsolo.application.Staff;

public class ScoresheetOutputter extends PhaseSpecificLaTeXOutputter {
	private static final String THIN_LINE_WIDTH = "1pt";
	private static final String THICK_LINE_WIDTH = "1.5pt";
	
	public ScoresheetOutputter(final File argOutputFile, final Phase argP) {
		super(argOutputFile, argP);
	}
	
	@Override
	public void outputInternal() {
		getWriter().println("\\documentclass[11pt]{scobolsolo}");
		getWriter().println("\\newgeometry{top=.4in, bottom=.4in, left=.4in, right=.4in}");
		getWriter().println("\\newcommand{\\vstrut}{\\rule{0pt}{0.23in}}");
		getWriter().println("\\setlength{\\tabcolsep}{1pt}");
		getWriter().println();
		getWriter().println("\\begin{document}");
		
		final List<Room> lclRooms = getPhase().getGameRooms(); // comes in sorted
		
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
				
				final List<String> lclSubheadChunks = new ArrayList<>(4);
				lclSubheadChunks.add("Round: " + escape(lclRound.getShortName()));
				lclSubheadChunks.add("Room: " + escape(lclRoom.getShortName()));
				
				final Staff lclLikelyModerator = lclM.determineLikelyModerator();
				if (lclLikelyModerator != null) {
					lclSubheadChunks.add("Moderator: " + escape(lclLikelyModerator.getName()));
				}
				
				if (lclRound.isCardSystem()) {
					lclSubheadChunks.add("Cards: " + escape(lclM.getWinningCard().getShortName()) + " \\textit{\\&} " + escape(lclM.getLosingCard().getShortName()));
				}
				
				getWriter().println(StringUtils.join(lclSubheadChunks, "\\qquad\\qquad "));
				
				getWriter().println();
				getWriter().println("\\textit{If a replacement question is used, clearly indicate what question was replaced.} \\\\");
				getWriter().println();
				
				getWriter().println("\\begin{tabular}{" + thickVerticalLine() + "C{0.60in}|C{0.60in}|C{0.60in}|C{0.60in}|C{1.5in}|C{0.60in}|C{0.60in}|C{0.60in}|C{0.60in}" + thickVerticalLine() + "}");
				thickHorizontalLine();
				getWriter().println("\\multicolumn{4}{" + thickVerticalLine() + "c|}{ } & \\vstrut \\textbf{Name} & \\multicolumn{4}{c" + thickVerticalLine() + "}{ } \\tabularnewline");
				thinHorizontalLine();
				getWriter().println("\\multicolumn{4}{" + thickVerticalLine() + "c|}{ } & \\vstrut \\textbf{School} & \\multicolumn{4}{c" + thickVerticalLine() + "}{ } \\tabularnewline");
				thickHorizontalLine();
				getWriter().println("\\small Correct & \\small Interrupt & \\small Incorrect & \\small No Try & \\# & \\small Correct & \\small Interrupt & \\small Incorrect & \\small No Try \\tabularnewline");
				thickHorizontalLine();
				
				final Packet lclPacket = lclRound.getPacket();
				boolean lclJustDidTiebreaker = false;
				
				final List<Placement> lclPLs = lclPacket.getAllPlacements();
				Placements:
				for (int lclI = 0; lclI < lclPLs.size(); ++lclI) {
					final Placement lclPL = lclPLs.get(lclI);
					// final Placement lclPrev = lclI == 0 ? null : lclPLs.get(lclI-1);
					final Placement lclNext = lclI == lclPLs.size() - 1 ? null : lclPLs.get(lclI+1);
					
					if (lclPL.isTiebreaker()) {
						if (getTournament().isTiebreakerSuddenDeath() && lclJustDidTiebreaker) {
							continue Placements;
						}
						
						getWriter().println("\\vstrut & & & & \\textsc{(tiebreaker)} & & & & \\tabularnewline");
						thickHorizontalLine();
						lclJustDidTiebreaker = true;
					} else {
						lclJustDidTiebreaker = false;
						
						getWriter().println("\\vstrut & & & & \\textbf{" + lclPL.getNumberString() + "} & & & & \\tabularnewline");
						
						if (lclPL.isScorecheckAfter() || lclNext == null || lclNext.isTiebreaker()) {
							thickHorizontalLine();
						} else {
							thinHorizontalLine();
						}
						
						if (lclPL.isScorecheckAfter()) {
							getWriter().println("\\multicolumn{4}{" + thickVerticalLine() + "c|}{ } & \\textsc{score check} & \\multicolumn{3}{c}{ } & \\vstrut \\tabularnewline");
							thickHorizontalLine();
						}
					}
				}
				
				getWriter().println("\\multicolumn{4}{" + thickVerticalLine() + "c|}{ } & \\textbf{TOTAL} & \\multicolumn{3}{c}{ } & \\vstrut \\tabularnewline");
				thickHorizontalLine();
				
				getWriter().println("\\end{tabular}");
				getWriter().println("\\end{center}");
				getWriter().println();
				getWriter().println("\\newpage");
			}
		}
		
		getWriter().println("\\end{document}");
	}
	
	private static String verticalLine(final String argWidth) {
		Validate.notNull(argWidth);
		return "!{\\vrule width " + argWidth + "}";
	}
	
	private static String thickVerticalLine() {
		return verticalLine(THICK_LINE_WIDTH);
	}
	
	private void horizontalLine(final String argWidth) {
		Validate.notNull(argWidth);
		getWriter().println("\\Xhline{" + argWidth + "}");
	}
	
	private void thinHorizontalLine() {
		horizontalLine(THIN_LINE_WIDTH);
	}
	
	private void thickHorizontalLine() {
		horizontalLine(THICK_LINE_WIDTH);
	}
}
