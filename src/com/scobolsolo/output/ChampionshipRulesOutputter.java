package com.scobolsolo.output;

import java.io.File;

import com.scobolsolo.application.Tournament;

public class ChampionshipRulesOutputter extends TournamentSpecificLaTeXOutputter {
	public ChampionshipRulesOutputter(final File argOutputFile, final Tournament argT) {
		super(argOutputFile, argT);
	}
	
	@Override
	public void outputInternal() {
		getWriter().println("\\documentclass[11pt]{scobolsolo}");
		getWriter().println("\\usepackage[top=.5in, bottom=.5in, left=.5in, right=.5in]{geometry}");
		getWriter().println();
		getWriter().println("\\begin{document}");
		
		getWriter().println("\\begin{center}");
		getWriter().println("\\TournamentTitle{" + escape(getTournament().getName()) + "}");
		getWriter().println();
		getWriter().println();
		getWriter().println("\\Subtitle{Championship Match Rules}");
		getWriter().println("\\end{center}");
		getWriter().println();
		
		if (getTournament().getChampionshipRules() != null) {
			getWriter().println(getTournament().getChampionshipRules()); // Not escaped; this is given in LaTeX
			getWriter().println();
		}
		
		getWriter().println("\\end{document}");
	}
}
