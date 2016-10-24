package com.scobolsolo.output;

import java.io.File;
import java.util.Arrays;

import com.scobolsolo.application.Packet;
import com.scobolsolo.application.Placement;
import com.scobolsolo.application.Question;
import com.scobolsolo.application.Round;
import com.scobolsolo.application.Tournament;

public class ReplacementGuideOutputter extends TournamentSpecificLaTeXOutputter {
	public ReplacementGuideOutputter(final File argOutputFile, final Tournament argT) {
		super(argOutputFile, argT);
	}
	
	@Override
	public void outputInternal() {
		getWriter().println("\\documentclass[11pt]{scobolsolo}");
		getWriter().println("\\usepackage[top=.5in, bottom=.5in, left=.5in, right=.5in]{geometry}");
		getWriter().println("\\renewcommand{\\descriptionlabel}[1]{\\hspace{\\labelsep}#1}");
		getWriter().println();
		getWriter().println("\\begin{document}");
		
		for (final Round lclR : getTournament().getRounds()) {
			getWriter().println("\\begin{center}");
			getWriter().println("\\TournamentTitle{" + escape(getTournament().getName()) + "}");
			getWriter().println("\\end{center}");
			getWriter().println();
			
			getWriter().println("\\textit{If a replacement question is used, be sure to indicate that on the scoresheet.}");
			getWriter().println();
			
			if (getTournament().getReplacementQuestionSocialMediaPolicy() != null) {
				getWriter().println("\\textit{" + getTournament().getReplacementQuestionSocialMediaPolicy() + "}");
				getWriter().println();
			}
			
			getWriter().println("\\section*{Replacements for " + escape(lclR.getName()) + "}");
			
			final Packet lclP = lclR.getPacket();
			
			getWriter().println("\\begin{compactdesc}");
			
			final Placement[] lclPlacements = lclP.createPlacementArray();
			Arrays.sort(lclPlacements);
			
			for (final Placement lclPL : lclPlacements) {
				if (lclPL.isFilled()) {
					final Question lclQ = lclPL.getQuestion();
					final Placement lclReplacement = lclPL.findReplacement();
					
					getWriter().print("\\item[\\#" + escape(String.valueOf(lclPL.getNumber())));
					
					if (lclPL.isTiebreaker()) {
						getWriter().print(" (TB)");
					}
					
					getWriter().println(": \\textit{" + escape(lclQ.getDescription()) + " (" + escape(lclQ.getCategory().getName()) + ")}]\\hfill\\\\");
					
					if (lclReplacement == null || lclReplacement.isEmpty()) {
						getWriter().println("No replacement available; contact the control room for assistance if necessary.");
					} else {
						getWriter().println("Use " + escape(lclReplacement.getPacket().getName()) + " \\#" + escape(String.valueOf(lclReplacement.getNumber())) + ": " + escape(lclReplacement.getQuestion().getDescription()));
					}
					
					getWriter().println();
				}
			}
			
			getWriter().println("\\end{compactdesc}");
			getWriter().println();
			
			getWriter().println("\\newpage");
		}
		
		getWriter().println("\\end{document}");
	}
}
